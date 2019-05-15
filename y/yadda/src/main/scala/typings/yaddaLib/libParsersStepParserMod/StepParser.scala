package typings
package yaddaLib.libParsersStepParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepParser extends js.Object {
  def parse(text: java.lang.String): js.Array[yaddaLib.libMod.Step] = js.native
  def parse(text: java.lang.String, next: js.Function1[/* steps */ js.Array[yaddaLib.libMod.Step], scala.Unit]): scala.Unit = js.native
}

