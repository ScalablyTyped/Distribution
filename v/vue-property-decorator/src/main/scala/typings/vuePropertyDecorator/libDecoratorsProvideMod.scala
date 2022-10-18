package typings.vuePropertyDecorator

import typings.vueClassComponent.libUtilMod.VueDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoratorsProvideMod {
  
  @JSImport("vue-property-decorator/lib/decorators/Provide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Provide(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Provide")().asInstanceOf[VueDecorator]
  inline def Provide(key: String): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Provide")(key.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def Provide(key: js.Symbol): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Provide")(key.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
}
