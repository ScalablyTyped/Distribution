package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportContentType extends js.Object

/** Specifies the content type of an imported item. */
@JSGlobal("Windows.Media.Import.PhotoImportContentType")
@js.native
object PhotoImportContentType extends js.Object {
  /** The item is an image. */
  @js.native
  sealed trait image extends PhotoImportContentType
  
  /** The content type is unknown. */
  @js.native
  sealed trait unknown extends PhotoImportContentType
  
  /** The item is a video. */
  @js.native
  sealed trait video extends PhotoImportContentType
  
  /* 1 */ val image: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportContentType.image with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportContentType.unknown with Double = js.native
  /* 2 */ val video: typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs.PhotoImportContentType.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportContentType with Double] = js.native
}

