package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetForAttribute extends StObject {
  
  def click(): js.Any
  
  def exists(): Boolean
  
  def getForAttribute(): js.Any
  
  def getId(): js.Any
  
  def getLabelText(): js.Any
  
  def hasEllipsis(): Boolean
  
  def isDisabled(): Boolean
  
  def keyDown(key: js.Any): js.Any
}
object GetForAttribute {
  
  @scala.inline
  def apply(
    click: () => js.Any,
    exists: () => Boolean,
    getForAttribute: () => js.Any,
    getId: () => js.Any,
    getLabelText: () => js.Any,
    hasEllipsis: () => Boolean,
    isDisabled: () => Boolean,
    keyDown: js.Any => js.Any
  ): GetForAttribute = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getForAttribute = js.Any.fromFunction0(getForAttribute), getId = js.Any.fromFunction0(getId), getLabelText = js.Any.fromFunction0(getLabelText), hasEllipsis = js.Any.fromFunction0(hasEllipsis), isDisabled = js.Any.fromFunction0(isDisabled), keyDown = js.Any.fromFunction1(keyDown))
    __obj.asInstanceOf[GetForAttribute]
  }
  
  @scala.inline
  implicit class GetForAttributeMutableBuilder[Self <: GetForAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetForAttribute(value: () => js.Any): Self = StObject.set(x, "getForAttribute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => js.Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelText(value: () => js.Any): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasEllipsis(value: () => Boolean): Self = StObject.set(x, "hasEllipsis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyDown(value: js.Any => js.Any): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
  }
}
