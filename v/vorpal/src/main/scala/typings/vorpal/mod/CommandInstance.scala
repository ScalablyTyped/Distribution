package typings.vorpal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vorpal", "CommandInstance")
@js.native
class CommandInstance () extends js.Object {
  
  def delimiter(value: String): Unit = js.native
  
  def log(value: String, values: String*): Unit = js.native
  
  def prompt(prompt: js.Array[js.Object]): js.Promise[PromptObject] = js.native
  def prompt(prompt: js.Object): js.Promise[PromptObject] = js.native
}
