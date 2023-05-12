package typings.webextensionPolyfill.namespacesDeclarativeNetRequestMod.DeclarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add, remove or replace query key-value pairs. Cannot be specified if 'query' is specified.
  */
trait URLTransformQueryTransformType extends StObject {
  
  /**
    * The list of query key-value pairs to be added or replaced.
    * Optional.
    */
  var addOrReplaceParams: js.UndefOr[js.Array[URLTransformQueryTransformAddOrReplaceParamsItemType]] = js.undefined
  
  /**
    * The list of query keys to be removed.
    * Optional.
    */
  var removeParams: js.UndefOr[js.Array[String]] = js.undefined
}
object URLTransformQueryTransformType {
  
  inline def apply(): URLTransformQueryTransformType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URLTransformQueryTransformType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: URLTransformQueryTransformType] (val x: Self) extends AnyVal {
    
    inline def setAddOrReplaceParams(value: js.Array[URLTransformQueryTransformAddOrReplaceParamsItemType]): Self = StObject.set(x, "addOrReplaceParams", value.asInstanceOf[js.Any])
    
    inline def setAddOrReplaceParamsUndefined: Self = StObject.set(x, "addOrReplaceParams", js.undefined)
    
    inline def setAddOrReplaceParamsVarargs(value: URLTransformQueryTransformAddOrReplaceParamsItemType*): Self = StObject.set(x, "addOrReplaceParams", js.Array(value*))
    
    inline def setRemoveParams(value: js.Array[String]): Self = StObject.set(x, "removeParams", value.asInstanceOf[js.Any])
    
    inline def setRemoveParamsUndefined: Self = StObject.set(x, "removeParams", js.undefined)
    
    inline def setRemoveParamsVarargs(value: String*): Self = StObject.set(x, "removeParams", js.Array(value*))
  }
}
