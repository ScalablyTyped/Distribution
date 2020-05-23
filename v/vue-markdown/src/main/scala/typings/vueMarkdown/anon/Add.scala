package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Add extends js.Object {
  var add: js.Any
  var `match`: js.Any
  var normalize: js.Any
  var pretest: js.Any
  var re: Emailfuzzy
  var set: js.Any
  var test: js.Any
  var testSchemaAt: js.Any
  var tlds: js.Any
}

object Add {
  @scala.inline
  def apply(
    add: js.Any,
    `match`: js.Any,
    normalize: js.Any,
    pretest: js.Any,
    re: Emailfuzzy,
    set: js.Any,
    test: js.Any,
    testSchemaAt: js.Any,
    tlds: js.Any
  ): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], pretest = pretest.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], testSchemaAt = testSchemaAt.asInstanceOf[js.Any], tlds = tlds.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
}

