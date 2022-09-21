package typings.treat

import typings.treat.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processCssMod {
  
  @JSImport("treat/dist/declarations/src/webpack-plugin/processCss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(styles: Any, hasMinifyBrowsersFrom: From): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any], hasMinifyBrowsersFrom.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
}
