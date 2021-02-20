package typings.wordpressEditor

import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@wordpress/editor/utils", "cleanForSlug")
  @js.native
  def cleanForSlug(slug: String): String = js.native
  
  @JSImport("@wordpress/editor/utils", "mediaUpload")
  @js.native
  def mediaUpload(options: UploadMediaOptions): js.Promise[Unit] = js.native
}
