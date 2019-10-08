package typings.telejson.telejsonMod

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
    maxDepth: Double,
    space: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(allowClass = allowClass, allowDate = allowDate, allowFunction = allowFunction, allowRegExp = allowRegExp, allowSymbol = allowSymbol, allowUndefined = allowUndefined, maxDepth = maxDepth)
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

