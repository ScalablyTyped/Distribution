package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseGeometry
  extends StObject
     with MVCObject {
  
  /**
    * Returns whether the geometry is draggable or not.
    */
  def getDraggable(): Boolean = js.native
  
  /**
    * Returns whether the geometry is editable or not.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Returns the current parent Map.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Returns whether the geometry is visible or not.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Sets the geometry draggable.
    */
  def setDraggable(draggable: Boolean): Unit = js.native
  
  /**
    * Sets the geometry editable.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Sets the map object to display on.
    * if `map` is null, the geometry will be removed from the current `map`.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * Sets the visibility of the geometry.
    */
  def setVisible(visible: Boolean): Unit = js.native
}
