package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcquisitionOptions extends StObject {
  
  /**
    * Default Operation for the ItemId in this target
    */
  var defaultOperation: AcquisitionOperation = js.native
  
  /**
    * The item id that this options refer to
    */
  var itemId: String = js.native
  
  /**
    * Operations allowed for the ItemId in this target
    */
  var operations: js.Array[AcquisitionOperation] = js.native
  
  /**
    * Additional properties which can be added to the request.
    */
  var properties: js.Any = js.native
  
  /**
    * The target that this options refer to
    */
  var target: String = js.native
}
object AcquisitionOptions {
  
  @scala.inline
  def apply(
    defaultOperation: AcquisitionOperation,
    itemId: String,
    operations: js.Array[AcquisitionOperation],
    properties: js.Any,
    target: String
  ): AcquisitionOptions = {
    val __obj = js.Dynamic.literal(defaultOperation = defaultOperation.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcquisitionOptions]
  }
  
  @scala.inline
  implicit class AcquisitionOptionsMutableBuilder[Self <: AcquisitionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultOperation(value: AcquisitionOperation): Self = StObject.set(x, "defaultOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: js.Array[AcquisitionOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: AcquisitionOperation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
