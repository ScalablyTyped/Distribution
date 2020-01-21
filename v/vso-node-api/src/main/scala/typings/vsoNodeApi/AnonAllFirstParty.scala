package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllFirstParty extends js.Object {
  var all: Double
  var firstParty: Double
  var none: Double
  var preview: Double
  var `private`: Double
  var public: Double
  var released: Double
}

object AnonAllFirstParty {
  @scala.inline
  def apply(
    all: Double,
    firstParty: Double,
    none: Double,
    preview: Double,
    `private`: Double,
    public: Double,
    released: Double
  ): AnonAllFirstParty = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], firstParty = firstParty.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllFirstParty]
  }
}

