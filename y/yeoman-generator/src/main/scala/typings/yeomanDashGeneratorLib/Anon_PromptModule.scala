package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromptModule extends js.Object {
  @JSName("promptModule")
  var promptModule_Original: inquirerLib.inquirerMod.PromptModule = js.native
  def promptModule[A](questions: inquirerLib.inquirerMod.Questions[A]): js.Promise[A] with inquirerLib.Anon_Ui = js.native
}

