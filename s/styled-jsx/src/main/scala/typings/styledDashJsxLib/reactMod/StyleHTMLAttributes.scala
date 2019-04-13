package typings
package styledDashJsxLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleHTMLAttributes[T]
  extends reactLib.reactMod.HTMLAttributes[T] {
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var jsx: js.UndefOr[scala.Boolean] = js.undefined
}

object StyleHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[T] = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    jsx: js.UndefOr[scala.Boolean] = js.undefined
  ): StyleHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx)
    __obj.asInstanceOf[StyleHTMLAttributes[T]]
  }
}

