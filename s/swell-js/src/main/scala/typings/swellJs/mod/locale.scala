package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locale {
  
  @JSImport("swell-js", "locale")
  @js.native
  val ^ : js.Any = js.native
  
  inline def select(locale: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def selected(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("selected")().asInstanceOf[js.Promise[String]]
}
