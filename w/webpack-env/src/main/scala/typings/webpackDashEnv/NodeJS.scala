package typings.webpackDashEnv

import typings.webpackDashEnv.__WebpackModuleApi.NodeProcess
import typings.webpackDashEnv.__WebpackModuleApi.RequireFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Declare process variable
*/
@JSGlobal("NodeJS")
@js.native
object NodeJS extends js.Object {
  type Module = typings.webpackDashEnv.__WebpackModuleApi.Module
  type Process = NodeProcess
  type Require = RequireFunction
  type RequireResolve = typings.webpackDashEnv.__WebpackModuleApi.RequireResolve
}

