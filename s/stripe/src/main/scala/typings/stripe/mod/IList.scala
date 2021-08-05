package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IList[T] extends StObject {
  
  /**
    * An array containing the actual response elements, paginated by any request parameters.
    */
  var data: js.Array[T]
  
  /**
    * Whether or not there are more elements available after this set. If false, this set comprises the end of the list.
    */
  var has_more: Boolean
  
  /**
    * Value is 'list'
    */
  var `object`: String
  
  /**
    * The total number of items available. This value is not included by default,
    * but you can request it by specifying ?include[]=total_count
    */
  var total_count: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL for accessing this list.
    */
  var url: String
}
object IList {
  
  inline def apply[T](data: js.Array[T], has_more: Boolean, `object`: String, url: String): IList[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IList[T]]
  }
  
  extension [Self <: IList[?], T](x: Self & IList[T]) {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
