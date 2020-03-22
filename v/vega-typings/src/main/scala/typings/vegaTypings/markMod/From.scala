package typings.vegaTypings.markMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends FromFacet {
  var data: js.UndefOr[String] = js.undefined
}

object From {
  @scala.inline
  def apply(data: String = null): From = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

