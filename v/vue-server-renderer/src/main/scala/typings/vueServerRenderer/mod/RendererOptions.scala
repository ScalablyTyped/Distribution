package typings.vueServerRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vue.vnodeMod.VNode
import typings.vue.vnodeMod.VNodeDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererOptions extends js.Object {
  var cache: js.UndefOr[RenderCache] = js.native
  var directives: js.UndefOr[
    StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]]
  ] = js.native
  var inject: js.UndefOr[Boolean] = js.native
  var shouldPrefetch: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.native
  var shouldPreload: js.UndefOr[js.Function2[/* file */ String, /* type */ String, Boolean]] = js.native
  var template: js.UndefOr[String] = js.native
}

object RendererOptions {
  @scala.inline
  def apply(): RendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererOptions]
  }
  @scala.inline
  implicit class RendererOptionsOps[Self <: RendererOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: RenderCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setDirectives(value: StringDictionary[js.Function2[/* vnode */ VNode, /* dir */ VNodeDirective, Unit]]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setInject(value: Boolean): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setShouldPrefetch(value: (/* file */ String, /* type */ String) => Boolean): Self = this.set("shouldPrefetch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShouldPrefetch: Self = this.set("shouldPrefetch", js.undefined)
    @scala.inline
    def setShouldPreload(value: (/* file */ String, /* type */ String) => Boolean): Self = this.set("shouldPreload", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShouldPreload: Self = this.set("shouldPreload", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

