package typings.telejson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowClass: Boolean
  var allowDate: Boolean
  var allowFunction: Boolean
  var allowRegExp: Boolean
  var allowSymbol: Boolean
  var allowUndefined: Boolean
  var lazyEval: Boolean
  var maxDepth: Double
  var space: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowClass: Boolean,
    allowDate: Boolean,
    allowFunction: Boolean,
    allowRegExp: Boolean,
    allowSymbol: Boolean,
    allowUndefined: Boolean,
    lazyEval: Boolean,
    maxDepth: Double,
    space: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(allowClass = allowClass.asInstanceOf[js.Any], allowDate = allowDate.asInstanceOf[js.Any], allowFunction = allowFunction.asInstanceOf[js.Any], allowRegExp = allowRegExp.asInstanceOf[js.Any], allowSymbol = allowSymbol.asInstanceOf[js.Any], allowUndefined = allowUndefined.asInstanceOf[js.Any], lazyEval = lazyEval.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

