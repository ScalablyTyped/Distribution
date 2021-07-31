package typings.twineSugarcube.anon

import typings.twineSugarcube.saveMod.SaveObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends StObject {
  
  /**
    * Returns the total number of filled slots.
    * @since 2.0.0
    */
  def count(): Double = js.native
  
  /**
    * Deletes a save from the given slot.
    * @param slot Save slot index (0-based).
    * @since 2.0.0
    */
  def delete(slot: Double): Unit = js.native
  
  /**
    * Returns a save object from the given slot or null, if there was no save in the given slot.
    * @param slot Save slot index (0-based).
    * @since 2.0.0
    */
  def get(slot: Double): SaveObject = js.native
  
  /**
    * Returns whether the given slot is filled.
    * @param slot Save slot index (0-based).
    * @since 2.0.0
    */
  def has(slot: Double): Boolean = js.native
  
  /**
    * Returns whether there are any filled slots.
    * @since 2.0.0
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * Returns the total number of available slots.
    * @since 2.0.0
    */
  var length: Double = js.native
  
  /**
    * Loads a save from the given slot.
    * @param slot
    */
  def load(slot: Double): Unit = js.native
  
  /**
    * Returns whether the slot saves are available and ready.
    * @since 2.0.0
    */
  def ok(): Boolean = js.native
  
  /**
    * Saves to the given slot.
    * @param slot Save slot index (0-based).
    * @param title The title of the save. If omitted or null, defaults to the passage's description.
    * @param metadata The data to be stored in the save object's metadata property. Must be JSON-serializable.
    * @since 2.0.0
    */
  def save(slot: Double): Unit = js.native
  def save(slot: Double, title: String): Unit = js.native
  def save(slot: Double, title: String, metadata: js.Any): Unit = js.native
  def save(slot: Double, title: Unit, metadata: js.Any): Unit = js.native
}
