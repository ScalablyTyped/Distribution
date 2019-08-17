package typings.yeomanDashEnvironment.yeomanDashEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AdapterNs {
  import typings.inquirer.inquirerMod.DistinctQuestion
  import typings.inquirer.inquirerMod.QuestionCollection

  type Answers = typings.inquirer.inquirerMod.Answers
  type Question[T] = DistinctQuestion[T]
  type Questions[T] = QuestionCollection[T]
}
