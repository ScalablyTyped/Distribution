package typings.tengitsui.mod

import typings.std.Element
import typings.tengitsui.tengitsuiStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLayoutProps extends StObject {
  
  var cellRatio: js.UndefOr[auto | Double] = js.undefined
  
  var children: js.Array[Element]
  
  var gap: js.UndefOr[Double] = js.undefined
  
  var layout: String
  
  var style: js.UndefOr[js.Object] = js.undefined
}
object GridLayoutProps {
  
  inline def apply(children: js.Array[Element], layout: String): GridLayoutProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayoutProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridLayoutProps] (val x: Self) extends AnyVal {
    
    inline def setCellRatio(value: auto | Double): Self = StObject.set(x, "cellRatio", value.asInstanceOf[js.Any])
    
    inline def setCellRatioUndefined: Self = StObject.set(x, "cellRatio", js.undefined)
    
    inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
