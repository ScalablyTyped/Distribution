package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackClicked extends StObject {
  
  def backClicked(): Unit
  
  def getIsMenuExpanded(): Unit
  
  def getSelectedKey(): String
  
  def getSkin(): Any
  
  def itemClicked(itemKey: Any): Unit
}
object BackClicked {
  
  inline def apply(
    backClicked: () => Unit,
    getIsMenuExpanded: () => Unit,
    getSelectedKey: () => String,
    getSkin: () => Any,
    itemClicked: Any => Unit
  ): BackClicked = {
    val __obj = js.Dynamic.literal(backClicked = js.Any.fromFunction0(backClicked), getIsMenuExpanded = js.Any.fromFunction0(getIsMenuExpanded), getSelectedKey = js.Any.fromFunction0(getSelectedKey), getSkin = js.Any.fromFunction0(getSkin), itemClicked = js.Any.fromFunction1(itemClicked))
    __obj.asInstanceOf[BackClicked]
  }
  
  extension [Self <: BackClicked](x: Self) {
    
    inline def setBackClicked(value: () => Unit): Self = StObject.set(x, "backClicked", js.Any.fromFunction0(value))
    
    inline def setGetIsMenuExpanded(value: () => Unit): Self = StObject.set(x, "getIsMenuExpanded", js.Any.fromFunction0(value))
    
    inline def setGetSelectedKey(value: () => String): Self = StObject.set(x, "getSelectedKey", js.Any.fromFunction0(value))
    
    inline def setGetSkin(value: () => Any): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    
    inline def setItemClicked(value: Any => Unit): Self = StObject.set(x, "itemClicked", js.Any.fromFunction1(value))
  }
}
