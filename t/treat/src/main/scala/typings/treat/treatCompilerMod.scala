package typings.treat

import typings.treat.anon.ExpireCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treatCompilerMod {
  
  @JSImport("treat/dist/declarations/src/webpack-plugin/treatCompiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(compat: Any): ExpireCache = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(compat.asInstanceOf[js.Any]).asInstanceOf[ExpireCache]
}
