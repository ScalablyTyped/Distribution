package typings.swiper.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNames extends StObject {
  
  var classNames: String
  
  var index: Double
  
  var slideEl: HTMLElement
}
object ClassNames {
  
  inline def apply(classNames: String, index: Double, slideEl: HTMLElement): ClassNames = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], slideEl = slideEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassNames] (val x: Self) extends AnyVal {
    
    inline def setClassNames(value: String): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSlideEl(value: HTMLElement): Self = StObject.set(x, "slideEl", value.asInstanceOf[js.Any])
  }
}
