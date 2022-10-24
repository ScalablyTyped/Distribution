package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesSidebarMod.SidebarSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIsMenuExpanded extends StObject {
  
  def backClicked(): Unit
  
  def getIsMenuExpanded(): Boolean
  
  def getSelectedKey(): String
  
  def getSkin(): SidebarSkin
  
  def itemClicked(itemKey: String): Unit
}
object GetIsMenuExpanded {
  
  inline def apply(
    backClicked: () => Unit,
    getIsMenuExpanded: () => Boolean,
    getSelectedKey: () => String,
    getSkin: () => SidebarSkin,
    itemClicked: String => Unit
  ): GetIsMenuExpanded = {
    val __obj = js.Dynamic.literal(backClicked = js.Any.fromFunction0(backClicked), getIsMenuExpanded = js.Any.fromFunction0(getIsMenuExpanded), getSelectedKey = js.Any.fromFunction0(getSelectedKey), getSkin = js.Any.fromFunction0(getSkin), itemClicked = js.Any.fromFunction1(itemClicked))
    __obj.asInstanceOf[GetIsMenuExpanded]
  }
  
  extension [Self <: GetIsMenuExpanded](x: Self) {
    
    inline def setBackClicked(value: () => Unit): Self = StObject.set(x, "backClicked", js.Any.fromFunction0(value))
    
    inline def setGetIsMenuExpanded(value: () => Boolean): Self = StObject.set(x, "getIsMenuExpanded", js.Any.fromFunction0(value))
    
    inline def setGetSelectedKey(value: () => String): Self = StObject.set(x, "getSelectedKey", js.Any.fromFunction0(value))
    
    inline def setGetSkin(value: () => SidebarSkin): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    
    inline def setItemClicked(value: String => Unit): Self = StObject.set(x, "itemClicked", js.Any.fromFunction1(value))
  }
}
