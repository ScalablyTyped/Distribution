package typings.yeomanGenerator

import typings.inquirer.AnonUi
import typings.inquirer.mod.PromptModule
import typings.inquirer.mod.QuestionCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPromptModule extends js.Object {
  @JSName("promptModule")
  var promptModule_Original: PromptModule = js.native
  /**
    * Prompts the questions to the user.
    */
  def promptModule[T](questions: QuestionCollection[T]): js.Promise[T] with AnonUi = js.native
}

