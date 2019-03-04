package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllFirstParty extends js.Object {
  var all: scala.Double
  var firstParty: scala.Double
  var none: scala.Double
  var preview: scala.Double
  var `private`: scala.Double
  var public: scala.Double
  var released: scala.Double
}

object Anon_AllFirstParty {
  @scala.inline
  def apply(
    all: scala.Double,
    firstParty: scala.Double,
    none: scala.Double,
    preview: scala.Double,
    `private`: scala.Double,
    public: scala.Double,
    released: scala.Double
  ): Anon_AllFirstParty = {
    val __obj = js.Dynamic.literal(all = all, firstParty = firstParty, none = none, preview = preview, public = public, released = released)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Anon_AllFirstParty]
  }
}

