package typings.vegaTypings.anon

import typings.std.Element
import typings.std.MouseEvent
import typings.vegaTypings.rendererMod.Renderers
import typings.vegaTypings.runtimeMod.Item
import typings.vegaTypings.runtimeMod.Loader_
import typings.vegaTypings.runtimeMod.LocaleFormatters
import typings.vegaTypings.runtimeMod.TooltipHandler
import typings.vegaUtil.mod.LoggerInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Background extends StObject {
  
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
  implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: typings.vegaTypings.colorMod.Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBind(value: Element | String): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    @scala.inline
    def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setExpr(value: js.Any): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    @scala.inline
    def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setLoader(value: Loader_): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setLocale(value: LocaleFormatters): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setLogger(value: LoggerInterface): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setRenderer(value: Renderers): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setTooltip(
      value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
    ): Self = StObject.set(x, "tooltip", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
