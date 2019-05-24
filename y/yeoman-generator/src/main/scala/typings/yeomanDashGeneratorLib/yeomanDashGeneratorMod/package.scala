package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yeomanDashGeneratorMod {
  type Answers = inquirerLib.inquirerMod.Answers
  type Callback = js.Function1[/* err */ js.Any, scala.Unit]
  type Question[A /* <: Answers */] = inquirerLib.inquirerMod.Question[A] with yeomanDashGeneratorLib.Anon_Store
  type Questions[A /* <: Answers */] = Question[A] | js.Array[Question[A]] | rxjsLib.rxjsMod.Observable[Question[A]]
}
