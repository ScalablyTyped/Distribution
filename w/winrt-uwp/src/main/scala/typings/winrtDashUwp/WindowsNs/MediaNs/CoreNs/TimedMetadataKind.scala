package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimedMetadataKind extends js.Object

/** Specifies the types of metadata that may be present in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.TimedMetadataKind")
@js.native
object TimedMetadataKind extends js.Object {
  /** The metadata contains caption text. */
  @js.native
  sealed trait caption extends TimedMetadataKind
  
  /** The metadata contains chapter information. */
  @js.native
  sealed trait chapter extends TimedMetadataKind
  
  /** The metadata contains custom data. */
  @js.native
  sealed trait custom extends TimedMetadataKind
  
  /** The metadata contains data. */
  @js.native
  sealed trait data extends TimedMetadataKind
  
  /** The metadata contains description text. */
  @js.native
  sealed trait description extends TimedMetadataKind
  
  /** The metadata contains subtitle text. */
  @js.native
  sealed trait subtitle extends TimedMetadataKind
  
  /* 0 */ val caption: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedMetadataKind.caption with Double = js.native
  /* 1 */ val chapter: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedMetadataKind.chapter with Double = js.native
  /* 2 */ val custom: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedMetadataKind.custom with Double = js.native
  /* 3 */ val data: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedMetadataKind.data with Double = js.native
  /* 4 */ val description: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedMetadataKind.description with Double = js.native
  /* 5 */ val subtitle: typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs.TimedMetadataKind.subtitle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimedMetadataKind with Double] = js.native
}

