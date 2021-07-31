package typings.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptor extends StObject {
  
  var `extends`: js.UndefOr[Module] = js.undefined
  
  var mixin: js.UndefOr[Module] = js.undefined
}
object Descriptor {
  
  @scala.inline
  def apply(): Descriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descriptor]
  }
  
  @scala.inline
  implicit class DescriptorMutableBuilder[Self <: Descriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtends(value: Module): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    @scala.inline
    def setMixin(value: Module): Self = StObject.set(x, "mixin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinUndefined: Self = StObject.set(x, "mixin", js.undefined)
  }
}
