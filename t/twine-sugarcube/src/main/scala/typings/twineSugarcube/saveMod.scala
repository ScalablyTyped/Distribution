package typings.twineSugarcube

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.twineSugarcube.anon.Count
import typings.twineSugarcube.anon.Get
import typings.twineSugarcube.extensionsMod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveMod {
  
  @js.native
  trait SaveAPI extends StObject {
    
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
    def `export`(): Unit = js.native
    def `export`(filename: String): Unit = js.native
    def `export`(filename: String, metadata: js.Any): Unit = js.native
    def `export`(filename: Unit, metadata: js.Any): Unit = js.native
    
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
  
  trait SaveObject extends StObject {
    
    /** The date when the save was created(in milliseconds elapsed since epoch). */
    var date: Double
    
    /** The story's save ID. */
    var id: String
    
    /** Save metadata(end - user specified; must be JSON - serializable). */
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    /** The marshaled story history(see below for details). */
    var state: SavedState
    
    /** The title of the save. */
    var title: String
    
    /** Save version(end - user specified via Config.saves.version). */
    var version: js.UndefOr[js.Any] = js.undefined
  }
  object SaveObject {
    
    inline def apply(date: Double, id: String, state: SavedState, title: String): SaveObject = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SaveObject]
    }
    
    extension [Self <: SaveObject](x: Self) {
      
      inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setState(value: SavedState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: js.Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait SavedMoment extends StObject {
    
    /** The current pull count of SugarCube's seedable PRNG, exists only if enabled. */
    var pull: js.UndefOr[Double] = js.undefined
    
    /** The title of the associated passage. */
    var title: String
    
    /** The current variable store object, which contains sigil - less name ⇒ value pairs(e.g.$foo exists as foo). */
    var variables: StringDictionary[js.Any]
  }
  object SavedMoment {
    
    inline def apply(title: String, variables: StringDictionary[js.Any]): SavedMoment = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavedMoment]
    }
    
    extension [Self <: SavedMoment](x: Self) {
      
      inline def setPull(value: Double): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: StringDictionary[js.Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  trait SavedState extends StObject {
    
    /** The array of expired moment passage titles, exists only if any moments have expired. */
    var expired: js.UndefOr[Array[String]] = js.undefined
    
    /** The array of moment objects. */
    var history: Array[SavedMoment]
    
    /** The index of the active moment. */
    var index: Double
    
    /** The seed of SugarCube's seedable PRNG, exists only if enabled. */
    var seed: js.UndefOr[String] = js.undefined
  }
  object SavedState {
    
    inline def apply(history: Array[SavedMoment], index: Double): SavedState = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavedState]
    }
    
    extension [Self <: SavedState](x: Self) {
      
      inline def setExpired(value: Array[String]): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
      
      inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
      
      inline def setHistory(value: Array[SavedMoment]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
