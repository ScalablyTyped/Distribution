package typings.vexflow.Vex.Flow

import typings.vexflow.anon.IncrementPos
import typings.vexflow.anon.MatchedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser extends js.Object {
  var errorPos: js.Any = js.native
  var grammar: js.Any = js.native
  var line: js.Any = js.native
  var pos: js.Any = js.native
  def expect(rules: js.Any): js.Any = js.native
  def expectOne(rule: js.Any): js.Any = js.native
  def expectOne(rule: js.Any, maybe: Boolean): js.Any = js.native
  def expectOneOrMore(rule: js.Any): js.Any = js.native
  def expectOneOrMore(rule: js.Any, maybe: Boolean): js.Any = js.native
  def expectZeroOrMore(rule: js.Any): js.Any = js.native
  def matchFail(returnPos: js.Any): Unit = js.native
  def matchSuccess(): Unit = js.native
  def matchToken(token: js.Any): IncrementPos | MatchedString = js.native
  def matchToken(token: js.Any, noSpace: Boolean): IncrementPos | MatchedString = js.native
  def parse(line: js.Any): js.Any = js.native
}

