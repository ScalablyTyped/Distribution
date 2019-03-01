package typings
package vueDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParseRuler extends js.Object {
  var State: js.Any
  var parse: js.Any
  var ruler: Anon_After
  var ruler2: Anon_After
  var skipToken: js.Any
  var tokenize: js.Any
}

object Anon_ParseRuler {
  @scala.inline
  def apply(
    State: js.Any,
    parse: js.Any,
    ruler: Anon_After,
    ruler2: Anon_After,
    skipToken: js.Any,
    tokenize: js.Any
  ): Anon_ParseRuler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("parse")(parse)
    __obj.updateDynamic("ruler")(ruler)
    __obj.updateDynamic("ruler2")(ruler2)
    __obj.updateDynamic("skipToken")(skipToken)
    __obj.updateDynamic("tokenize")(tokenize)
    __obj.asInstanceOf[Anon_ParseRuler]
  }
}

