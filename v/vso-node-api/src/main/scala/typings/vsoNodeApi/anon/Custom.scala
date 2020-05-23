package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custom extends js.Object {
  var custom: scala.Double
  var latestOnBuild: scala.Double
  var latestOnQueue: scala.Double
}

object Custom {
  @scala.inline
  def apply(custom: scala.Double, latestOnBuild: scala.Double, latestOnQueue: scala.Double): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], latestOnBuild = latestOnBuild.asInstanceOf[js.Any], latestOnQueue = latestOnQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
}

