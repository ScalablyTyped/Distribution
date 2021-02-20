package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BehaviorModel extends StObject {
  
  /**
    * Is the behavior abstract (i.e. can not be associated with any work item type)
    */
  var `abstract`: Boolean = js.native
  
  /**
    * Color
    */
  var color: String = js.native
  
  /**
    * Description
    */
  var description: String = js.native
  
  /**
    * Behavior Id
    */
  var id: String = js.native
  
  /**
    * Parent behavior reference
    */
  var inherits: WorkItemBehaviorReference = js.native
  
  /**
    * Behavior Name
    */
  var name: String = js.native
  
  /**
    * Is the behavior overrides a behavior from system process
    */
  var overridden: Boolean = js.native
  
  /**
    * Rank
    */
  var rank: Double = js.native
  
  /**
    * Url of the behavior
    */
  var url: String = js.native
}
object BehaviorModel {
  
  @scala.inline
  def apply(
    `abstract`: Boolean,
    color: String,
    description: String,
    id: String,
    inherits: WorkItemBehaviorReference,
    name: String,
    overridden: Boolean,
    rank: Double,
    url: String
  ): BehaviorModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorModel]
  }
  
  @scala.inline
  implicit class BehaviorModelMutableBuilder[Self <: BehaviorModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherits(value: WorkItemBehaviorReference): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridden(value: Boolean): Self = StObject.set(x, "overridden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
