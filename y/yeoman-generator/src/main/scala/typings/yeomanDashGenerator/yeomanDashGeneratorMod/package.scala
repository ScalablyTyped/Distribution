package typings.yeomanDashGenerator

import typings.rxjs.rxjsMod.Observable
import typings.yeomanDashGenerator.Anon_Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yeomanDashGeneratorMod {
  type Answers = typings.inquirer.inquirerMod.Answers
  type Callback = js.Function1[/* err */ js.Any, Unit]
  type Question[A /* <: Answers */] = typings.inquirer.inquirerMod.Question[A] with Anon_Store
  type Questions[A /* <: Answers */] = Question[A] | js.Array[Question[A]] | Observable[Question[A]]
}
