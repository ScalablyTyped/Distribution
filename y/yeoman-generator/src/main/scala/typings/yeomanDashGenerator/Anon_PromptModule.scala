package typings.yeomanDashGenerator

import typings.inquirer.Anon_Ui
import typings.inquirer.inquirerMod.PromptModule
import typings.inquirer.inquirerMod.Questions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromptModule extends js.Object {
  @JSName("promptModule")
  var promptModule_Original: PromptModule = js.native
  def promptModule[A](questions: Questions[A]): js.Promise[A] with Anon_Ui = js.native
}

