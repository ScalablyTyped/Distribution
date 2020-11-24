package typings.twineSugarcube.saveMod

import typings.std.Event
import typings.twineSugarcube.anon.Count
import typings.twineSugarcube.anon.Get
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveAPI extends js.Object {
  
  var autosave: Get = js.native
  
  /**
    * Deletes all slot saves and the autosave, if it's enabled.
    * @since 2.0.0
    */
  def clear(): Unit = js.native
  
  /**
    * Deserializes the given save string, created via Save.serialize(), and loads the save. Returns the bundled metadata, if any,
    * or null if the given save could not be deserialized and loaded.
    * @param saveStr The serialized save string.
    * @since 2.21.0
    */
  def deserialize(saveStr: String): js.Any = js.native
  
  /**
    * Saves to disk.
    * @param filename The base filename of the save, which gets slugified to remove most symbols. Appended to this is a datestamp
    * (format: YYYMMDD-hhmmss) and the file extension .save. (e.g. "The Scooby Chronicles" would result in the full filename:
    * the-scooby-chronicles-{datestamp}.save). If omitted or null, defaults to the story's title.
    * @param metadata The data to be stored in the save object's metadata property. Must be JSON-serializable.
    * @since 2.8.0
    */
  def export(): Unit = js.native
  def export(filename: js.UndefOr[scala.Nothing], metadata: js.Any): Unit = js.native
  def export(filename: String): Unit = js.native
  def export(filename: String, metadata: js.Any): Unit = js.native
  
  /**
    * Returns the saves object.
    * @since 2.0.0
    */
  def get(): js.Object = js.native
  
  /**
    * Loads a save from disk.
    *
    * NOTE: You do not call this manually, it must be called by the change event handler of an <input type="file"> element.
    * @param event The event object which was passed to the change event handler of the associated <input type="file"> element.
    * @since 2.0.0
    * @example
    * // Add file input
    * var input  = document.createElement('input');
    * input.type = 'file';
    * input.id   = 'saves-import-file';
    * input.name = 'saves-import-file';
    * // Set up Save.import() as the event handler for when a file has been chosen
    * jQuery(input).on('change', Save.import);
    */
  def `import`(event: Event): Unit = js.native
  
  /**
    * Returns whether both the slot saves and autosave are available and ready.
    * @since 2.0.0
    */
  def ok(): Boolean = js.native
  
  /**
    * Returns a save as a serialized string, or null if saving is not allowed within the current context.
    * @param metadata The data to be stored as metadata. Must be JSON-serializable.
    * @since 2.21.0
    */
  def serialize(): String = js.native
  def serialize(metadata: js.Any): String = js.native
  
  var slots: Count = js.native
}
