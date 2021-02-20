package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamSettingsIteration extends TeamSettingsDataContractBase {
  
  /**
    * Attributes such as start and end date
    */
  var attributes: TeamIterationAttributes = js.native
  
  /**
    * Id of the resource
    */
  var id: String = js.native
  
  /**
    * Name of the resource
    */
  var name: String = js.native
  
  /**
    * Relative path of the iteration
    */
  var path: String = js.native
}
object TeamSettingsIteration {
  
  @scala.inline
  def apply(
    _links: js.Any,
    attributes: TeamIterationAttributes,
    id: String,
    name: String,
    path: String,
    url: String
  ): TeamSettingsIteration = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamSettingsIteration]
  }
  
  @scala.inline
  implicit class TeamSettingsIterationMutableBuilder[Self <: TeamSettingsIteration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: TeamIterationAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
