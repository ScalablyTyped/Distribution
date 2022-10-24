package typings.wixStyleReact.anon

import typings.std.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetId extends StObject {
  
  /** Triggers change */
  def click(): Unit
  
  /** Checks if element exists */
  def exists(): Boolean
  
  /** Returns the id of the input */
  def getId(): Any
  
  /** Returns the toggle icon inside the knob */
  def getKnobIcon(): Any
  
  /** Returns the computed styles object of the knob icon */
  def getKnobIconStyles(): CSSStyleDeclaration
  
  /** Returns the computed styles object of the knob */
  def getKnobStyles(): CSSStyleDeclaration
  
  /** Returns the computed styles object of the root component */
  def getRootStyles(): CSSStyleDeclaration
  
  /** Returns the tab index */
  def getTabIndex(): Any
  
  /** Returns the computed styles object of the track */
  def getTrackStyles(): CSSStyleDeclaration
  
  /** Returns whether the toggle has an icon */
  def hasKnobIcon(): Boolean
  
  /** Returns a boolean indicating if the toggleSwitch is checked */
  def isChecked(): Any
  
  /** Returns a boolean indicating if the toggleSwitch is disabled */
  def isDisabled(): Any
}
object GetId {
  
  inline def apply(
    click: () => Unit,
    exists: () => Boolean,
    getId: () => Any,
    getKnobIcon: () => Any,
    getKnobIconStyles: () => CSSStyleDeclaration,
    getKnobStyles: () => CSSStyleDeclaration,
    getRootStyles: () => CSSStyleDeclaration,
    getTabIndex: () => Any,
    getTrackStyles: () => CSSStyleDeclaration,
    hasKnobIcon: () => Boolean,
    isChecked: () => Any,
    isDisabled: () => Any
  ): GetId = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), exists = js.Any.fromFunction0(exists), getId = js.Any.fromFunction0(getId), getKnobIcon = js.Any.fromFunction0(getKnobIcon), getKnobIconStyles = js.Any.fromFunction0(getKnobIconStyles), getKnobStyles = js.Any.fromFunction0(getKnobStyles), getRootStyles = js.Any.fromFunction0(getRootStyles), getTabIndex = js.Any.fromFunction0(getTabIndex), getTrackStyles = js.Any.fromFunction0(getTrackStyles), hasKnobIcon = js.Any.fromFunction0(hasKnobIcon), isChecked = js.Any.fromFunction0(isChecked), isDisabled = js.Any.fromFunction0(isDisabled))
    __obj.asInstanceOf[GetId]
  }
  
  extension [Self <: GetId](x: Self) {
    
    inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Any): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetKnobIcon(value: () => Any): Self = StObject.set(x, "getKnobIcon", js.Any.fromFunction0(value))
    
    inline def setGetKnobIconStyles(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getKnobIconStyles", js.Any.fromFunction0(value))
    
    inline def setGetKnobStyles(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getKnobStyles", js.Any.fromFunction0(value))
    
    inline def setGetRootStyles(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getRootStyles", js.Any.fromFunction0(value))
    
    inline def setGetTabIndex(value: () => Any): Self = StObject.set(x, "getTabIndex", js.Any.fromFunction0(value))
    
    inline def setGetTrackStyles(value: () => CSSStyleDeclaration): Self = StObject.set(x, "getTrackStyles", js.Any.fromFunction0(value))
    
    inline def setHasKnobIcon(value: () => Boolean): Self = StObject.set(x, "hasKnobIcon", js.Any.fromFunction0(value))
    
    inline def setIsChecked(value: () => Any): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    inline def setIsDisabled(value: () => Any): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
  }
}
