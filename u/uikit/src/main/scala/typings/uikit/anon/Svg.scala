package typings.uikit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg extends js.Object {
  var svg: js.Promise[_]
}

object Svg {
  @scala.inline
  def apply(svg: js.Promise[_]): Svg = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Svg]
  }
}

