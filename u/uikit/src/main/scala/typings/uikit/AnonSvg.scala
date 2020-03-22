package typings.uikit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSvg extends js.Object {
  var svg: js.Promise[_]
}

object AnonSvg {
  @scala.inline
  def apply(svg: js.Promise[_]): AnonSvg = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSvg]
  }
}

