package typings.webpackEnv

import typings.webpackEnv.WebpackModuleApi.NodeProcess
import typings.webpackEnv.WebpackModuleApi.RequireFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Declare process variable
*/
@JSGlobal("NodeJS")
@js.native
object NodeJS extends js.Object {
  type Module = typings.webpackEnv.WebpackModuleApi.Module
  type Process = NodeProcess
  type Require = RequireFunction
  type RequireResolve = typings.webpackEnv.WebpackModuleApi.RequireResolve
}

