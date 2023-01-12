package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cache args
  */
trait ICacheArgs extends StObject {
  
  var cacheKey: String
  
  var childrenOf: js.UndefOr[Double] = js.undefined
  
  var section: js.UndefOr[String] = js.undefined
}
object ICacheArgs {
  
  inline def apply(cacheKey: String): ICacheArgs = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICacheArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICacheArgs] (val x: Self) extends AnyVal {
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setChildrenOf(value: Double): Self = StObject.set(x, "childrenOf", value.asInstanceOf[js.Any])
    
    inline def setChildrenOfUndefined: Self = StObject.set(x, "childrenOf", js.undefined)
    
    inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
