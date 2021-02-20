package typings.twineSugarcube.anon

import typings.twineSugarcube.saveMod.SaveObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends StObject {
  
  /**
    * Deletes the autosave.
    * @since 2.0.0
    */
  def delete(): Unit = js.native
  
  /**
    * Returns the save object from the autosave or null, if there was no autosave.
    * @since 2.0.0
    */
  def get(): SaveObject = js.native
  
  /**
    * Returns whether the autosave is filled.
    * @since 2.0.0
    */
  def has(): Boolean = js.native
  
  /**
    * Loads the autosave.
    * @since 2.0.0
    */
  def load(): Unit = js.native
  
  /**
    * Returns whether the autosave is available and ready.
    * @since 2.0.0
    */
  def ok(): Boolean = js.native
  
  /**
    * Saves to the autosave.
    * @param title The title of the save. If omitted or null, defaults to the passage's description.
    * @param metadata The data to be stored in the save object's metadata property. Must be JSON-serializable.
    * @since 2.0.0
    */
  def save(): Unit = js.native
  def save(title: js.UndefOr[scala.Nothing], metadata: js.Any): Unit = js.native
  def save(title: String): Unit = js.native
  def save(title: String, metadata: js.Any): Unit = js.native
}
