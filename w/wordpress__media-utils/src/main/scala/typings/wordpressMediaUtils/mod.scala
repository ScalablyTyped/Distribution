package typings.wordpressMediaUtils

import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props
import typings.wordpressMediaUtils.uploadMediaMod.UploadMediaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object MediaUpload {
    
    @JSImport("@wordpress/media-utils", "MediaUpload")
    @js.native
    def apply[T /* <: Boolean */](props: Props[T]): Element = js.native
  }
  
  @JSImport("@wordpress/media-utils", "uploadMedia")
  @js.native
  def uploadMedia(options: UploadMediaOptions): js.Promise[Unit] = js.native
}
