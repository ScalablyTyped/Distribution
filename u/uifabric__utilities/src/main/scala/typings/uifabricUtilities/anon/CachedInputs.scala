package typings.uifabricUtilities.anon

import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachedInputs[TStyleProps, TStyleSet] extends js.Object {
  /** Cache for all style functions. */
  var __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]] = js.native
  /** True if no styles prop or styles from Customizer is passed to wrapped component. */
  var __noStyleOverride__ : Boolean = js.native
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
  @scala.inline
  implicit class CachedInputsOps[Self <: CachedInputs[_, _], TStyleProps, TStyleSet] (val x: Self with (CachedInputs[TStyleProps, TStyleSet])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__cachedInputs__Varargs(value: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): Self = this.set("__cachedInputs__", js.Array(value :_*))
    @scala.inline
    def set__cachedInputs__(value: js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]]): Self = this.set("__cachedInputs__", value.asInstanceOf[js.Any])
    @scala.inline
    def set__noStyleOverride__(value: Boolean): Self = this.set("__noStyleOverride__", value.asInstanceOf[js.Any])
  }
  
}

