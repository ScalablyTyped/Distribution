package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuild extends js.Object {
  var build: Double
  var xaml: Double
}

object AnonBuild {
  @scala.inline
  def apply(build: Double, xaml: Double): AnonBuild = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], xaml = xaml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuild]
  }
}

