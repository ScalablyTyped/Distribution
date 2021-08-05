package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swatchesMod {
  
  @JSImport("wix-style-react/dist/es/src/Swatches", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SwatchesProps, js.Object, js.Any]
  
  type Swatches = PureComponent[SwatchesProps, js.Object, js.Any]
  
  trait SwatchesProps extends StObject {
    
    var addButtonIconSize: js.UndefOr[small | medium] = js.undefined
    
    var addButtonMessage: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[js.Array[js.Object | String]] = js.undefined
    
    var columns: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var gap: js.UndefOr[Double] = js.undefined
    
    var onAdd: js.UndefOr[js.Function] = js.undefined
    
    var onCancel: js.UndefOr[js.Function] = js.undefined
    
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    var onClick: js.UndefOr[String | js.Object] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
    
    var showAddButton: js.UndefOr[Boolean] = js.undefined
    
    var showClear: js.UndefOr[Boolean] = js.undefined
    
    var showClearMessage: js.UndefOr[ReactNode] = js.undefined
    
    var size: js.UndefOr[small | medium] = js.undefined
  }
  object SwatchesProps {
    
    inline def apply(): SwatchesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwatchesProps]
    }
    
    extension [Self <: SwatchesProps](x: Self) {
      
      inline def setAddButtonIconSize(value: small | medium): Self = StObject.set(x, "addButtonIconSize", value.asInstanceOf[js.Any])
      
      inline def setAddButtonIconSizeUndefined: Self = StObject.set(x, "addButtonIconSize", js.undefined)
      
      inline def setAddButtonMessage(value: String): Self = StObject.set(x, "addButtonMessage", value.asInstanceOf[js.Any])
      
      inline def setAddButtonMessageUndefined: Self = StObject.set(x, "addButtonMessage", js.undefined)
      
      inline def setColors(value: js.Array[js.Object | String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setOnAdd(value: js.Function): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnCancel(value: js.Function): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: String | js.Object): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShowAddButton(value: Boolean): Self = StObject.set(x, "showAddButton", value.asInstanceOf[js.Any])
      
      inline def setShowAddButtonUndefined: Self = StObject.set(x, "showAddButton", js.undefined)
      
      inline def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
      
      inline def setShowClearMessage(value: ReactNode): Self = StObject.set(x, "showClearMessage", value.asInstanceOf[js.Any])
      
      inline def setShowClearMessageUndefined: Self = StObject.set(x, "showClearMessage", js.undefined)
      
      inline def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
      
      inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
