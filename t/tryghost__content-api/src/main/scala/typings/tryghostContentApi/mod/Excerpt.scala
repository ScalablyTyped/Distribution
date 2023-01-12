package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excerpt extends StObject {
  
  var custom_excerpt: js.UndefOr[String] = js.undefined
  
  var excerpt: js.UndefOr[String] = js.undefined
}
object Excerpt {
  
  inline def apply(): Excerpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Excerpt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Excerpt] (val x: Self) extends AnyVal {
    
    inline def setCustom_excerpt(value: String): Self = StObject.set(x, "custom_excerpt", value.asInstanceOf[js.Any])
    
    inline def setCustom_excerptUndefined: Self = StObject.set(x, "custom_excerpt", js.undefined)
    
    inline def setExcerpt(value: String): Self = StObject.set(x, "excerpt", value.asInstanceOf[js.Any])
    
    inline def setExcerptUndefined: Self = StObject.set(x, "excerpt", js.undefined)
  }
}
