package typings.thunderbirdWebextBrowser.messenger

import typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.startup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experiments {
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addon_child
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content_child
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools_child
  */
  trait APIChildScope extends StObject
  object APIChildScope {
    
    inline def addon_child: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addon_child = "addon_child".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addon_child]
    
    inline def content_child: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content_child = "content_child".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content_child]
    
    inline def devtools_child: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools_child = "devtools_child".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools_child]
  }
  
  type APIEvent = startup
  
  type APIEvents = js.Array[APIEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addon_parent
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content_parent
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools_parent
  */
  trait APIParentScope extends StObject
  object APIParentScope {
    
    inline def addon_parent: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addon_parent = "addon_parent".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.addon_parent]
    
    inline def content_parent: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content_parent = "content_parent".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.content_parent]
    
    inline def devtools_parent: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools_parent = "devtools_parent".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.devtools_parent]
  }
  
  type APIPath = js.Array[String]
  
  type APIPaths = js.Array[APIPath]
  
  trait ExperimentAPI extends StObject {
    
    var child: js.UndefOr[ExperimentAPIChild] = js.undefined
    
    var parent: js.UndefOr[ExperimentAPIParent] = js.undefined
    
    var schema: ExperimentURL
  }
  object ExperimentAPI {
    
    inline def apply(schema: ExperimentURL): ExperimentAPI = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExperimentAPI] (val x: Self) extends AnyVal {
      
      inline def setChild(value: ExperimentAPIChild): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setParent(value: ExperimentAPIParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setSchema(value: ExperimentURL): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExperimentAPIChild extends StObject {
    
    var paths: APIPaths
    
    var scopes: js.Array[APIChildScope]
    
    var script: ExperimentURL
  }
  object ExperimentAPIChild {
    
    inline def apply(paths: APIPaths, scopes: js.Array[APIChildScope], script: ExperimentURL): ExperimentAPIChild = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentAPIChild]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExperimentAPIChild] (val x: Self) extends AnyVal {
      
      inline def setPaths(value: APIPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: APIPath*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setScopes(value: js.Array[APIChildScope]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: APIChildScope*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setScript(value: ExperimentURL): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExperimentAPIParent extends StObject {
    
    var events: js.UndefOr[APIEvents] = js.undefined
    
    var paths: js.UndefOr[APIPaths] = js.undefined
    
    var scopes: js.UndefOr[js.Array[APIParentScope]] = js.undefined
    
    var script: ExperimentURL
  }
  object ExperimentAPIParent {
    
    inline def apply(script: ExperimentURL): ExperimentAPIParent = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentAPIParent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExperimentAPIParent] (val x: Self) extends AnyVal {
      
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
}
