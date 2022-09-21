package typings.sumoselect

import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends StObject {
  
  def add(value: String): HTMLSelectElement = js.native
  def add(value: String, index: Double): HTMLSelectElement = js.native
  def add(value: String, text: String): HTMLSelectElement = js.native
  def add(value: String, text: String, index: Double): HTMLSelectElement = js.native
  def add(value: String, text: Unit, index: Double): HTMLSelectElement = js.native
  
  def disable(): this.type = js.native
  
  def disableItem(index: Double): Unit = js.native
  
  def enable(): this.type = js.native
  
  def enableItem(index: Double): Unit = js.native
  
  def find(value: String): Double = js.native
  
  def reload(): HTMLSelectElement = js.native
  
  def remove(index: Double): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  def selectAll(): Unit = js.native
  
  def selectItem(indexOrValue: String): Unit = js.native
  def selectItem(indexOrValue: Double): Unit = js.native
  
  def unSelectAll(): Unit = js.native
  
  def unSelectItem(indexOrValue: String): Unit = js.native
  def unSelectItem(indexOrValue: Double): Unit = js.native
  
  def unload(): HTMLSelectElement = js.native
}
