package typings.tweenjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenAction extends js.Object {
  var d: Double
  var funct: js.Function
  var next: TweenAction
  var params: js.Array[_]
  var prev: TweenAction
  var scope: js.Any
  var t: Double
}

object TweenAction {
  @scala.inline
  def apply(
    d: Double,
    funct: js.Function,
    next: TweenAction,
    params: js.Array[_],
    prev: TweenAction,
    scope: js.Any,
    t: Double
  ): TweenAction = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], funct = funct.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenAction]
  }
}

