package typings.swaggerUiReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Plugin = js.Object | typings.swaggerUiReact.mod.PluginGenerator
  
  type PluginGenerator = js.Function1[/* system */ typings.swaggerUiReact.mod.System, js.Object]
  
  type Request = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Response = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type SwaggerUI = typings.react.mod.Component[typings.swaggerUiReact.mod.SwaggerUIProps, js.Object, js.Any]
  
  type System = js.Any
}
