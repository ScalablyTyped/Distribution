package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.webextensionPolyfill.webextensionPolyfillStrings.startup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesExperimentsMod {
  
  object Experiments {
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.addon_child
      - typings.webextensionPolyfill.webextensionPolyfillStrings.content_child
      - typings.webextensionPolyfill.webextensionPolyfillStrings.devtools_child
    */
    trait APIChildScope extends StObject
    object APIChildScope {
      
      inline def addon_child: typings.webextensionPolyfill.webextensionPolyfillStrings.addon_child = "addon_child".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.addon_child]
      
      inline def content_child: typings.webextensionPolyfill.webextensionPolyfillStrings.content_child = "content_child".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.content_child]
      
      inline def devtools_child: typings.webextensionPolyfill.webextensionPolyfillStrings.devtools_child = "devtools_child".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.devtools_child]
    }
    
    type APIEvent = startup
    
    type APIEvents = js.Array[APIEvent]
    
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.addon_parent
      - typings.webextensionPolyfill.webextensionPolyfillStrings.content_parent
      - typings.webextensionPolyfill.webextensionPolyfillStrings.devtools_parent
    */
    trait APIParentScope extends StObject
    object APIParentScope {
      
      inline def addon_parent: typings.webextensionPolyfill.webextensionPolyfillStrings.addon_parent = "addon_parent".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.addon_parent]
      
      inline def content_parent: typings.webextensionPolyfill.webextensionPolyfillStrings.content_parent = "content_parent".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.content_parent]
      
      inline def devtools_parent: typings.webextensionPolyfill.webextensionPolyfillStrings.devtools_parent = "devtools_parent".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.devtools_parent]
    }
    
    type APIPath = js.Array[String]
    
    type APIPaths = js.Array[APIPath]
    
    trait ExperimentAPI extends StObject {
      
      /**
        * Optional.
        */
      var child: js.UndefOr[ExperimentAPIChildType] = js.undefined
      
      /**
        * Optional.
        */
      var parent: js.UndefOr[ExperimentAPIParentType] = js.undefined
      
      var schema: ExperimentURL
    }
    object ExperimentAPI {
      
      inline def apply(schema: ExperimentURL): ExperimentAPI = {
        val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExperimentAPI]
      }
      
      extension [Self <: ExperimentAPI](x: Self) {
        
        inline def setChild(value: ExperimentAPIChildType): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
        
        inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
        
        inline def setParent(value: ExperimentAPIParentType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        inline def setSchema(value: ExperimentURL): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      }
    }
    
    trait ExperimentAPIChildType extends StObject {
      
      var paths: APIPaths
      
      var scopes: js.Array[APIChildScope]
      
      var script: ExperimentURL
    }
    object ExperimentAPIChildType {
      
      inline def apply(paths: APIPaths, scopes: js.Array[APIChildScope], script: ExperimentURL): ExperimentAPIChildType = {
        val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExperimentAPIChildType]
      }
      
      extension [Self <: ExperimentAPIChildType](x: Self) {
        
        inline def setPaths(value: APIPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
        
        inline def setPathsVarargs(value: APIPath*): Self = StObject.set(x, "paths", js.Array(value*))
        
        inline def setScopes(value: js.Array[APIChildScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
        
        inline def setScopesVarargs(value: APIChildScope*): Self = StObject.set(x, "scopes", js.Array(value*))
        
        inline def setScript(value: ExperimentURL): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      }
    }
    
    trait ExperimentAPIParentType extends StObject {
      
      /**
        * Optional.
        */
      var events: js.UndefOr[APIEvents] = js.undefined
      
      /**
        * Optional.
        */
      var paths: js.UndefOr[APIPaths] = js.undefined
      
      /**
        * Optional.
        */
      var scopes: js.UndefOr[js.Array[APIParentScope]] = js.undefined
      
      var script: ExperimentURL
    }
    object ExperimentAPIParentType {
      
      inline def apply(script: ExperimentURL): ExperimentAPIParentType = {
        val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExperimentAPIParentType]
      }
      
      extension [Self <: ExperimentAPIParentType](x: Self) {
        
        inline def setEvents(value: APIEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
        
        inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
        
        inline def setEventsVarargs(value: APIEvent*): Self = StObject.set(x, "events", js.Array(value*))
        
        inline def setPaths(value: APIPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
        
        inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
        
        inline def setPathsVarargs(value: APIPath*): Self = StObject.set(x, "paths", js.Array(value*))
        
        inline def setScopes(value: js.Array[APIParentScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
        
        inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
        
        inline def setScopesVarargs(value: APIParentScope*): Self = StObject.set(x, "scopes", js.Array(value*))
        
        inline def setScript(value: ExperimentURL): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      }
    }
    
    type ExperimentURL = String
    
    type Static = StringDictionary[Any]
  }
}
