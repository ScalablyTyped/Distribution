package typings.vegaTypings.sceneMod

import typings.vegaTypings.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneLegendItem extends js.Object {
  var datum: Index
}

object SceneLegendItem {
  @scala.inline
  def apply(datum: Index): SceneLegendItem = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLegendItem]
  }
}

