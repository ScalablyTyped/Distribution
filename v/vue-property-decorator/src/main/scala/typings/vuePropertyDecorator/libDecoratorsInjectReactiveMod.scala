package typings.vuePropertyDecorator

import typings.vueClassComponent.libUtilMod.VueDecorator
import typings.vuePropertyDecorator.libDecoratorsInjectMod.InjectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoratorsInjectReactiveMod {
  
  @JSImport("vue-property-decorator/lib/decorators/InjectReactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InjectReactive(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("InjectReactive")().asInstanceOf[VueDecorator]
  inline def InjectReactive(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InjectKey */ Any
  ): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("InjectReactive")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def InjectReactive(options: InjectOptions): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("InjectReactive")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
}
