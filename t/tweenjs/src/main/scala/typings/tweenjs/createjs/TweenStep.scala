package typings.tweenjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenStep extends js.Object {
  var d: Double
  var ease: js.Function
  var index: Double
  var next: TweenStep
  var passive: Boolean
  var prev: TweenStep
  var props: TweenProps
  var t: Double
}

object TweenStep {
  @scala.inline
  def apply(
    d: Double,
    ease: js.Function,
    index: Double,
    next: TweenStep,
    passive: Boolean,
    prev: TweenStep,
    props: TweenProps,
    t: Double
  ): TweenStep = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenStep]
  }
}

