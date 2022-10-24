package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.distTypesBoxMod.BoxCssSizingProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonRectangleMod {
  
  @JSImport("wix-style-react/dist/types/SkeletonRectangle", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SkeletonRectangleProps, js.Object, Any]
  
  type SkeletonRectangle = PureComponent[SkeletonRectangleProps, js.Object, Any]
  
  trait SkeletonRectangleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[BoxCssSizingProperty] = js.undefined
    
    var margin: js.UndefOr[BoxCssSizingProperty] = js.undefined
    
    var marginBottom: js.UndefOr[BoxCssSizingProperty] = js.undefined
    
    var marginLeft: js.UndefOr[BoxCssSizingProperty] = js.undefined
    
    var marginRight: js.UndefOr[BoxCssSizingProperty] = js.undefined
    
    var marginTop: js.UndefOr[BoxCssSizingProperty] = js.undefined
    
    var width: js.UndefOr[BoxCssSizingProperty] = js.undefined
  }
  object SkeletonRectangleProps {
    
    inline def apply(): SkeletonRectangleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonRectangleProps]
    }
    
    extension [Self <: SkeletonRectangleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHeight(value: BoxCssSizingProperty): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: BoxCssSizingProperty): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: BoxCssSizingProperty): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: BoxCssSizingProperty): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: BoxCssSizingProperty): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: BoxCssSizingProperty): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setWidth(value: BoxCssSizingProperty): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
