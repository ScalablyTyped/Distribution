package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardFieldSettings extends StObject {
  
  /**
    * A collection of field information of additional fields on cards. The index in the collection signifies the order of the field among the additional fields. Currently unused. Should be used with User Story 691539: Card setting: additional fields
    */
  var additionalFields: js.Array[FieldInfo]
  
  /**
    * Display format for the assigned to field
    */
  var assignedToDisplayFormat: IdentityDisplayFormat
  
  /**
    * A collection of field information of rendered core fields on cards.
    */
  var coreFields: js.Array[FieldInfo]
  
  /**
    * Flag indicating whether to show assigned to field on cards. When true, AssignedToDisplayFormat will determine how the field will be displayed
    */
  var showAssignedTo: Boolean
  
  /**
    * Flag indicating whether to show empty fields on cards
    */
  var showEmptyFields: Boolean
  
  /**
    * Flag indicating whether to show ID on cards
    */
  var showId: Boolean
  
  /**
    * Flag indicating whether to show state field on cards
    */
  var showState: Boolean
  
  /**
    * Flag indicating whether to show tags on cards
    */
  var showTags: Boolean
}
object CardFieldSettings {
  
  inline def apply(
    additionalFields: js.Array[FieldInfo],
    assignedToDisplayFormat: IdentityDisplayFormat,
    coreFields: js.Array[FieldInfo],
    showAssignedTo: Boolean,
    showEmptyFields: Boolean,
    showId: Boolean,
    showState: Boolean,
    showTags: Boolean
  ): CardFieldSettings = {
    val __obj = js.Dynamic.literal(additionalFields = additionalFields.asInstanceOf[js.Any], assignedToDisplayFormat = assignedToDisplayFormat.asInstanceOf[js.Any], coreFields = coreFields.asInstanceOf[js.Any], showAssignedTo = showAssignedTo.asInstanceOf[js.Any], showEmptyFields = showEmptyFields.asInstanceOf[js.Any], showId = showId.asInstanceOf[js.Any], showState = showState.asInstanceOf[js.Any], showTags = showTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFieldSettings]
  }
  
  extension [Self <: CardFieldSettings](x: Self) {
    
    inline def setAdditionalFields(value: js.Array[FieldInfo]): Self = StObject.set(x, "additionalFields", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFieldsVarargs(value: FieldInfo*): Self = StObject.set(x, "additionalFields", js.Array(value*))
    
    inline def setAssignedToDisplayFormat(value: IdentityDisplayFormat): Self = StObject.set(x, "assignedToDisplayFormat", value.asInstanceOf[js.Any])
    
    inline def setCoreFields(value: js.Array[FieldInfo]): Self = StObject.set(x, "coreFields", value.asInstanceOf[js.Any])
    
    inline def setCoreFieldsVarargs(value: FieldInfo*): Self = StObject.set(x, "coreFields", js.Array(value*))
    
    inline def setShowAssignedTo(value: Boolean): Self = StObject.set(x, "showAssignedTo", value.asInstanceOf[js.Any])
    
    inline def setShowEmptyFields(value: Boolean): Self = StObject.set(x, "showEmptyFields", value.asInstanceOf[js.Any])
    
    inline def setShowId(value: Boolean): Self = StObject.set(x, "showId", value.asInstanceOf[js.Any])
    
    inline def setShowState(value: Boolean): Self = StObject.set(x, "showState", value.asInstanceOf[js.Any])
    
    inline def setShowTags(value: Boolean): Self = StObject.set(x, "showTags", value.asInstanceOf[js.Any])
  }
}
