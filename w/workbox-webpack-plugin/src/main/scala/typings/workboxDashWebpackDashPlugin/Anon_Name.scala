package typings.workboxDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var options: js.UndefOr[Anon_MaxRetentionTime] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String, options: Anon_MaxRetentionTime = null): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Name]
  }
}

