package typings.systemService.anon

import typings.systemLogger.mod.SourcesConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSourcesConfiguration extends js.Object {
  var source: js.UndefOr[SourcesConfiguration] = js.undefined
}

object SourceSourcesConfiguration {
  @scala.inline
  def apply(source: SourcesConfiguration = null): SourceSourcesConfiguration = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSourcesConfiguration]
  }
}

