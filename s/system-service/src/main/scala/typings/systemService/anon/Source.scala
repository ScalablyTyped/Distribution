package typings.systemService.anon

import typings.systemLogger.mod.FileConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var source: js.UndefOr[FileConfiguration] = js.undefined
}

object Source {
  @scala.inline
  def apply(source: FileConfiguration = null): Source = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

