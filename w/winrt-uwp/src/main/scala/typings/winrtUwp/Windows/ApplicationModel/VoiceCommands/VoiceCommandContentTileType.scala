package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VoiceCommandContentTileType extends StObject
/** The layout template used to display a content tile on the Cortana canvas. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType")
@js.native
object VoiceCommandContentTileType extends StObject {
  
  /** Only item title. */
  @js.native
  sealed trait titleOnly extends VoiceCommandContentTileType
  
  /** Item title with wide image. */
  @js.native
  sealed trait titleWith280x140Icon extends VoiceCommandContentTileType
  
  /** Item title, up to two lines of text, and wide image. */
  @js.native
  sealed trait titleWith280x140IconAndText extends VoiceCommandContentTileType
  
  /** Item title with small, square image. */
  @js.native
  sealed trait titleWith68x68Icon extends VoiceCommandContentTileType
  
  /** Item title, up to three lines of text, and small square image. */
  @js.native
  sealed trait titleWith68x68IconAndText extends VoiceCommandContentTileType
  
  /** Item title with tall image. */
  @js.native
  sealed trait titleWith68x92Icon extends VoiceCommandContentTileType
  
  /** Item title, up to three lines of text, and tall image. */
  @js.native
  sealed trait titleWith68x92IconAndText extends VoiceCommandContentTileType
  
  /** Item title with up to three lines of text. */
  @js.native
  sealed trait titleWithText extends VoiceCommandContentTileType
}
