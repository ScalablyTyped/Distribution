package typings.vueServerRenderer.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpackPluginOptions extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
}

object WebpackPluginOptions {
  @scala.inline
  def apply(filename: String = null): WebpackPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpackPluginOptions]
  }
}

