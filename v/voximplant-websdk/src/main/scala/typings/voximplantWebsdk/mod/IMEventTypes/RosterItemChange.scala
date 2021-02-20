package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.RosterItemEvent
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when roster item changed
  */
@js.native
trait RosterItemChange extends VoxImplantIMEvent {
  
  /**
    *    User display name
    */
  var displayName: String = js.native
  
  /**
    *    Roster item groups
    */
  var groups: js.Array[String] = js.native
  
  /**
    *    User id
    */
  var id: String = js.native
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    *    Roster item event type. See VoxImplant.RosterItemEvent enum
    */
  var `type`: RosterItemEvent = js.native
}
object RosterItemChange {
  
  @scala.inline
  def apply(displayName: String, groups: js.Array[String], id: String, `type`: RosterItemEvent): RosterItemChange = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterItemChange]
  }
  
  @scala.inline
  implicit class RosterItemChangeMutableBuilder[Self <: RosterItemChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setType(value: RosterItemEvent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
