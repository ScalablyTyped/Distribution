package typings.xrm.Xrm

import typings.xrm.xrmStrings.entityrecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for `input` property of returned value from {@link Xrm.Utility.getPageContext Xrm.Utility.getPageContext()}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/xrm-utility/getpagecontext#entity-form External Link: getPageContext (Client API reference)}
  */
trait EntityFormPageContext extends StObject {
  
  /**
    * The parent record that provides default values based on mapped attribute values.
    **/
  var createFromEntity: js.UndefOr[LookupValue] = js.undefined
  
  /**
    * ID of the entity record currently displayed in the form.
    */
  var entityId: js.UndefOr[String] = js.undefined
  
  /**
    * Logical name of the entity currently displayed.
    */
  var entityName: String
  
  /**
    * ID of the currently displayed form.
    */
  var formId: js.UndefOr[String] = js.undefined
  
  /**
    * The current page type.
    */
  var pageType: entityrecord
}
object EntityFormPageContext {
  
  inline def apply(entityName: String): EntityFormPageContext = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any], pageType = "entityrecord")
    __obj.asInstanceOf[EntityFormPageContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityFormPageContext] (val x: Self) extends AnyVal {
    
    inline def setCreateFromEntity(value: LookupValue): Self = StObject.set(x, "createFromEntity", value.asInstanceOf[js.Any])
    
    inline def setCreateFromEntityUndefined: Self = StObject.set(x, "createFromEntity", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
    
    inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
    
    inline def setPageType(value: entityrecord): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
  }
}
