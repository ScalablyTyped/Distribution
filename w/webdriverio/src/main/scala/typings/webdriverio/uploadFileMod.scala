package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadFileMod {
  
  @JSImport("webdriverio/build/commands/browser/uploadFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(localPath: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(localPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
