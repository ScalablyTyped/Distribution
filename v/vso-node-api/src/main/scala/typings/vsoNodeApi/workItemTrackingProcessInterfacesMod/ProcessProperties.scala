package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessProperties extends StObject {
  
  /**
    * Class of the process
    */
  var `class`: ProcessClass = js.native
  
  /**
    * Is the process default process
    */
  var isDefault: Boolean = js.native
  
  /**
    * Is the process enabled
    */
  var isEnabled: Boolean = js.native
  
  /**
    * ID of the parent process
    */
  var parentProcessTypeId: String = js.native
  
  /**
    * Version of the process
    */
  var version: String = js.native
}
object ProcessProperties {
  
  @scala.inline
  def apply(
    `class`: ProcessClass,
    isDefault: Boolean,
    isEnabled: Boolean,
    parentProcessTypeId: String,
    version: String
  ): ProcessProperties = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], parentProcessTypeId = parentProcessTypeId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessProperties]
  }
  
  @scala.inline
  implicit class ProcessPropertiesMutableBuilder[Self <: ProcessProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: ProcessClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentProcessTypeId(value: String): Self = StObject.set(x, "parentProcessTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
