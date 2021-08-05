package typings.vis.mod

import typings.vis.visStrings.Array
import typings.vis.visStrings.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSelectionOptions[T] extends StObject {
  
  /**
    * An array with field names, or an object with current field name
    * and new field name that the field is returned as.
    * By default, all properties of the items are emitted.
    * When fields is defined, only the properties whose name is specified
    * in fields will be included in the returned items.
    */
  var fields: js.UndefOr[js.Array[String] | js.Any] = js.undefined
  
  /**
    * Items can be filtered on specific properties by providing a filter function.
    * A filter function is executed for each of the items in the DataSet,
    * and is called with the item as parameter.
    * The function must return a boolean.
    * All items for which the filter function returns true will be emitted.
    * See section Data Filtering.
    */
  var filter: js.UndefOr[js.Function1[/* item */ T, Boolean]] = js.undefined
  
  /**
    * Order the items by a field name or custom sort function.
    */
  var order: js.UndefOr[String | (js.Function2[/* a */ T, /* b */ T, Double])] = js.undefined
  
  /**
    * Determine the type of output of the get function.
    * Allowed values are 'Array' | 'Object'.
    * The default returnType is an Array.
    * The Object type will return a JSON object with the ID's as keys.
    */
  var returnType: js.UndefOr[Array | Object] = js.undefined
  
  /**
    * An object containing field names as key, and data types as value.
    * By default, the type of the properties of an item are left unchanged.
    * When a field type is specified, this field in the items will be converted to the specified type.
    * This can be used for example to convert ISO strings containing a date to a JavaScript Date object,
    * or convert strings to numbers or vice versa. The available data types are listed in section Data Types.
    */
  var `type`: js.UndefOr[js.Any] = js.undefined
}
object DataSelectionOptions {
  
  inline def apply[T](): DataSelectionOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSelectionOptions[T]]
  }
  
  extension [Self <: DataSelectionOptions[?], T](x: Self & DataSelectionOptions[T]) {
    
    inline def setFields(value: js.Array[String] | js.Any): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setFilter(value: /* item */ T => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrder(value: String | (js.Function2[/* a */ T, /* b */ T, Double])): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderFunction2(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "order", js.Any.fromFunction2(value))
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setReturnType(value: Array | Object): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
