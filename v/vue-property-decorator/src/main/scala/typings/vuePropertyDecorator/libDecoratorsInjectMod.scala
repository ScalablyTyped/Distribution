package typings.vuePropertyDecorator

import typings.vueClassComponent.libUtilMod.VueDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoratorsInjectMod {
  
  @JSImport("vue-property-decorator/lib/decorators/Inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Inject(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Inject")().asInstanceOf[VueDecorator]
  inline def Inject(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InjectKey */ Any
  ): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Inject")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def Inject(options: InjectOptions): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Inject")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  
  trait InjectOptions extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var from: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InjectKey */ Any
      ] = js.undefined
  }
  object InjectOptions {
    
    inline def apply(): InjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectOptions]
    }
    
    extension [Self <: InjectOptions](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setFrom(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InjectKey */ Any
      ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
}
