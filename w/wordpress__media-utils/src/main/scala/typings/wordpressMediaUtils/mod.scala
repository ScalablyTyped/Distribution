package typings.wordpressMediaUtils

import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props
import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/media-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def uploadMedia(options: UploadMediaOptions): js.Promise[Unit] = js.native
  @js.native
  object MediaUpload extends js.Object {
    def apply[T /* <: Boolean */](props: Props[T]): Element = js.native
  }
  
}

