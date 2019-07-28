package typings.yadda.libParsersStepParserMod

import typings.yadda.libMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepParser extends js.Object {
  def parse(text: String): js.Array[Step] = js.native
  def parse(text: String, next: js.Function1[/* steps */ js.Array[Step], Unit]): Unit = js.native
}

