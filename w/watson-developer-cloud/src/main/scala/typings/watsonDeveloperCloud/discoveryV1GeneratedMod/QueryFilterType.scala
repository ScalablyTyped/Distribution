package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryFilterType. */
trait QueryFilterType extends StObject {
  
  /** A comma-separated list of types to exclude. */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A comma-separated list of types to include. All other types are excluded. */
  var include: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryFilterType {
  
  inline def apply(): QueryFilterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFilterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryFilterType] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
