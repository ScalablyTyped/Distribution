package typings.webpack.webpackMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeChunkOptions extends js.Object {
  /** The name or name factory for the runtime chunks. */
  var name: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object RuntimeChunkOptions {
  @scala.inline
  def apply(name: String | (js.Function1[/* repeated */ js.Any, _]) = null): RuntimeChunkOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeChunkOptions]
  }
}

