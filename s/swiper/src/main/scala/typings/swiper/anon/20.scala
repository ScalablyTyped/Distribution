package typings.swiper.anon

import typings.swiper.typesModulesThumbsMod.ThumbsOptions
import typings.vueRuntimeCore.mod.PropConstructor
import typings.vueRuntimeCore.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var default: Unit
  
  var `type`: PropType[ThumbsOptions]
}
object `20` {
  
  inline def apply(default: Unit, `type`: PropType[ThumbsOptions]): `20` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `20`] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Unit): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropType[ThumbsOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => ThumbsOptions): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    inline def setTypeVarargs(value: PropConstructor[ThumbsOptions]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
