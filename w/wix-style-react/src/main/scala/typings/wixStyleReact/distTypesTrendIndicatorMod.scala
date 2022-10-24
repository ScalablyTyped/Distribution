package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTrendIndicatorMod {
  
  @JSImport("wix-style-react/dist/types/TrendIndicator", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[TrendIndicatorProps, js.Object, Any]
  
  type TrendIndicator = PureComponent[TrendIndicatorProps, js.Object, Any]
  
  trait TrendIndicatorProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[SupportedWixLocales_] = js.undefined
    
    var value: Double
  }
  object TrendIndicatorProps {
    
    inline def apply(value: Double): TrendIndicatorProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrendIndicatorProps]
    }
    
    extension [Self <: TrendIndicatorProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setLocale(value: SupportedWixLocales_): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
