package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostDeploy extends js.Object {
  var all: Double
  var postDeploy: Double
  var preDeploy: Double
  var undefined: Double
}

object AnonPostDeploy {
  @scala.inline
  def apply(all: Double, postDeploy: Double, preDeploy: Double, undefined: Double): AnonPostDeploy = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], postDeploy = postDeploy.asInstanceOf[js.Any], preDeploy = preDeploy.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPostDeploy]
  }
}

