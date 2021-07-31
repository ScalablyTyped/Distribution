package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorRegisterClassMod {
  
  @JSImport("wonder-frp/dist/es2015/definition/typescript/decorator/registerClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerClass(className: String): js.Function1[/* target */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerClass")(className.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
}
