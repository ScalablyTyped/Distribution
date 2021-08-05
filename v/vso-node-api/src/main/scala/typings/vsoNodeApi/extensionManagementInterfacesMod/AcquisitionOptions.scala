package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcquisitionOptions extends StObject {
  
  /**
    * Default Operation for the ItemId in this target
    */
  var defaultOperation: AcquisitionOperation
  
  /**
    * The item id that this options refer to
    */
  var itemId: String
  
  /**
    * Operations allowed for the ItemId in this target
    */
  var operations: js.Array[AcquisitionOperation]
  
  /**
    * Additional properties which can be added to the request.
    */
  var properties: js.Any
  
  /**
    * The target that this options refer to
    */
  var target: String
}
object AcquisitionOptions {
  
  inline def apply(
    defaultOperation: AcquisitionOperation,
    itemId: String,
    operations: js.Array[AcquisitionOperation],
    properties: js.Any,
    target: String
  ): AcquisitionOptions = {
    val __obj = js.Dynamic.literal(defaultOperation = defaultOperation.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOptions]
  }
  
  extension [Self <: AcquisitionOptions](x: Self) {
    
    inline def setDefaultOperation(value: AcquisitionOperation): Self = StObject.set(x, "defaultOperation", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: js.Array[AcquisitionOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: AcquisitionOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
