package typings
package vueDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  var add: js.Any
  var `match`: js.Any
  var normalize: js.Any
  var pretest: js.Any
  var re: Anon_Emailfuzzy
  var set: js.Any
  var test: js.Any
  var testSchemaAt: js.Any
  var tlds: js.Any
}

object Anon_Add {
  @scala.inline
  def apply(
    add: js.Any,
    `match`: js.Any,
    normalize: js.Any,
    pretest: js.Any,
    re: Anon_Emailfuzzy,
    set: js.Any,
    test: js.Any,
    testSchemaAt: js.Any,
    tlds: js.Any
  ): Anon_Add = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("pretest")(pretest)
    __obj.updateDynamic("re")(re)
    __obj.updateDynamic("set")(set)
    __obj.updateDynamic("test")(test)
    __obj.updateDynamic("testSchemaAt")(testSchemaAt)
    __obj.updateDynamic("tlds")(tlds)
    __obj.asInstanceOf[Anon_Add]
  }
}

