package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInterface extends StObject {
  
  /**
    * Add the layer to a map.
    * @param {TrimbleMaps.Map} map
    */
  def addTo(map: Map): this.type
  
  /**
    * Returns true if the layer is visible.
    */
  def isVisible(): Boolean
  
  /**
    * Remove the layer from a map.
    */
  def remove(): this.type
  
  /**
    * Set the layer visibility.
    */
  def setVisibility(isVisible: Boolean): this.type
  
  /**
    * Toggle layer visibility.
    */
  def toggleVisibility(): this.type
}
object ContentInterface {
  
  inline def apply(
    addTo: Map => ContentInterface,
    isVisible: () => Boolean,
    remove: () => ContentInterface,
    setVisibility: Boolean => ContentInterface,
    toggleVisibility: () => ContentInterface
  ): ContentInterface = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), isVisible = js.Any.fromFunction0(isVisible), remove = js.Any.fromFunction0(remove), setVisibility = js.Any.fromFunction1(setVisibility), toggleVisibility = js.Any.fromFunction0(toggleVisibility))
    __obj.asInstanceOf[ContentInterface]
  }
  
  extension [Self <: ContentInterface](x: Self) {
    
    inline def setAddTo(value: Map => ContentInterface): Self = StObject.set(x, "addTo", js.Any.fromFunction1(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => ContentInterface): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetVisibility(value: Boolean => ContentInterface): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
    
    inline def setToggleVisibility(value: () => ContentInterface): Self = StObject.set(x, "toggleVisibility", js.Any.fromFunction0(value))
  }
}
