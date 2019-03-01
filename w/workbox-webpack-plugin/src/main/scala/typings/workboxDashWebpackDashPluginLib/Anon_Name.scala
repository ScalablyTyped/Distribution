package typings
package workboxDashWebpackDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var options: js.UndefOr[Anon_MaxRetentionTime] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, options: Anon_MaxRetentionTime = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Name]
  }
}

