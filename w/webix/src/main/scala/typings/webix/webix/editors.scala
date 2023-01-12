package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait editors
  extends StObject
     with /* name */ StringDictionary[WebixEditor] {
  
  @JSName("$popup")
  var $popup: obj
  
  var checkbox: checkboxEditor
  
  var color: colorEditor
  
  var combo: comboEditor
  
  var date: dateEditor
  
  var excel_date: js.UndefOr[excelDateEditor] = js.undefined
  
  var gantt_numeditor: js.UndefOr[ganttNumEditor] = js.undefined
  
  var `inline-checkbox`: inlineCheckboxEditor
  
  var `inline-text`: inlineTextEditor
  
  var multiselect: multiselectEditor
  
  var password: passwordEditor
  
  var popup: popupEditor
  
  var richselect: richselectEditor
  
  var select: selectEditor
  
  var ss_richselect: js.UndefOr[ssRichselectEditor] = js.undefined
  
  var text: textEditor
}
object editors {
  
  inline def apply(
    $popup: obj,
    checkbox: checkboxEditor,
    color: colorEditor,
    combo: comboEditor,
    date: dateEditor,
    `inline-checkbox`: inlineCheckboxEditor,
    `inline-text`: inlineTextEditor,
    multiselect: multiselectEditor,
    password: passwordEditor,
    popup: popupEditor,
    richselect: richselectEditor,
    select: selectEditor,
    text: textEditor
  ): editors = {
    val __obj = js.Dynamic.literal($popup = $popup.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], richselect = richselect.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("inline-checkbox")(`inline-checkbox`.asInstanceOf[js.Any])
    __obj.updateDynamic("inline-text")(`inline-text`.asInstanceOf[js.Any])
    __obj.asInstanceOf[editors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: editors] (val x: Self) extends AnyVal {
    
    inline def set$popup(value: obj): Self = StObject.set(x, "$popup", value.asInstanceOf[js.Any])
    
    inline def setCheckbox(value: checkboxEditor): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setColor(value: colorEditor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCombo(value: comboEditor): Self = StObject.set(x, "combo", value.asInstanceOf[js.Any])
    
    inline def setDate(value: dateEditor): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setExcel_date(value: excelDateEditor): Self = StObject.set(x, "excel_date", value.asInstanceOf[js.Any])
    
    inline def setExcel_dateUndefined: Self = StObject.set(x, "excel_date", js.undefined)
    
    inline def setGantt_numeditor(value: ganttNumEditor): Self = StObject.set(x, "gantt_numeditor", value.asInstanceOf[js.Any])
    
    inline def setGantt_numeditorUndefined: Self = StObject.set(x, "gantt_numeditor", js.undefined)
    
    inline def `setInline-checkbox`(value: inlineCheckboxEditor): Self = StObject.set(x, "inline-checkbox", value.asInstanceOf[js.Any])
    
    inline def `setInline-text`(value: inlineTextEditor): Self = StObject.set(x, "inline-text", value.asInstanceOf[js.Any])
    
    inline def setMultiselect(value: multiselectEditor): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: passwordEditor): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPopup(value: popupEditor): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setRichselect(value: richselectEditor): Self = StObject.set(x, "richselect", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: selectEditor): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSs_richselect(value: ssRichselectEditor): Self = StObject.set(x, "ss_richselect", value.asInstanceOf[js.Any])
    
    inline def setSs_richselectUndefined: Self = StObject.set(x, "ss_richselect", js.undefined)
    
    inline def setText(value: textEditor): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
