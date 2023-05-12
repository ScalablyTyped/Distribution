package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URLTransformQueryTransformAddOrReplaceParamsItemType extends StObject {
  
  var key: String
  
  /**
    * If true, the query key is replaced only if it's already present. Otherwise, the key is also added if it's missing.
    * Optional.
    */
  var replaceOnly: js.UndefOr[Boolean] = js.undefined
  
  var value: String
}
object URLTransformQueryTransformAddOrReplaceParamsItemType {
  
  inline def apply(key: String, value: String): URLTransformQueryTransformAddOrReplaceParamsItemType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLTransformQueryTransformAddOrReplaceParamsItemType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: URLTransformQueryTransformAddOrReplaceParamsItemType] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setReplaceOnly(value: Boolean): Self = StObject.set(x, "replaceOnly", value.asInstanceOf[js.Any])
    
    inline def setReplaceOnlyUndefined: Self = StObject.set(x, "replaceOnly", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
