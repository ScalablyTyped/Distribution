package typings.atUifabricUtilities

import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncPlaceholder extends js.Object {
  var asyncPlaceholder: js.UndefOr[ReactType[_]] = js.undefined
}

object Anon_AsyncPlaceholder {
  @scala.inline
  def apply(asyncPlaceholder: ReactType[_] = null): Anon_AsyncPlaceholder = {
    val __obj = js.Dynamic.literal()
    if (asyncPlaceholder != null) __obj.updateDynamic("asyncPlaceholder")(asyncPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsyncPlaceholder]
  }
}

