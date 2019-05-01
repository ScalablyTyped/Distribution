package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromptModule extends js.Object {
  @JSName("promptModule")
  var promptModule_Original: inquirerLib.inquirerMod.PromptModule = js.native
  def promptModule[T](questions: inquirerLib.inquirerMod.Questions[T]): js.Promise[T] with inquirerLib.Anon_Ui = js.native
}

