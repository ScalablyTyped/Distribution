package typings.vegaTypings.anon

import typings.vegaTypings.runtimeRuntimeMod.AccessorParameters
import typings.vegaTypings.runtimeRuntimeMod.AggregateOps
import typings.vegaTypings.runtimeRuntimeMod.OperatorParam
import typings.vegaTypings.runtimeRuntimeMod.OrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As extends StObject {
  
  /**
    * An array of output field names for aggregated values.
    */
  var as: js.UndefOr[OrArray[String | OperatorParam]] = js.undefined
  
  /**
    * A flag indicating that the full cross-product of groupby values should be
    * generated, including empty cells.
    * If true, the drop parameter is ignored and empty cells are retained.
    * Defaults to false
    */
  var cross: js.UndefOr[Boolean | OperatorParam] = js.undefined
  
  /**
    * A flag indicating if empty cells should be removed.
    * Defaults to true
    */
  var drop: js.UndefOr[Boolean | OperatorParam] = js.undefined
  
  /**
    * An array of accessors to aggregate
    * Can only be null if the op is count
    */
  var fields: js.UndefOr[OrArray[AccessorParameters | Null]] = js.undefined
  
  /**
    * An array of accessors to groupby.
    */
  var groupby: js.UndefOr[OrArray[AccessorParameters]] = js.undefined
  
  /**
    * An accessor that should return a string to key by
    * Defaults to concatenating the groupby accessors
    */
  var key: js.UndefOr[AccessorParameters] = js.undefined
  
  /**
    * An array of strings indicating aggregation operations.
    */
  var ops: js.UndefOr[OrArray[AggregateOps | OperatorParam]] = js.undefined
  
  var pulse: OrArray[OperatorParam]
}
object As {
  
  inline def apply(pulse: OrArray[OperatorParam]): As = {
    val __obj = js.Dynamic.literal(pulse = pulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  
  extension [Self <: As](x: Self) {
    
    inline def setAs(value: OrArray[String | OperatorParam]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: (String | OperatorParam)*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setCross(value: Boolean | OperatorParam): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
    
    inline def setCrossUndefined: Self = StObject.set(x, "cross", js.undefined)
    
    inline def setDrop(value: Boolean | OperatorParam): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setFields(value: OrArray[AccessorParameters | Null]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: (AccessorParameters | Null)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGroupby(value: OrArray[AccessorParameters]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: AccessorParameters*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setKey(value: AccessorParameters): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOps(value: OrArray[AggregateOps | OperatorParam]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    inline def setOpsVarargs(value: (AggregateOps | OperatorParam)*): Self = StObject.set(x, "ops", js.Array(value*))
    
    inline def setPulse(value: OrArray[OperatorParam]): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
    
    inline def setPulseVarargs(value: OperatorParam*): Self = StObject.set(x, "pulse", js.Array(value*))
  }
}
