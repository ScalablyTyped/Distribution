package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlObj extends StObject {
  
  var delFlag: js.UndefOr[Boolean | Double] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var url: String
}
object UrlObj {
  
  inline def apply(url: String): UrlObj = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlObj] (val x: Self) extends AnyVal {
    
    inline def setDelFlag(value: Boolean | Double): Self = StObject.set(x, "delFlag", value.asInstanceOf[js.Any])
    
    inline def setDelFlagUndefined: Self = StObject.set(x, "delFlag", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
