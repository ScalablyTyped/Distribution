package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs

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
  sealed trait titleOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType
  
  /** Item title with wide image. */
  @js.native
  sealed trait titleWith280x140Icon
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType
  
  /** Item title, up to two lines of text, and wide image. */
  @js.native
  sealed trait titleWith280x140IconAndText
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType
  
  /** Item title with small, square image. */
  @js.native
  sealed trait titleWith68x68Icon
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType
  
  /** Item title, up to three lines of text, and small square image. */
  @js.native
  sealed trait titleWith68x68IconAndText
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType
  
  /** Item title with tall image. */
  @js.native
  sealed trait titleWith68x92Icon
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType
  
  /** Item title, up to three lines of text, and tall image. */
  @js.native
  sealed trait titleWith68x92IconAndText
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType
  
  /** Item title with up to three lines of text. */
  @js.native
  sealed trait titleWithText
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType
  
  val titleOnly: titleOnly with java.lang.String = js.native
  val titleWith280x140Icon: titleWith280x140Icon with java.lang.String = js.native
  val titleWith280x140IconAndText: titleWith280x140IconAndText with java.lang.String = js.native
  val titleWith68x68Icon: titleWith68x68Icon with java.lang.String = js.native
  val titleWith68x68IconAndText: titleWith68x68IconAndText with java.lang.String = js.native
  val titleWith68x92Icon: titleWith68x92Icon with java.lang.String = js.native
  val titleWith68x92IconAndText: titleWith68x92IconAndText with java.lang.String = js.native
  val titleWithText: titleWithText with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType with java.lang.String
  ] = js.native
}

