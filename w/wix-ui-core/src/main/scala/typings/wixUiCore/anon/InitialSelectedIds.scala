package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialSelectedIds extends StObject {
  
  var initialSelectedIds: js.Array[js.Any]
  
  var multi: Boolean
  
  def onDeselect(): js.Any
  
  def onSelect(): js.Any
  
  def renderSuffix(): js.Any
}
object InitialSelectedIds {
  
  inline def apply(
    initialSelectedIds: js.Array[js.Any],
    multi: Boolean,
    onDeselect: () => js.Any,
    onSelect: () => js.Any,
    renderSuffix: () => js.Any
  ): InitialSelectedIds = {
    val __obj = js.Dynamic.literal(initialSelectedIds = initialSelectedIds.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], onDeselect = js.Any.fromFunction0(onDeselect), onSelect = js.Any.fromFunction0(onSelect), renderSuffix = js.Any.fromFunction0(renderSuffix))
    __obj.asInstanceOf[InitialSelectedIds]
  }
  
  extension [Self <: InitialSelectedIds](x: Self) {
    
    inline def setInitialSelectedIds(value: js.Array[js.Any]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedIdsVarargs(value: js.Any*): Self = StObject.set(x, "initialSelectedIds", js.Array(value :_*))
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setOnDeselect(value: () => js.Any): Self = StObject.set(x, "onDeselect", js.Any.fromFunction0(value))
    
    inline def setOnSelect(value: () => js.Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
    
    inline def setRenderSuffix(value: () => js.Any): Self = StObject.set(x, "renderSuffix", js.Any.fromFunction0(value))
  }
}
