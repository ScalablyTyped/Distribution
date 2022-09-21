package typings.terminalKit.terminalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTableOptions extends StObject {
  
  var borderAttr: js.UndefOr[js.Object] = js.undefined
  
  var borderChars: js.UndefOr[CustomBorderObject | BuiltinBorder] = js.undefined
  
  var cellContents: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  var checkerEvenCellTextAttr: js.UndefOr[js.Object] = js.undefined
  
  var checkerEvenCellVoidAttr: js.UndefOr[js.Object] = js.undefined
  
  var contentHasMarkup: js.UndefOr[Boolean | String] = js.undefined
  
  var evenCellTextAttr: js.UndefOr[js.Object] = js.undefined
  
  var evenCellVoidAttr: js.UndefOr[js.Object] = js.undefined
  
  var evenColumnTextAttr: js.UndefOr[js.Object] = js.undefined
  
  var evenColumnVoidAttr: js.UndefOr[js.Object] = js.undefined
  
  var evenRowTextAttr: js.UndefOr[js.Object] = js.undefined
  
  var evenRowVoidAttr: js.UndefOr[js.Object] = js.undefined
  
  var expandToHeight: js.UndefOr[Boolean] = js.undefined
  
  var expandToWidth: js.UndefOr[Boolean] = js.undefined
  
  var firstCellTextAttr: js.UndefOr[js.Object] = js.undefined
  
  var firstCellVoidAttr: js.UndefOr[js.Object] = js.undefined
  
  var firstColumnTextAttr: js.UndefOr[js.Object] = js.undefined
  
  var firstColumnVoidAttr: js.UndefOr[js.Object] = js.undefined
  
  var firstRowTextAttr: js.UndefOr[js.Object] = js.undefined
  
  var firstRowVoidAttr: js.UndefOr[js.Object] = js.undefined
  
  var fit: js.UndefOr[Boolean] = js.undefined
  
  var hasBorder: js.UndefOr[Boolean] = js.undefined
  
  var lineWrap: js.UndefOr[Boolean] = js.undefined
  
  var shrinkToHeight: js.UndefOr[Boolean] = js.undefined
  
  var shrinkToWidth: js.UndefOr[Boolean] = js.undefined
  
  var textAttr: js.UndefOr[js.Object] = js.undefined
  
  var textBoxKeyBindings: js.UndefOr[js.Object] = js.undefined
  
  var voidAttr: js.UndefOr[js.Object] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}
object TextTableOptions {
  
  inline def apply(): TextTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTableOptions]
  }
  
  extension [Self <: TextTableOptions](x: Self) {
    
    inline def setBorderAttr(value: js.Object): Self = StObject.set(x, "borderAttr", value.asInstanceOf[js.Any])
    
    inline def setBorderAttrUndefined: Self = StObject.set(x, "borderAttr", js.undefined)
    
    inline def setBorderChars(value: CustomBorderObject | BuiltinBorder): Self = StObject.set(x, "borderChars", value.asInstanceOf[js.Any])
    
    inline def setBorderCharsUndefined: Self = StObject.set(x, "borderChars", js.undefined)
    
    inline def setCellContents(value: js.Array[js.Array[String]]): Self = StObject.set(x, "cellContents", value.asInstanceOf[js.Any])
    
    inline def setCellContentsUndefined: Self = StObject.set(x, "cellContents", js.undefined)
    
    inline def setCellContentsVarargs(value: js.Array[String]*): Self = StObject.set(x, "cellContents", js.Array(value*))
    
    inline def setCheckerEvenCellTextAttr(value: js.Object): Self = StObject.set(x, "checkerEvenCellTextAttr", value.asInstanceOf[js.Any])
    
    inline def setCheckerEvenCellTextAttrUndefined: Self = StObject.set(x, "checkerEvenCellTextAttr", js.undefined)
    
    inline def setCheckerEvenCellVoidAttr(value: js.Object): Self = StObject.set(x, "checkerEvenCellVoidAttr", value.asInstanceOf[js.Any])
    
    inline def setCheckerEvenCellVoidAttrUndefined: Self = StObject.set(x, "checkerEvenCellVoidAttr", js.undefined)
    
    inline def setContentHasMarkup(value: Boolean | String): Self = StObject.set(x, "contentHasMarkup", value.asInstanceOf[js.Any])
    
    inline def setContentHasMarkupUndefined: Self = StObject.set(x, "contentHasMarkup", js.undefined)
    
    inline def setEvenCellTextAttr(value: js.Object): Self = StObject.set(x, "evenCellTextAttr", value.asInstanceOf[js.Any])
    
    inline def setEvenCellTextAttrUndefined: Self = StObject.set(x, "evenCellTextAttr", js.undefined)
    
    inline def setEvenCellVoidAttr(value: js.Object): Self = StObject.set(x, "evenCellVoidAttr", value.asInstanceOf[js.Any])
    
    inline def setEvenCellVoidAttrUndefined: Self = StObject.set(x, "evenCellVoidAttr", js.undefined)
    
    inline def setEvenColumnTextAttr(value: js.Object): Self = StObject.set(x, "evenColumnTextAttr", value.asInstanceOf[js.Any])
    
    inline def setEvenColumnTextAttrUndefined: Self = StObject.set(x, "evenColumnTextAttr", js.undefined)
    
    inline def setEvenColumnVoidAttr(value: js.Object): Self = StObject.set(x, "evenColumnVoidAttr", value.asInstanceOf[js.Any])
    
    inline def setEvenColumnVoidAttrUndefined: Self = StObject.set(x, "evenColumnVoidAttr", js.undefined)
    
    inline def setEvenRowTextAttr(value: js.Object): Self = StObject.set(x, "evenRowTextAttr", value.asInstanceOf[js.Any])
    
    inline def setEvenRowTextAttrUndefined: Self = StObject.set(x, "evenRowTextAttr", js.undefined)
    
    inline def setEvenRowVoidAttr(value: js.Object): Self = StObject.set(x, "evenRowVoidAttr", value.asInstanceOf[js.Any])
    
    inline def setEvenRowVoidAttrUndefined: Self = StObject.set(x, "evenRowVoidAttr", js.undefined)
    
    inline def setExpandToHeight(value: Boolean): Self = StObject.set(x, "expandToHeight", value.asInstanceOf[js.Any])
    
    inline def setExpandToHeightUndefined: Self = StObject.set(x, "expandToHeight", js.undefined)
    
    inline def setExpandToWidth(value: Boolean): Self = StObject.set(x, "expandToWidth", value.asInstanceOf[js.Any])
    
    inline def setExpandToWidthUndefined: Self = StObject.set(x, "expandToWidth", js.undefined)
    
    inline def setFirstCellTextAttr(value: js.Object): Self = StObject.set(x, "firstCellTextAttr", value.asInstanceOf[js.Any])
    
    inline def setFirstCellTextAttrUndefined: Self = StObject.set(x, "firstCellTextAttr", js.undefined)
    
    inline def setFirstCellVoidAttr(value: js.Object): Self = StObject.set(x, "firstCellVoidAttr", value.asInstanceOf[js.Any])
    
    inline def setFirstCellVoidAttrUndefined: Self = StObject.set(x, "firstCellVoidAttr", js.undefined)
    
    inline def setFirstColumnTextAttr(value: js.Object): Self = StObject.set(x, "firstColumnTextAttr", value.asInstanceOf[js.Any])
    
    inline def setFirstColumnTextAttrUndefined: Self = StObject.set(x, "firstColumnTextAttr", js.undefined)
    
    inline def setFirstColumnVoidAttr(value: js.Object): Self = StObject.set(x, "firstColumnVoidAttr", value.asInstanceOf[js.Any])
    
    inline def setFirstColumnVoidAttrUndefined: Self = StObject.set(x, "firstColumnVoidAttr", js.undefined)
    
    inline def setFirstRowTextAttr(value: js.Object): Self = StObject.set(x, "firstRowTextAttr", value.asInstanceOf[js.Any])
    
    inline def setFirstRowTextAttrUndefined: Self = StObject.set(x, "firstRowTextAttr", js.undefined)
    
    inline def setFirstRowVoidAttr(value: js.Object): Self = StObject.set(x, "firstRowVoidAttr", value.asInstanceOf[js.Any])
    
    inline def setFirstRowVoidAttrUndefined: Self = StObject.set(x, "firstRowVoidAttr", js.undefined)
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setHasBorder(value: Boolean): Self = StObject.set(x, "hasBorder", value.asInstanceOf[js.Any])
    
    inline def setHasBorderUndefined: Self = StObject.set(x, "hasBorder", js.undefined)
    
    inline def setLineWrap(value: Boolean): Self = StObject.set(x, "lineWrap", value.asInstanceOf[js.Any])
    
    inline def setLineWrapUndefined: Self = StObject.set(x, "lineWrap", js.undefined)
    
    inline def setShrinkToHeight(value: Boolean): Self = StObject.set(x, "shrinkToHeight", value.asInstanceOf[js.Any])
    
    inline def setShrinkToHeightUndefined: Self = StObject.set(x, "shrinkToHeight", js.undefined)
    
    inline def setShrinkToWidth(value: Boolean): Self = StObject.set(x, "shrinkToWidth", value.asInstanceOf[js.Any])
    
    inline def setShrinkToWidthUndefined: Self = StObject.set(x, "shrinkToWidth", js.undefined)
    
    inline def setTextAttr(value: js.Object): Self = StObject.set(x, "textAttr", value.asInstanceOf[js.Any])
    
    inline def setTextAttrUndefined: Self = StObject.set(x, "textAttr", js.undefined)
    
    inline def setTextBoxKeyBindings(value: js.Object): Self = StObject.set(x, "textBoxKeyBindings", value.asInstanceOf[js.Any])
    
    inline def setTextBoxKeyBindingsUndefined: Self = StObject.set(x, "textBoxKeyBindings", js.undefined)
    
    inline def setVoidAttr(value: js.Object): Self = StObject.set(x, "voidAttr", value.asInstanceOf[js.Any])
    
    inline def setVoidAttrUndefined: Self = StObject.set(x, "voidAttr", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
