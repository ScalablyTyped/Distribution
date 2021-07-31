package typings.wixUiCore.anon

import typings.std.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetId extends StObject {
  
  def click(): Unit
  
  def exists(): Boolean
  
  def getId(): js.Any
  
  def getKnobIcon(): js.Any
  
  def getKnobIconStyles(): CSSStyleDeclaration
  
  def getKnobStyles(): CSSStyleDeclaration
  
  def getRootStyles(): CSSStyleDeclaration
  
  def getTabIndex(): js.Any
  
  def getTrackStyles(): CSSStyleDeclaration
  
  def hasKnobIcon(): Boolean
  
  def isChecked(): js.Any
  
  def isDisabled(): js.Any
}
object GetId {
  
  @scala.inline
  def apply(
    click: () => Unit,
    exists: () => Boolean,
    getId: () => js.Any,
    getKnobIcon: () => js.Any,
    getKnobIconStyles: () => CSSStyleDeclaration,
    getKnobStyles: () => CSSStyleDeclaration,
    getRootStyles: () => CSSStyleDeclaration,
    getTabIndex: () => js.Any,
    getTrackStyles: () => CSSStyleDeclaration,
    hasKnobIcon: () => Boolean,
    isChecked: () => js.Any,
    isDisabled: () => js.Any
  ): GetId = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getId = js.Any.fromFunction0(getId), getKnobIcon = js.Any.fromFunction0(getKnobIcon), getKnobIconStyles = js.Any.fromFunction0(getKnobIconStyles), getKnobStyles = js.Any.fromFunction0(getKnobStyles), getRootStyles = js.Any.fromFunction0(getRootStyles), getTabIndex = js.Any.fromFunction0(getTabIndex), getTrackStyles = js.Any.fromFunction0(getTrackStyles), hasKnobIcon = js.Any.fromFunction0(hasKnobIcon), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled))
    __obj.asInstanceOf[GetId]
  }
  
  @scala.inline
  implicit class GetIdMutableBuilder[Self <: GetId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => js.Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKnobIcon(value: () => js.Any): Self = StObject.set(x, "getKnobIcon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKnobIconStyles(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getKnobIconStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetKnobStyles(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getKnobStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootStyles(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getRootStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTabIndex(value: () => js.Any): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTrackStyles(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getTrackStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasKnobIcon(value: () => Boolean): Self = StObject.set(x, "hasKnobIcon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChecked(value: () => js.Any): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDisabled(value: () => js.Any): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
  }
}
