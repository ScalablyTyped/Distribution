package typings.vuePropertyDecorator

import typings.vueClassComponent.utilMod.VueDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideReactiveMod {
  
  @JSImport("vue-property-decorator/lib/decorators/ProvideReactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ProvideReactive(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ProvideReactive")().asInstanceOf[VueDecorator]
  inline def ProvideReactive(key: String): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ProvideReactive")(key.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def ProvideReactive(key: js.Symbol): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ProvideReactive")(key.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
}
