package typings.vsoNodeApi.testInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestConfiguration extends js.Object {
  
  /**
    * Area of the configuration
    */
  var area: ShallowReference = js.native
  
  /**
    * Description of the configuration
    */
  var description: String = js.native
  
  /**
    * Id of the configuration
    */
  var id: Double = js.native
  
  /**
    * Is the configuration a default for the test plans
    */
  var isDefault: Boolean = js.native
  
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: IdentityRef = js.native
  
  /**
    * Last Updated Data
    */
  var lastUpdatedDate: Date = js.native
  
  /**
    * Name of the configuration
    */
  var name: String = js.native
  
  /**
    * Project to which the configuration belongs
    */
  var project: ShallowReference = js.native
  
  /**
    * Revision of the the configuration
    */
  var revision: Double = js.native
  
  /**
    * State of the configuration
    */
  var state: TestConfigurationState = js.native
  
  /**
    * Url of Configuration Resource
    */
  var url: String = js.native
  
  /**
    * Dictionary of Test Variable, Selected Value
    */
  var values: js.Array[NameValuePair] = js.native
}
object TestConfiguration {
  
  @scala.inline
  def apply(
    area: ShallowReference,
    description: String,
    id: Double,
    isDefault: Boolean,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: Date,
    name: String,
    project: ShallowReference,
    revision: Double,
    state: TestConfigurationState,
    url: String,
    values: js.Array[NameValuePair]
  ): TestConfiguration = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfiguration]
  }
  
  @scala.inline
  implicit class TestConfigurationOps[Self <: TestConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArea(value: ShallowReference): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedBy(value: IdentityRef): Self = this.set("lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: Date): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: TestConfigurationState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: NameValuePair*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[NameValuePair]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
