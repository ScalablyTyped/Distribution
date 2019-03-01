package typings
package vueDashServerDashRendererLib.vueDashServerDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleRendererOptions extends RendererOptions {
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  var clientManifest: js.UndefOr[js.Object] = js.undefined
  var runInNewContext: js.UndefOr[
    scala.Boolean | vueDashServerDashRendererLib.vueDashServerDashRendererLibStrings.once
  ] = js.undefined
  var serializer: js.UndefOr[js.Function1[/* state */ js.Object, java.lang.String]] = js.undefined
}

object BundleRendererOptions {
  @scala.inline
  def apply(
    basedir: java.lang.String = null,
    cache: RenderCache = null,
    clientManifest: js.Object = null,
    directives: org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* vnode */ vueLib.typesVnodeMod.VNode, 
        /* dir */ vueLib.typesVnodeMod.VNodeDirective, 
        scala.Unit
      ]
    ] = null,
    inject: js.UndefOr[scala.Boolean] = js.undefined,
    runInNewContext: scala.Boolean | vueDashServerDashRendererLib.vueDashServerDashRendererLibStrings.once = null,
    serializer: js.Function1[/* state */ js.Object, java.lang.String] = null,
    shouldPrefetch: js.Function2[/* file */ java.lang.String, /* type */ java.lang.String, scala.Boolean] = null,
    shouldPreload: js.Function2[/* file */ java.lang.String, /* type */ java.lang.String, scala.Boolean] = null,
    template: java.lang.String = null
  ): BundleRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (clientManifest != null) __obj.updateDynamic("clientManifest")(clientManifest)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (!js.isUndefined(inject)) __obj.updateDynamic("inject")(inject)
    if (runInNewContext != null) __obj.updateDynamic("runInNewContext")(runInNewContext.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer)
    if (shouldPrefetch != null) __obj.updateDynamic("shouldPrefetch")(shouldPrefetch)
    if (shouldPreload != null) __obj.updateDynamic("shouldPreload")(shouldPreload)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[BundleRendererOptions]
  }
}

