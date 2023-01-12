package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcParameterMod.ParameterName
import typings.vegaLite.buildSrcSelectionMod.ParameterExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Param
  extends StObject
     with ParameterExtent {
  
  /**
    * If a selection parameter is specified, the field name to extract selected values for
    * when the selection is [projected](https://vega.github.io/vega-lite/docs/selection.html#project) over multiple fields or encodings.
    */
  var field: js.UndefOr[FieldName] = js.undefined
  
  /**
    * The name of a parameter.
    */
  var param: ParameterName
}
object Param {
  
  inline def apply(param: ParameterName): Param = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Param] (val x: Self) extends AnyVal {
    
    inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setParam(value: ParameterName): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
  }
}
