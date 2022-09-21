package typings.vueClassComponent

import typings.vueClassComponent.declarationsMod.VueClass
import typings.vueRuntimeCore.mod.ComponentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("vue-class-component/lib/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def componentFactory(
    Component: VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ]
  ): VueClass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(Component.asInstanceOf[js.Any]).asInstanceOf[VueClass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
  ]]
  inline def componentFactory(
    Component: VueClass[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
    ],
    options: ComponentOptions[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
      Any, 
      Any, 
      Any, 
      Any, 
      Any, 
      Any, 
      Any
    ]
  ): VueClass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("componentFactory")(Component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueClass[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any
  ]]
  
  @JSImport("vue-class-component/lib/component", "$internalHooks")
  @js.native
  val internalHooks: js.Array[String] = js.native
}
