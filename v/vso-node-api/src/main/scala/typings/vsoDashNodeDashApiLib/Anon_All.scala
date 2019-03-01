package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: scala.Double
  var batchedCI: scala.Double
  var checkInShelveset: scala.Double
  var individualCI: scala.Double
  var manual: scala.Double
  var none: scala.Double
  var pullRequest: scala.Double
  var schedule: scala.Double
  var triggered: scala.Double
  var userCreated: scala.Double
  var validateShelveset: scala.Double
}

object Anon_All {
  @scala.inline
  def apply(
    all: scala.Double,
    batchedCI: scala.Double,
    checkInShelveset: scala.Double,
    individualCI: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double,
    triggered: scala.Double,
    userCreated: scala.Double,
    validateShelveset: scala.Double
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("batchedCI")(batchedCI)
    __obj.updateDynamic("checkInShelveset")(checkInShelveset)
    __obj.updateDynamic("individualCI")(individualCI)
    __obj.updateDynamic("manual")(manual)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("pullRequest")(pullRequest)
    __obj.updateDynamic("schedule")(schedule)
    __obj.updateDynamic("triggered")(triggered)
    __obj.updateDynamic("userCreated")(userCreated)
    __obj.updateDynamic("validateShelveset")(validateShelveset)
    __obj.asInstanceOf[Anon_All]
  }
}

