package typings.xrm.Xrm.Events

import typings.xrm.Xrm.TagValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupTagClickEventArguments extends StObject {
  
  /**
    * Gets the selected tag value
    * @returns The lookups TagValue object
    */
  def getTagValue(): TagValue
  
  /**
    * Returns a boolean value to indicate if the lookups onClick has been prevented.
    * @returns true if saving is prevented, otherwise false.
    */
  def isDefaultPrevented(): Boolean
  
  /**
    * Prevents the default onClick behaviour from executing.
    * All remaining "onLookupTagClick" handlers will continue execution.
    */
  def preventDefault(): Unit
}
object LookupTagClickEventArguments {
  
  inline def apply(getTagValue: () => TagValue, isDefaultPrevented: () => Boolean, preventDefault: () => Unit): LookupTagClickEventArguments = {
    val __obj = js.Dynamic.literal(getTagValue = js.Any.fromFunction0(getTagValue), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[LookupTagClickEventArguments]
  }
  
  extension [Self <: LookupTagClickEventArguments](x: Self) {
    
    inline def setGetTagValue(value: () => TagValue): Self = StObject.set(x, "getTagValue", js.Any.fromFunction0(value))
    
    inline def setIsDefaultPrevented(value: () => Boolean): Self = StObject.set(x, "isDefaultPrevented", js.Any.fromFunction0(value))
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
