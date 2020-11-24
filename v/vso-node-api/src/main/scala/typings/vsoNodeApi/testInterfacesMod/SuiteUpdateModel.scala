package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuiteUpdateModel extends js.Object {
  
  var defaultConfigurations: js.Array[ShallowReference] = js.native
  
  var defaultTesters: js.Array[ShallowReference] = js.native
  
  var inheritDefaultConfigurations: Boolean = js.native
  
  var name: String = js.native
  
  var parent: ShallowReference = js.native
  
  var queryString: String = js.native
}
object SuiteUpdateModel {
  
  @scala.inline
  def apply(
    defaultConfigurations: js.Array[ShallowReference],
    defaultTesters: js.Array[ShallowReference],
    inheritDefaultConfigurations: Boolean,
    name: String,
    parent: ShallowReference,
    queryString: String
  ): SuiteUpdateModel = {
    val __obj = js.Dynamic.literal(defaultConfigurations = defaultConfigurations.asInstanceOf[js.Any], defaultTesters = defaultTesters.asInstanceOf[js.Any], inheritDefaultConfigurations = inheritDefaultConfigurations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteUpdateModel]
  }
  
  @scala.inline
  implicit class SuiteUpdateModelOps[Self <: SuiteUpdateModel] (val x: Self) extends AnyVal {
    
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
    def setDefaultConfigurationsVarargs(value: ShallowReference*): Self = this.set("defaultConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDefaultConfigurations(value: js.Array[ShallowReference]): Self = this.set("defaultConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTestersVarargs(value: ShallowReference*): Self = this.set("defaultTesters", js.Array(value :_*))
    
    @scala.inline
    def setDefaultTesters(value: js.Array[ShallowReference]): Self = this.set("defaultTesters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritDefaultConfigurations(value: Boolean): Self = this.set("inheritDefaultConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ShallowReference): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
  }
}
