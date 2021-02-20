package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuiteUpdateModel extends StObject {
  
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
  implicit class SuiteUpdateModelMutableBuilder[Self <: SuiteUpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultConfigurations(value: js.Array[ShallowReference]): Self = StObject.set(x, "defaultConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultConfigurationsVarargs(value: ShallowReference*): Self = StObject.set(x, "defaultConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDefaultTesters(value: js.Array[ShallowReference]): Self = StObject.set(x, "defaultTesters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTestersVarargs(value: ShallowReference*): Self = StObject.set(x, "defaultTesters", js.Array(value :_*))
    
    @scala.inline
    def setInheritDefaultConfigurations(value: Boolean): Self = StObject.set(x, "inheritDefaultConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ShallowReference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
  }
}
