package typings.styledDashJsx.reactMod

import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleHTMLAttributes[T] extends HTMLAttributes[T] {
  var global: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[Boolean] = js.undefined
}

object StyleHTMLAttributes {
  @scala.inline
  def apply[T](
    HTMLAttributes: HTMLAttributes[T] = null,
    global: js.UndefOr[Boolean] = js.undefined,
    jsx: js.UndefOr[Boolean] = js.undefined
  ): StyleHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx)
    __obj.asInstanceOf[StyleHTMLAttributes[T]]
  }
}

