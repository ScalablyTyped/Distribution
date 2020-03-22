package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverTypes.mod.CompletionItemKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
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
  var valueSet: js.UndefOr[js.Array[CompletionItemKind]] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(valueSet: js.Array[CompletionItemKind] = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (valueSet != null) __obj.updateDynamic("valueSet")(valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

