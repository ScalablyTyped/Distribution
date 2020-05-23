package typings.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Answers = typings.inquirer.mod.Answers
  type Callback = js.Function1[/* err */ js.Any, scala.Unit]
  type Question[T /* <: typings.yeomanGenerator.mod.Answers */] = typings.inquirer.mod.DistinctQuestion[T] with typings.yeomanGenerator.anon.Store
  type Questions[A /* <: typings.yeomanGenerator.mod.Answers */] = typings.yeomanGenerator.mod.Question[A] | js.Array[typings.yeomanGenerator.mod.Question[A]] | typings.rxjs.mod.Observable_[typings.yeomanGenerator.mod.Question[A]]
}
