package typings.yeomanDashGenerator

import typings.inquirer.Anon_Ui
import typings.inquirer.inquirerMod.PromptModule
import typings.inquirer.inquirerMod.QuestionCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_PromptModule extends js.Object {
  @JSName("promptModule")
  var promptModule_Original: PromptModule = js.native
  /**
    * Prompts the questions to the user.
    */
  def promptModule[T](questions: QuestionCollection[T]): js.Promise[T] with Anon_Ui = js.native
}

