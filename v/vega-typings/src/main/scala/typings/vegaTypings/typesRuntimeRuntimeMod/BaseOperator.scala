package typings.vegaTypings.typesRuntimeRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.vegaTypingsStrings.input
import typings.vegaTypings.vegaTypingsStrings.output
import typings.vegaTypings.vegaTypingsStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOperator extends StObject {
  
  /**
    * From Scope.finish.annotate
    */
  var data: js.UndefOr[
    StringDictionary[
      js.Array[
        input | output | values | (/* template literal string: index:${string} */ String)
      ]
    ]
  ] = js.undefined
  
  var id: ID
  
  /**
    * A flag indicating if this operator
    * should calculate an update only upon its initial evaluation, then
    * deregister dependencies and suppress all future update invocations.
    * Default is false
    */
  var initonly: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Parameters that are passed into the transform when it is updated.
    * They can either be static values or references to other operators
    */
  var params: js.UndefOr[Parameters] = js.undefined
  
  /**
    * A parent reference to watch for changes
    */
  var parent: js.UndefOr[OperatorParam] = js.undefined
  
  /**
    * A flag indicating if this operator should
    * automatically update (react) when parameter values change. In other words,
    * this flag determines if the operator registers itself as a listener on
    * any upstream operators included in the parameters.
    * Default is true
    */
  var react: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows up from Scope.add but isn't used in the runtime
    */
  var refs: js.UndefOr[Null] = js.undefined
  
  var root: js.UndefOr[Boolean] = js.undefined
  
  var scale: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the signal to bind this to, when the signal is updated, this operator's
    * value is set to the new value
    */
  var signal: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  /**
    * The initial value
    */
  var value: js.UndefOr[Any] = js.undefined
}
object BaseOperator {
  
  inline def apply(id: ID, `type`: String): BaseOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOperator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseOperator] (val x: Self) extends AnyVal {
    
    inline def setData(
      value: StringDictionary[
          js.Array[
            input | output | values | (/* template literal string: index:${string} */ String)
          ]
        ]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitonly(value: Boolean): Self = StObject.set(x, "initonly", value.asInstanceOf[js.Any])
    
    inline def setInitonlyUndefined: Self = StObject.set(x, "initonly", js.undefined)
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setParams(value: Parameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParent(value: OperatorParam): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReact(value: Boolean): Self = StObject.set(x, "react", value.asInstanceOf[js.Any])
    
    inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
    
    inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
