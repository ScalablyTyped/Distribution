package typings.uifabricUtilities.anon

import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachedInputs[TStyleProps, TStyleSet] extends js.Object {
  /** Cache for all style functions. */
  var __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]]
  /** True if no styles prop or styles from Customizer is passed to wrapped component. */
  var __noStyleOverride__ : Boolean
}

object CachedInputs {
  @scala.inline
  def apply[TStyleProps, TStyleSet](
    __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]],
    __noStyleOverride__ : Boolean
  ): CachedInputs[TStyleProps, TStyleSet] = {
    val __obj = js.Dynamic.literal(__cachedInputs__ = __cachedInputs__.asInstanceOf[js.Any], __noStyleOverride__ = __noStyleOverride__.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedInputs[TStyleProps, TStyleSet]]
  }
}

