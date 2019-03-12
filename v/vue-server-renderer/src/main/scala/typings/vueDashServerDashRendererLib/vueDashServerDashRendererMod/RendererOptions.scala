package typings
package vueDashServerDashRendererLib.vueDashServerDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererOptions extends js.Object {
  var cache: js.UndefOr[RenderCache] = js.undefined
  var directives: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* vnode */ vueLib.typesVnodeMod.VNode, 
        /* dir */ vueLib.typesVnodeMod.VNodeDirective, 
        scala.Unit
      ]
    ]
  ] = js.undefined
  var inject: js.UndefOr[scala.Boolean] = js.undefined
  var shouldPrefetch: js.UndefOr[
    js.Function2[/* file */ java.lang.String, /* type */ java.lang.String, scala.Boolean]
  ] = js.undefined
  var shouldPreload: js.UndefOr[
    js.Function2[/* file */ java.lang.String, /* type */ java.lang.String, scala.Boolean]
  ] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object RendererOptions {
  @scala.inline
  def apply(
    cache: RenderCache = null,
    directives: org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* vnode */ vueLib.typesVnodeMod.VNode, 
        /* dir */ vueLib.typesVnodeMod.VNodeDirective, 
        scala.Unit
      ]
    ] = null,
    inject: js.UndefOr[scala.Boolean] = js.undefined,
    shouldPrefetch: (/* file */ java.lang.String, /* type */ java.lang.String) => scala.Boolean = null,
    shouldPreload: (/* file */ java.lang.String, /* type */ java.lang.String) => scala.Boolean = null,
    template: java.lang.String = null
  ): RendererOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (!js.isUndefined(inject)) __obj.updateDynamic("inject")(inject)
    if (shouldPrefetch != null) __obj.updateDynamic("shouldPrefetch")(js.Any.fromFunction2(shouldPrefetch))
    if (shouldPreload != null) __obj.updateDynamic("shouldPreload")(js.Any.fromFunction2(shouldPreload))
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[RendererOptions]
  }
}

