package typings.winrtDashUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportContentType with Double] = js.native
  /* 1 */ @js.native
  object image extends TopLevel[image with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}

