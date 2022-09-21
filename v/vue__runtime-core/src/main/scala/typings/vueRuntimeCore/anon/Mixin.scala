package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.MixinToOptionTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mixin[T] extends StObject {
  
  var Mixin: MixinToOptionTypes[T]
}
object Mixin {
  
  inline def apply[T](Mixin: MixinToOptionTypes[T]): Mixin[T] = {
    val __obj = js.Dynamic.literal(Mixin = Mixin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixin[T]]
  }
  
  extension [Self <: Mixin[?], T](x: Self & Mixin[T]) {
    
    inline def setMixin(value: MixinToOptionTypes[T]): Self = StObject.set(x, "Mixin", value.asInstanceOf[js.Any])
  }
}
