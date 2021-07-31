package typings.wixStyleReact.anon

import typings.wixStyleReact.sidebarMod.SidebarSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackClicked extends StObject {
  
  def backClicked(): Unit
  
  def getSelectedKey(): String
  
  def getSkin(): SidebarSkin
  
  def itemClicked(itemKey: String): Unit
}
object BackClicked {
  
  @scala.inline
  def apply(
    backClicked: () => Unit,
    getSelectedKey: () => String,
    getSkin: () => SidebarSkin,
    itemClicked: String => Unit
  ): BackClicked = {
    val __obj = js.Dynamic.literal(backClicked = js.Any.fromFunction0(backClicked), getSelectedKey = js.Any.fromFunction0(getSelectedKey), getSkin = js.Any.fromFunction0(getSkin), itemClicked = js.Any.fromFunction1(itemClicked))
    __obj.asInstanceOf[BackClicked]
  }
  
  @scala.inline
  implicit class BackClickedMutableBuilder[Self <: BackClicked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackClicked(value: () => Unit): Self = StObject.set(x, "backClicked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedKey(value: () => String): Self = StObject.set(x, "getSelectedKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSkin(value: () => SidebarSkin): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemClicked(value: String => Unit): Self = StObject.set(x, "itemClicked", js.Any.fromFunction1(value))
  }
}
