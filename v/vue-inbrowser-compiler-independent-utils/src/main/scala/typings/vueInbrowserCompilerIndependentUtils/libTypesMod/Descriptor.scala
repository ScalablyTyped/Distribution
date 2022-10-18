package typings.vueInbrowserCompilerIndependentUtils.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptor extends StObject {
  
  var `extends`: js.UndefOr[Module] = js.undefined
  
  var mixin: js.UndefOr[Module] = js.undefined
}
object Descriptor {
  
  inline def apply(): Descriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descriptor]
  }
  
  extension [Self <: Descriptor](x: Self) {
    
    inline def setExtends(value: Module): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setMixin(value: Module): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
    
    inline def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
  }
}
