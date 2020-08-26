package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringifyContext
  extends /* key */ StringDictionary[js.Any] {
  var forceBlockIndent: js.UndefOr[Boolean] = js.native
  var implicitKey: js.UndefOr[Boolean] = js.native
  var inFlow: js.UndefOr[Boolean] = js.native
  var indent: js.UndefOr[String] = js.native
  var indentAtStart: js.UndefOr[Double] = js.native
}

object StringifyContext {
  @scala.inline
  def apply(): StringifyContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyContext]
  }
  @scala.inline
  implicit class StringifyContextOps[Self <: StringifyContext] (val x: Self) extends AnyVal {
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
    def setForceBlockIndent(value: Boolean): Self = this.set("forceBlockIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceBlockIndent: Self = this.set("forceBlockIndent", js.undefined)
    @scala.inline
    def setImplicitKey(value: Boolean): Self = this.set("implicitKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicitKey: Self = this.set("implicitKey", js.undefined)
    @scala.inline
    def setInFlow(value: Boolean): Self = this.set("inFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInFlow: Self = this.set("inFlow", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setIndentAtStart(value: Double): Self = this.set("indentAtStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentAtStart: Self = this.set("indentAtStart", js.undefined)
  }
  
}

