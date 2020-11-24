package typings.vegaTypings.anon

import typings.std.Element
import typings.std.MouseEvent
import typings.vegaTypings.rendererMod.Renderers
import typings.vegaTypings.runtimeMod.Item
import typings.vegaTypings.runtimeMod.Loader_
import typings.vegaTypings.runtimeMod.LocaleFormatters
import typings.vegaTypings.runtimeMod.TooltipHandler
import typings.vegaUtil.mod.LoggerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Background extends js.Object {
  
  var background: js.UndefOr[typings.vegaTypings.colorMod.Color] = js.native
  
  var bind: js.UndefOr[Element | String] = js.native
  
  var container: js.UndefOr[Element | String] = js.native
  
  var expr: js.UndefOr[js.Any] = js.native
  
  var hover: js.UndefOr[Boolean] = js.native
  
  var loader: js.UndefOr[Loader_] = js.native
  
  var locale: js.UndefOr[LocaleFormatters] = js.native
  
  var logLevel: js.UndefOr[Double] = js.native
  
  var logger: js.UndefOr[LoggerInterface] = js.native
  
  var renderer: js.UndefOr[Renderers] = js.native
  
  var tooltip: js.UndefOr[TooltipHandler] = js.native
}
object Background {
  
  @scala.inline
  def apply(): Background = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit class BackgroundOps[Self <: Background] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: typings.vegaTypings.colorMod.Color): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBind(value: Element | String): Self = this.set("bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    
    @scala.inline
    def setContainer(value: Element | String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setExpr(value: js.Any): Self = this.set("expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpr: Self = this.set("expr", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setLoader(value: Loader_): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setLocale(value: LocaleFormatters): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLogLevel(value: Double): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: LoggerInterface): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setRenderer(value: Renderers): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setTooltip(
      value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
    ): Self = this.set("tooltip", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
