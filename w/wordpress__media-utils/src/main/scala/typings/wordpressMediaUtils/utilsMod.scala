package typings.wordpressMediaUtils

import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/media-utils/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def uploadMedia(options: UploadMediaOptions): js.Promise[Unit] = js.native
}

