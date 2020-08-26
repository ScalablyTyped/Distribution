package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Add extends js.Object {
  var add: js.Any = js.native
  var `match`: js.Any = js.native
  var normalize: js.Any = js.native
  var pretest: js.Any = js.native
  var re: Emailfuzzy = js.native
  var set: js.Any = js.native
  var test: js.Any = js.native
  var testSchemaAt: js.Any = js.native
  var tlds: js.Any = js.native
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
  @scala.inline
  implicit class AddOps[Self <: Add] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: js.Any): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: js.Any): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalize(value: js.Any): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPretest(value: js.Any): Self = this.set("pretest", value.asInstanceOf[js.Any])
    @scala.inline
    def setRe(value: Emailfuzzy): Self = this.set("re", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: js.Any): Self = this.set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: js.Any): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestSchemaAt(value: js.Any): Self = this.set("testSchemaAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTlds(value: js.Any): Self = this.set("tlds", value.asInstanceOf[js.Any])
  }
  
}

