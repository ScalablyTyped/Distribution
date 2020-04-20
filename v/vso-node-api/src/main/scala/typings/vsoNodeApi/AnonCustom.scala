package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustom extends js.Object {
  var custom: Double
  var latestOnBuild: Double
  var latestOnQueue: Double
}

object AnonCustom {
  @scala.inline
  def apply(custom: Double, latestOnBuild: Double, latestOnQueue: Double): AnonCustom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], latestOnBuild = latestOnBuild.asInstanceOf[js.Any], latestOnQueue = latestOnQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustom]
  }
}

