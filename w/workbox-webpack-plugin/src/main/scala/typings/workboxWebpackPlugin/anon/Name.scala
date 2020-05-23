package typings.workboxWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var options: js.UndefOr[MaxRetentionTime] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String, options: MaxRetentionTime = null): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

