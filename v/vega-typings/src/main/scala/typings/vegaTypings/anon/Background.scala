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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: js.UndefOr[typings.vegaTypings.colorMod.Color] = js.undefined
  
  var bind: js.UndefOr[Element | String] = js.undefined
  
  var container: js.UndefOr[Element | String] = js.undefined
  
  var expr: js.UndefOr[js.Any] = js.undefined
  
  var hover: js.UndefOr[Boolean] = js.undefined
  
  var loader: js.UndefOr[Loader_] = js.undefined
  
  var locale: js.UndefOr[LocaleFormatters] = js.undefined
  
  var logLevel: js.UndefOr[Double] = js.undefined
  
  var logger: js.UndefOr[LoggerInterface] = js.undefined
  
  var renderer: js.UndefOr[Renderers] = js.undefined
  
  var tooltip: js.UndefOr[TooltipHandler] = js.undefined
}
object Background {
  
  inline def apply(): Background = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Background]
  }
  
  extension [Self <: Background](x: Self) {
    
    inline def setBackground(value: typings.vegaTypings.colorMod.Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBind(value: Element | String): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
    
    inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
    
    inline def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setExpr(value: js.Any): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setLoader(value: Loader_): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setLocale(value: LocaleFormatters): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLogLevel(value: Double): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogger(value: LoggerInterface): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setRenderer(value: Renderers): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setTooltip(
      value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
    ): Self = StObject.set(x, "tooltip", js.Any.fromFunction4(value))
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
