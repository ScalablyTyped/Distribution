package typings.wixUiCore.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Pick<wix-ui-core.wix-ui-core/src/components/horizontal-menu/horizontal-menu-grid-layout.HorizontalMenuGridLayoutProps, 'className' | 'style' | 'maxOverflowWidth' | 'menuContext'>, 'className' | 'style' | 'maxOverflowWidth'> */
trait PickPickHorizontalMenuGriClassName extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var maxOverflowWidth: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object PickPickHorizontalMenuGriClassName {
  
  inline def apply(): PickPickHorizontalMenuGriClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPickHorizontalMenuGriClassName]
  }
  
  extension [Self <: PickPickHorizontalMenuGriClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setMaxOverflowWidth(value: Double): Self = StObject.set(x, "maxOverflowWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxOverflowWidthUndefined: Self = StObject.set(x, "maxOverflowWidth", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
