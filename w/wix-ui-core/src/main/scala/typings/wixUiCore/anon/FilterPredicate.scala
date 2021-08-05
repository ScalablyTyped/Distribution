package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPredicate extends StObject {
  
  def filterPredicate(inputValue: js.Any, optionValue: js.Any): js.Any
  
  var highlightMatches: Boolean
  
  var initialSelectedIds: js.Array[js.Any]
  
  var multi: Boolean
  
  def onDeselect(): js.Any
  
  def onInitialSelectedOptionsSet(): js.Any
  
  def onManualInput(): js.Any
  
  def onSelect(): js.Any
  
  var openTrigger: String
  
  var placement: String
}
object FilterPredicate {
  
  inline def apply(
    filterPredicate: (js.Any, js.Any) => js.Any,
    highlightMatches: Boolean,
    initialSelectedIds: js.Array[js.Any],
    multi: Boolean,
    onDeselect: () => js.Any,
    onInitialSelectedOptionsSet: () => js.Any,
    onManualInput: () => js.Any,
    onSelect: () => js.Any,
    openTrigger: String,
    placement: String
  ): FilterPredicate = {
    val __obj = js.Dynamic.literal(filterPredicate = js.Any.fromFunction2(filterPredicate), highlightMatches = highlightMatches.asInstanceOf[js.Any], initialSelectedIds = initialSelectedIds.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], onDeselect = js.Any.fromFunction0(onDeselect), onInitialSelectedOptionsSet = js.Any.fromFunction0(onInitialSelectedOptionsSet), onManualInput = js.Any.fromFunction0(onManualInput), onSelect = js.Any.fromFunction0(onSelect), openTrigger = openTrigger.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPredicate]
  }
  
  extension [Self <: FilterPredicate](x: Self) {
    
    inline def setFilterPredicate(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "filterPredicate", js.Any.fromFunction2(value))
    
    inline def setHighlightMatches(value: Boolean): Self = StObject.set(x, "highlightMatches", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedIds(value: js.Array[js.Any]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedIdsVarargs(value: js.Any*): Self = StObject.set(x, "initialSelectedIds", js.Array(value :_*))
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setOnDeselect(value: () => js.Any): Self = StObject.set(x, "onDeselect", js.Any.fromFunction0(value))
    
    inline def setOnInitialSelectedOptionsSet(value: () => js.Any): Self = StObject.set(x, "onInitialSelectedOptionsSet", js.Any.fromFunction0(value))
    
    inline def setOnManualInput(value: () => js.Any): Self = StObject.set(x, "onManualInput", js.Any.fromFunction0(value))
    
    inline def setOnSelect(value: () => js.Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
    
    inline def setOpenTrigger(value: String): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
