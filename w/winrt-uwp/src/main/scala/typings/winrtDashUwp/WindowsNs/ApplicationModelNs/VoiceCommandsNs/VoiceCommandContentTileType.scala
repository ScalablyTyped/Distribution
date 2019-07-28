package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs

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
  
  /* 0 */ val titleOnly: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType.titleOnly with Double = js.native
  /* 6 */ val titleWith280x140Icon: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType.titleWith280x140Icon with Double = js.native
  /* 7 */ val titleWith280x140IconAndText: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType.titleWith280x140IconAndText with Double = js.native
  /* 2 */ val titleWith68x68Icon: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType.titleWith68x68Icon with Double = js.native
  /* 3 */ val titleWith68x68IconAndText: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType.titleWith68x68IconAndText with Double = js.native
  /* 4 */ val titleWith68x92Icon: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType.titleWith68x92Icon with Double = js.native
  /* 5 */ val titleWith68x92IconAndText: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType.titleWith68x92IconAndText with Double = js.native
  /* 1 */ val titleWithText: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.VoiceCommandsNs.VoiceCommandContentTileType.titleWithText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VoiceCommandContentTileType with Double] = js.native
}

