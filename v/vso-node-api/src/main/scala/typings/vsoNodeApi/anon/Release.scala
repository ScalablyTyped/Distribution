package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Release extends js.Object {
  var build: scala.Double
  var release: scala.Double
}

object Release {
  @scala.inline
  def apply(build: scala.Double, release: scala.Double): Release = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
}

