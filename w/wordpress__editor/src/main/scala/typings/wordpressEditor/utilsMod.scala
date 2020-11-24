package typings.wordpressEditor

import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/editor/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def cleanForSlug(slug: String): String = js.native
  
  def mediaUpload(options: UploadMediaOptions): js.Promise[Unit] = js.native
}
