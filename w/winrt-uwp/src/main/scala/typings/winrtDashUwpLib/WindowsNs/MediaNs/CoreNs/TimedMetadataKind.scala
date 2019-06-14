package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

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
  sealed trait caption
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataKind
  
  /** The metadata contains chapter information. */
  @js.native
  sealed trait chapter
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataKind
  
  /** The metadata contains custom data. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataKind
  
  /** The metadata contains data. */
  @js.native
  sealed trait data
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataKind
  
  /** The metadata contains description text. */
  @js.native
  sealed trait description
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataKind
  
  /** The metadata contains subtitle text. */
  @js.native
  sealed trait subtitle
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataKind
  
  /* 0 */ val caption: caption with scala.Double = js.native
  /* 1 */ val chapter: chapter with scala.Double = js.native
  /* 2 */ val custom: custom with scala.Double = js.native
  /* 3 */ val data: data with scala.Double = js.native
  /* 4 */ val description: description with scala.Double = js.native
  /* 5 */ val subtitle: subtitle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataKind with scala.Double] = js.native
}

