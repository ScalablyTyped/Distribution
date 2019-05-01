package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yeomanDashGeneratorMod {
  type Answers = inquirerLib.inquirerMod.Answers
  type Callback = js.Function1[/* err */ js.Any, scala.Unit]
  type Questions = Question | js.Array[Question] | rxjsLib.rxjsMod.Observable[Question]
}
