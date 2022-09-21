package typings.vuePropertyDecorator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersInjectMod {
  
  @JSImport("vue-property-decorator/lib/helpers/inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inheritInjected(
    componentOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentOptions<Vue> */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inheritInjected")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("vue-property-decorator/lib/helpers/inject", "reactiveInjectKey")
  @js.native
  val reactiveInjectKey: /* "__reactiveInject__" */ String = js.native
}
