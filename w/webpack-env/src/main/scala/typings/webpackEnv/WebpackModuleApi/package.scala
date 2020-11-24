package typings.webpackEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object WebpackModuleApi {
  
  type ModuleId = java.lang.String | scala.Double
  
  type Require1 = js.Function1[/* id */ java.lang.String, js.Any]
  
  type Require2 = js.Function1[/* id */ java.lang.String, js.Any]
  
  type RequireLambda = typings.webpackEnv.WebpackModuleApi.Require1 with typings.webpackEnv.WebpackModuleApi.Require2
  
  type RequireResolve = js.Function1[/* id */ java.lang.String, java.lang.String | scala.Double]
}
