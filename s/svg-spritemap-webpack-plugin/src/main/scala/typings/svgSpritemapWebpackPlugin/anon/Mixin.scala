package typings.svgSpritemapWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mixin extends js.Object {
  var mixin: js.UndefOr[String] = js.undefined
  var sizes: js.UndefOr[String] = js.undefined
  var sprites: js.UndefOr[String] = js.undefined
  var variables: js.UndefOr[String] = js.undefined
}

object Mixin {
  @scala.inline
  def apply(mixin: String = null, sizes: String = null, sprites: String = null, variables: String = null): Mixin = {
    val __obj = js.Dynamic.literal()
    if (mixin != null) __obj.updateDynamic("mixin")(mixin.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (sprites != null) __obj.updateDynamic("sprites")(sprites.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixin]
  }
}

