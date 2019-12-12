package typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleOnly
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith280x140Icon
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith280x140IconAndText
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x68Icon
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x68IconAndText
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x92Icon
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWith68x92IconAndText
import typings.winrtDashUwp.Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType.titleWithText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VoiceCommandContentTileType extends js.Object

/** The layout template used to display a content tile on the Cortana canvas. */
@JSGlobal("Windows.ApplicationModel.VoiceCommands.VoiceCommandContentTileType")
@js.native
object VoiceCommandContentTileType extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VoiceCommandContentTileType with Double] = js.native
  /* 0 */ @js.native
  object titleOnly extends TopLevel[titleOnly with Double]
  
  /* 6 */ @js.native
  object titleWith280x140Icon extends TopLevel[titleWith280x140Icon with Double]
  
  /* 7 */ @js.native
  object titleWith280x140IconAndText extends TopLevel[titleWith280x140IconAndText with Double]
  
  /* 2 */ @js.native
  object titleWith68x68Icon extends TopLevel[titleWith68x68Icon with Double]
  
  /* 3 */ @js.native
  object titleWith68x68IconAndText extends TopLevel[titleWith68x68IconAndText with Double]
  
  /* 4 */ @js.native
  object titleWith68x92Icon extends TopLevel[titleWith68x92Icon with Double]
  
  /* 5 */ @js.native
  object titleWith68x92IconAndText extends TopLevel[titleWith68x92IconAndText with Double]
  
  /* 1 */ @js.native
  object titleWithText extends TopLevel[titleWithText with Double]
  
}

