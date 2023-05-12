package typings.vuePropertyDecorator

import org.scalablytyped.runtime.StringDictionary
import typings.vueRuntimeCore.mod.ComponentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersProvideInjectMod {
  
  @JSImport("vue-property-decorator/lib/helpers/provideInject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inheritInjected(
    componentOptions: ComponentOptions[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any, 
      Any, 
      Any, 
      Any, 
      Any, 
      Any, 
      Any, 
      Any, 
      Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inheritInjected")(componentOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def needToProduceProvide(original: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("needToProduceProvide")(original.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def produceProvide(original: Any): ProvideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("produceProvide")(original.asInstanceOf[js.Any]).asInstanceOf[ProvideFunc]
  
  @JSImport("vue-property-decorator/lib/helpers/provideInject", "reactiveInjectKey")
  @js.native
  val reactiveInjectKey: /* "__reactiveInject__" */ String = js.native
  
  type ProvideFunc = (js.ThisFunction0[/* this */ Any, js.Object]) & ProvideObj
  
  trait ProvideObj extends StObject {
    
    var managed: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var managedReactive: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object ProvideObj {
    
    inline def apply(): ProvideObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvideObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvideObj] (val x: Self) extends AnyVal {
      
      inline def setManaged(value: StringDictionary[Any]): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
      
      inline def setManagedReactive(value: StringDictionary[Any]): Self = StObject.set(x, "managedReactive", value.asInstanceOf[js.Any])
      
      inline def setManagedReactiveUndefined: Self = StObject.set(x, "managedReactive", js.undefined)
      
      inline def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
    }
  }
}
