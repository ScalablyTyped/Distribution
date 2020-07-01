package typings.systemLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourcesConfiguration extends js.Object {
  var callback: js.Any
  var connector: js.Any
  var levels: js.Array[level]
}

object SourcesConfiguration {
  @scala.inline
  def apply(callback: js.Any, connector: js.Any, levels: js.Array[level]): SourcesConfiguration = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcesConfiguration]
  }
}

