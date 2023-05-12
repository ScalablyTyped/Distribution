package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "ContentBase")
@js.native
open class ContentBase ()
  extends StObject
     with ContentInterface {
  def this(options: ContentOptions) = this()
  
  /**
    * Add the layer to a map.
    * @param {TrimbleMaps.Map} map
    */
  /* CompleteClass */
  override def addTo(map: Map): this.type = js.native
  
  /**
    * Returns true if the layer is visible.
    */
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  
  /**
    * Remove the layer from a map.
    */
  /* CompleteClass */
  override def remove(): this.type = js.native
  
  /**
    * Set the layer visibility.
    */
  /* CompleteClass */
  override def setVisibility(isVisible: Boolean): this.type = js.native
  
  /**
    * Toggle layer visibility.
    */
  /* CompleteClass */
  override def toggleVisibility(): this.type = js.native
}
