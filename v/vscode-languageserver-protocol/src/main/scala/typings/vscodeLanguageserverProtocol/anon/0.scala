package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.CompletionItemKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  /**
    * The completion item kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    *
    * If this property is not present the client only supports
    * the completion items kinds from `Text` to `Reference` as defined in
    * the initial version of the protocol.
    */
  var valueSet: js.UndefOr[js.Array[CompletionItemKind]] = js.native
}

object `0` {
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setValueSetVarargs(value: CompletionItemKind*): Self = this.set("valueSet", js.Array(value :_*))
    @scala.inline
    def setValueSet(value: js.Array[CompletionItemKind]): Self = this.set("valueSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSet: Self = this.set("valueSet", js.undefined)
  }
  
}

