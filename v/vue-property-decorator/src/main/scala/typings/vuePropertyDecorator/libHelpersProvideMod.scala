package typings.vuePropertyDecorator

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersProvideMod {
  
  @JSImport("vue-property-decorator/lib/helpers/provide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def needToProduceProvide(original: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("needToProduceProvide")(original.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def produceProvide(original: Any): ProvideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("produceProvide")(original.asInstanceOf[js.Any]).asInstanceOf[ProvideFunc]
  
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
    
    extension [Self <: ProvideObj](x: Self) {
      
      inline def setManaged(value: StringDictionary[Any]): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
      
      inline def setManagedReactive(value: StringDictionary[Any]): Self = StObject.set(x, "managedReactive", value.asInstanceOf[js.Any])
      
      inline def setManagedReactiveUndefined: Self = StObject.set(x, "managedReactive", js.undefined)
      
      inline def setManagedUndefined: Self = StObject.set(x, "managed", js.undefined)
    }
  }
}
