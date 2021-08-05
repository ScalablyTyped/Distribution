package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singletonMod {
  
  @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/singleton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def singleton(): js.Function1[/* target */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")().asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  inline def singleton(isInitWhenCreate: Boolean): js.Function1[/* target */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("singleton")(isInitWhenCreate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
}
