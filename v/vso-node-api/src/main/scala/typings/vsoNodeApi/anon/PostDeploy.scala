package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostDeploy extends js.Object {
  var all: scala.Double
  var postDeploy: scala.Double
  var preDeploy: scala.Double
  var undefined: scala.Double
}

object PostDeploy {
  @scala.inline
  def apply(all: scala.Double, postDeploy: scala.Double, preDeploy: scala.Double, undefined: scala.Double): PostDeploy = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], postDeploy = postDeploy.asInstanceOf[js.Any], preDeploy = preDeploy.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostDeploy]
  }
}

