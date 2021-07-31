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
  
  @scala.inline
  def apply(
    initialSelectedIds: js.Array[js.Any],
    multi: Boolean,
    onDeselect: () => js.Any,
    onSelect: () => js.Any,
    renderSuffix: () => js.Any
  ): InitialSelectedIds = {
    val __obj = js.Dynamic.literal(initialSelectedIds = initialSelectedIds.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], onDeselect = js.Any.fromFunction0(onDeselect), onSelect = js.Any.fromFunction0(onSelect), renderSuffix = js.Any.fromFunction0(renderSuffix))
    __obj.asInstanceOf[InitialSelectedIds]
  }
  
  @scala.inline
  implicit class InitialSelectedIdsMutableBuilder[Self <: InitialSelectedIds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialSelectedIds(value: js.Array[js.Any]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSelectedIdsVarargs(value: js.Any*): Self = StObject.set(x, "initialSelectedIds", js.Array(value :_*))
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDeselect(value: () => js.Any): Self = StObject.set(x, "onDeselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSelect(value: () => js.Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderSuffix(value: () => js.Any): Self = StObject.set(x, "renderSuffix", js.Any.fromFunction0(value))
  }
}
