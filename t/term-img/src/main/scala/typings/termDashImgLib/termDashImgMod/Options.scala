package typings
package termDashImgLib.termDashImgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[FallbackType]
  extends ansiDashEscapesLib.ansiDashEscapesMod.ImageOptions {
  /**
  		Enables you to do something else when the terminal doesn't support images.
  		@default () => throw new UnsupportedTerminalError()
  		*/
  val fallback: js.UndefOr[js.Function0[FallbackType]] = js.undefined
}

object Options {
  @scala.inline
  def apply[FallbackType](
    fallback: () => FallbackType = null,
    height: typeDashFestLib.typeDashFestMod.LiteralUnion[ansiDashEscapesLib.ansiDashEscapesLibStrings.auto, scala.Double | java.lang.String] = null,
    preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    width: typeDashFestLib.typeDashFestMod.LiteralUnion[ansiDashEscapesLib.ansiDashEscapesLibStrings.auto, scala.Double | java.lang.String] = null
  ): Options[FallbackType] = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction0(fallback))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveAspectRatio)) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[FallbackType]]
  }
}

