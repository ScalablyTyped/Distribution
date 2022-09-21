package typings.vueClassComponent

import typings.vueClassComponent.declarationsMod.VueClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("vue-class-component/lib/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectDataFromConstructor(
    vm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
    Component: VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ]
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("collectDataFromConstructor")(vm.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
