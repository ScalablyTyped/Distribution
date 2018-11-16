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
  
  val caption: caption with java.lang.String = js.native
  val chapter: chapter with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val data: data with java.lang.String = js.native
  val description: description with java.lang.String = js.native
  val subtitle: subtitle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.TimedMetadataKind with java.lang.String] = js.native
}

