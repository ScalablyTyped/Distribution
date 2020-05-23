package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Build extends js.Object {
  var build: scala.Double
  var xaml: scala.Double
}

object Build {
  @scala.inline
  def apply(build: scala.Double, xaml: scala.Double): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], xaml = xaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
}

