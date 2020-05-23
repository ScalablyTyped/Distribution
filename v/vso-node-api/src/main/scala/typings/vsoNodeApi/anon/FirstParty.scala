package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstParty extends js.Object {
  var all: scala.Double
  var firstParty: scala.Double
  var none: scala.Double
  var preview: scala.Double
  var `private`: scala.Double
  var public: scala.Double
  var released: scala.Double
}

object FirstParty {
  @scala.inline
  def apply(
    all: scala.Double,
    firstParty: scala.Double,
    none: scala.Double,
    preview: scala.Double,
    `private`: scala.Double,
    public: scala.Double,
    released: scala.Double
  ): FirstParty = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], firstParty = firstParty.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstParty]
  }
}

