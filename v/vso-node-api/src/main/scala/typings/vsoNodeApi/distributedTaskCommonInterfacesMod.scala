package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributedTaskCommonInterfacesMod {
  
  @js.native
  trait DataSourceBindingBase extends StObject {
    
    var dataSourceName: String = js.native
    
    var endpointId: String = js.native
    
    var endpointUrl: String = js.native
    
    var parameters: StringDictionary[String] = js.native
    
    var resultSelector: String = js.native
    
    var resultTemplate: String = js.native
    
    var target: String = js.native
  }
  object DataSourceBindingBase {
    
    @scala.inline
    def apply(
      dataSourceName: String,
      endpointId: String,
      endpointUrl: String,
      parameters: StringDictionary[String],
      resultSelector: String,
      resultTemplate: String,
      target: String
    ): DataSourceBindingBase = {
      val __obj = js.Dynamic.literal(dataSourceName = dataSourceName.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], endpointUrl = endpointUrl.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], resultSelector = resultSelector.asInstanceOf[js.Any], resultTemplate = resultTemplate.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceBindingBase]
    }
    
    @scala.inline
    implicit class DataSourceBindingBaseMutableBuilder[Self <: DataSourceBindingBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultSelector(value: String): Self = StObject.set(x, "resultSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultTemplate(value: String): Self = StObject.set(x, "resultTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessParameters extends StObject {
    
    var dataSourceBindings: js.Array[DataSourceBindingBase] = js.native
    
    var inputs: js.Array[TaskInputDefinitionBase] = js.native
    
    var sourceDefinitions: js.Array[TaskSourceDefinitionBase] = js.native
  }
  object ProcessParameters {
    
    @scala.inline
    def apply(
      dataSourceBindings: js.Array[DataSourceBindingBase],
      inputs: js.Array[TaskInputDefinitionBase],
      sourceDefinitions: js.Array[TaskSourceDefinitionBase]
    ): ProcessParameters = {
      val __obj = js.Dynamic.literal(dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessParameters]
    }
    
    @scala.inline
    implicit class ProcessParametersMutableBuilder[Self <: ProcessParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataSourceBindings(value: js.Array[DataSourceBindingBase]): Self = StObject.set(x, "dataSourceBindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceBindingsVarargs(value: DataSourceBindingBase*): Self = StObject.set(x, "dataSourceBindings", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: js.Array[TaskInputDefinitionBase]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsVarargs(value: TaskInputDefinitionBase*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setSourceDefinitions(value: js.Array[TaskSourceDefinitionBase]): Self = StObject.set(x, "sourceDefinitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDefinitionsVarargs(value: TaskSourceDefinitionBase*): Self = StObject.set(x, "sourceDefinitions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TaskInputDefinitionBase extends StObject {
    
    var defaultValue: String = js.native
    
    var groupName: String = js.native
    
    var helpMarkDown: String = js.native
    
    var label: String = js.native
    
    var name: String = js.native
    
    var options: StringDictionary[String] = js.native
    
    var properties: StringDictionary[String] = js.native
    
    var required: Boolean = js.native
    
    var `type`: String = js.native
    
    var visibleRule: String = js.native
  }
  object TaskInputDefinitionBase {
    
    @scala.inline
    def apply(
      defaultValue: String,
      groupName: String,
      helpMarkDown: String,
      label: String,
      name: String,
      options: StringDictionary[String],
      properties: StringDictionary[String],
      required: Boolean,
      `type`: String,
      visibleRule: String
    ): TaskInputDefinitionBase = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], helpMarkDown = helpMarkDown.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], visibleRule = visibleRule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInputDefinitionBase]
    }
    
    @scala.inline
    implicit class TaskInputDefinitionBaseMutableBuilder[Self <: TaskInputDefinitionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpMarkDown(value: String): Self = StObject.set(x, "helpMarkDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleRule(value: String): Self = StObject.set(x, "visibleRule", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TaskSourceDefinitionBase extends StObject {
    
    var authKey: String = js.native
    
    var endpoint: String = js.native
    
    var keySelector: String = js.native
    
    var selector: String = js.native
    
    var target: String = js.native
  }
  object TaskSourceDefinitionBase {
    
    @scala.inline
    def apply(authKey: String, endpoint: String, keySelector: String, selector: String, target: String): TaskSourceDefinitionBase = {
      val __obj = js.Dynamic.literal(authKey = authKey.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskSourceDefinitionBase]
    }
    
    @scala.inline
    implicit class TaskSourceDefinitionBaseMutableBuilder[Self <: TaskSourceDefinitionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthKey(value: String): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySelector(value: String): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
