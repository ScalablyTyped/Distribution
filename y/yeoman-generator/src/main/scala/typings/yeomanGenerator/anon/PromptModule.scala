package typings.yeomanGenerator.anon

import typings.inquirer.anon.Ui
import typings.inquirer.mod.QuestionCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptModule extends js.Object {
  @JSName("promptModule")
  var promptModule_Original: typings.inquirer.mod.PromptModule = js.native
  /**
    * Prompts the questions to the user.
    */
  def promptModule[T](questions: QuestionCollection[T]): js.Promise[T] with Ui = js.native
}

