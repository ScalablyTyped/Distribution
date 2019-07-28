package typings.vueDashServerDashRenderer.vueDashServerDashRendererMod

import org.scalablytyped.runtime.StringDictionary
import typings.vue.typesVnodeMod.VNode
import typings.vue.typesVnodeMod.VNodeDirective
import typings.vueDashServerDashRenderer.vueDashServerDashRendererStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleRendererOptions extends RendererOptions {
  var basedir: js.UndefOr[String] = js.undefined
  var clientManifest: js.UndefOr[js.Object] = js.undefined
  var runInNewContext: js.UndefOr[Boolean | once] = js.undefined
  var serializer: js.UndefOr[js.Function1[/* state */ js.Object, String]] = js.undefined
}

object BundleRendererOptions {
  @scala.inline
  def apply(
    basedir: String = null,
    cache: RenderCache = null,
    clientManifest: js.Object = null,
    directives: StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]] = null,
    inject: js.UndefOr[Boolean] = js.undefined,
    runInNewContext: Boolean | once = null,
    serializer: /* state */ js.Object => String = null,
    shouldPrefetch: (/* file */ String, /* type */ String) => Boolean = null,
    shouldPreload: (/* file */ String, /* type */ String) => Boolean = null,
    template: String = null
  ): BundleRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (clientManifest != null) __obj.updateDynamic("clientManifest")(clientManifest)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (!js.isUndefined(inject)) __obj.updateDynamic("inject")(inject)
    if (runInNewContext != null) __obj.updateDynamic("runInNewContext")(runInNewContext.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction1(serializer))
    if (shouldPrefetch != null) __obj.updateDynamic("shouldPrefetch")(js.Any.fromFunction2(shouldPrefetch))
    if (shouldPreload != null) __obj.updateDynamic("shouldPreload")(js.Any.fromFunction2(shouldPreload))
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[BundleRendererOptions]
  }
}

