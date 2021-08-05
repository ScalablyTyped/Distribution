package typings.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributedTaskCommonInterfacesMod {
  
  trait DataSourceBindingBase extends StObject {
    
    var dataSourceName: String
    
    var endpointId: String
    
    var endpointUrl: String
    
    var parameters: StringDictionary[String]
    
    var resultSelector: String
    
    var resultTemplate: String
    
    var target: String
  }
  object DataSourceBindingBase {
    
    inline def apply(
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
    
    extension [Self <: DataSourceBindingBase](x: Self) {
      
      inline def setDataSourceName(value: String): Self = StObject.set(x, "dataSourceName", value.asInstanceOf[js.Any])
      
      inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
      
      inline def setEndpointUrl(value: String): Self = StObject.set(x, "endpointUrl", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setResultSelector(value: String): Self = StObject.set(x, "resultSelector", value.asInstanceOf[js.Any])
      
      inline def setResultTemplate(value: String): Self = StObject.set(x, "resultTemplate", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessParameters extends StObject {
    
    var dataSourceBindings: js.Array[DataSourceBindingBase]
    
    var inputs: js.Array[TaskInputDefinitionBase]
    
    var sourceDefinitions: js.Array[TaskSourceDefinitionBase]
  }
  object ProcessParameters {
    
    inline def apply(
      dataSourceBindings: js.Array[DataSourceBindingBase],
      inputs: js.Array[TaskInputDefinitionBase],
      sourceDefinitions: js.Array[TaskSourceDefinitionBase]
    ): ProcessParameters = {
      val __obj = js.Dynamic.literal(dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], sourceDefinitions = sourceDefinitions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessParameters]
    }
    
    extension [Self <: ProcessParameters](x: Self) {
      
      inline def setDataSourceBindings(value: js.Array[DataSourceBindingBase]): Self = StObject.set(x, "dataSourceBindings", value.asInstanceOf[js.Any])
      
      inline def setDataSourceBindingsVarargs(value: DataSourceBindingBase*): Self = StObject.set(x, "dataSourceBindings", js.Array(value :_*))
      
      inline def setInputs(value: js.Array[TaskInputDefinitionBase]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsVarargs(value: TaskInputDefinitionBase*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      inline def setSourceDefinitions(value: js.Array[TaskSourceDefinitionBase]): Self = StObject.set(x, "sourceDefinitions", value.asInstanceOf[js.Any])
      
      inline def setSourceDefinitionsVarargs(value: TaskSourceDefinitionBase*): Self = StObject.set(x, "sourceDefinitions", js.Array(value :_*))
    }
  }
  
  trait TaskInputDefinitionBase extends StObject {
    
    var defaultValue: String
    
    var groupName: String
    
    var helpMarkDown: String
    
    var label: String
    
    var name: String
    
    var options: StringDictionary[String]
    
    var properties: StringDictionary[String]
    
    var required: Boolean
    
    var `type`: String
    
    var visibleRule: String
  }
  object TaskInputDefinitionBase {
    
    inline def apply(
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
    
    extension [Self <: TaskInputDefinitionBase](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setHelpMarkDown(value: String): Self = StObject.set(x, "helpMarkDown", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StringDictionary[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisibleRule(value: String): Self = StObject.set(x, "visibleRule", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskSourceDefinitionBase extends StObject {
    
    var authKey: String
    
    var endpoint: String
    
    var keySelector: String
    
    var selector: String
    
    var target: String
  }
  object TaskSourceDefinitionBase {
    
    inline def apply(authKey: String, endpoint: String, keySelector: String, selector: String, target: String): TaskSourceDefinitionBase = {
      val __obj = js.Dynamic.literal(authKey = authKey.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskSourceDefinitionBase]
    }
    
    extension [Self <: TaskSourceDefinitionBase](x: Self) {
      
      inline def setAuthKey(value: String): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setKeySelector(value: String): Self = StObject.set(x, "keySelector", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
