package typings.webpackEnv.WebpackModuleApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequireContext extends js.Object {
  
  def apply(id: String): js.Any = js.native
  
  /** The module id of the context module. This may be useful for module.hot.accept. */
  var id: String = js.native
  
  def keys(): js.Array[String] = js.native
  
  def resolve(id: String): String = js.native
}
