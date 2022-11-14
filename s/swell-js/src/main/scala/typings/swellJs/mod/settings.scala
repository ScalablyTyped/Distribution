package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settings {
  
  @JSImport("swell-js", "settings")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Any]]
  
  inline def load(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[js.Promise[Any]]
  
  inline def menus(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("menus")().asInstanceOf[js.Promise[Any]]
  inline def menus(input: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("menus")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def payments(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("payments")().asInstanceOf[js.Promise[Any]]
}
