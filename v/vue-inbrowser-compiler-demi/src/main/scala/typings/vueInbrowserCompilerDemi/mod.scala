package typings.vueInbrowserCompilerDemi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-inbrowser-compiler-demi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def h(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("h")().asInstanceOf[Unit]
  
  @JSImport("vue-inbrowser-compiler-demi", "isVue3")
  @js.native
  val isVue3: Boolean = js.native
  
  inline def resolveComponent(name: String): String | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponent")(name.asInstanceOf[js.Any]).asInstanceOf[String | js.Object]
  inline def resolveComponent(name: js.Object): String | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponent")(name.asInstanceOf[js.Any]).asInstanceOf[String | js.Object]
}
