package typings.vsoNodeApi.coreInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectInfo extends StObject {
  
  var abbreviation: String = js.native
  
  var description: String = js.native
  
  var id: String = js.native
  
  var lastUpdateTime: Date = js.native
  
  var name: String = js.native
  
  var properties: js.Array[ProjectProperty] = js.native
  
  /**
    * Current revision of the project
    */
  var revision: Double = js.native
  
  var state: js.Any = js.native
  
  var uri: String = js.native
  
  var version: Double = js.native
  
  var visibility: ProjectVisibility = js.native
}
object ProjectInfo {
  
  @scala.inline
  def apply(
    abbreviation: String,
    description: String,
    id: String,
    lastUpdateTime: Date,
    name: String,
    properties: js.Array[ProjectProperty],
    revision: Double,
    state: js.Any,
    uri: String,
    version: Double,
    visibility: ProjectVisibility
  ): ProjectInfo = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectInfo]
  }
  
  @scala.inline
  implicit class ProjectInfoMutableBuilder[Self <: ProjectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbbreviation(value: String): Self = StObject.set(x, "abbreviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTime(value: Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Array[ProjectProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: ProjectProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: ProjectVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
