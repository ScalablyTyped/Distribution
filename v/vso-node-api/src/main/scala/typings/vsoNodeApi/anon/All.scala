package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait All extends js.Object {
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

object All {
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
  ): All = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedCI = batchedCI.asInstanceOf[js.Any], checkInShelveset = checkInShelveset.asInstanceOf[js.Any], individualCI = individualCI.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any], userCreated = userCreated.asInstanceOf[js.Any], validateShelveset = validateShelveset.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
}

