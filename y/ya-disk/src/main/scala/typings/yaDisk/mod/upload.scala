package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upload {
  
  @JSImport("ya-disk", "upload")
  @js.native
  val ^ : js.Any = js.native
  
  inline def link(token: String, path: String): js.Promise[Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Link]]
  inline def link(token: String, path: String, overwrite: Boolean): js.Promise[Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Link]]
  
  inline def remoteFile(token: String, url: String, path: String): js.Promise[Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("remoteFile")(token.asInstanceOf[js.Any], url.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Link]]
}
