package typings.vueDocgenApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacherMod {
  
  @JSImport("vue-docgen-api/dist/utils/cacher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](creator: js.Function0[T], argsKey: String*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(creator.asInstanceOf[js.Any], argsKey.asInstanceOf[js.Any])).asInstanceOf[T]
}
