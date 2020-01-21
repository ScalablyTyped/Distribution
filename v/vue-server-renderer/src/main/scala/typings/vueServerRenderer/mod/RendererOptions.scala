package typings.vueServerRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererOptions extends js.Object {
  var cache: js.UndefOr[RenderCache] = js.undefined
  var directives: js.UndefOr[
    StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]]
  ] = js.undefined
  var inject: js.UndefOr[Boolean] = js.undefined
  var shouldPrefetch: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.undefined
  var shouldPreload: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object RendererOptions {
  @scala.inline
  def apply(
    cache: RenderCache = null,
    directives: StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]] = null,
    inject: js.UndefOr[Boolean] = js.undefined,
    shouldPrefetch: (/* file */ String, /* type */ String) => Boolean = null,
    shouldPreload: (/* file */ String, /* type */ String) => Boolean = null,
    template: String = null
  ): RendererOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(inject)) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (shouldPrefetch != null) __obj.updateDynamic("shouldPrefetch")(js.Any.fromFunction2(shouldPrefetch))
    if (shouldPreload != null) __obj.updateDynamic("shouldPreload")(js.Any.fromFunction2(shouldPreload))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererOptions]
  }
}

