package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerClassMod {
  
  @JSImport("wonder-frp/dist/commonjs/definition/typescript/decorator/registerClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerClass(className: String): js.Function1[/* target */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerClass")(className.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ Any, Unit]]
}
