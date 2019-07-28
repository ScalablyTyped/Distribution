package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: Double
  var batchedCI: Double
  var checkInShelveset: Double
  var individualCI: Double
  var manual: Double
  var none: Double
  var pullRequest: Double
  var schedule: Double
  var triggered: Double
  var userCreated: Double
  var validateShelveset: Double
}

object Anon_All {
  @scala.inline
  def apply(
    all: Double,
    batchedCI: Double,
    checkInShelveset: Double,
    individualCI: Double,
    manual: Double,
    none: Double,
    pullRequest: Double,
    schedule: Double,
    triggered: Double,
    userCreated: Double,
    validateShelveset: Double
  ): Anon_All = {
    val __obj = js.Dynamic.literal(all = all, batchedCI = batchedCI, checkInShelveset = checkInShelveset, individualCI = individualCI, manual = manual, none = none, pullRequest = pullRequest, schedule = schedule, triggered = triggered, userCreated = userCreated, validateShelveset = validateShelveset)
  
    __obj.asInstanceOf[Anon_All]
  }
}

