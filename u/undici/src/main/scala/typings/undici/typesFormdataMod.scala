package typings.undici

import typings.undici.typesFetchMod.SpecIterableIterator
import typings.undici.typesFileMod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFormdataMod {
  
  @JSImport("undici/types/formdata", "FormData")
  @js.native
  open class FormData () extends StObject {
    
    /**
      * Appends a new value onto an existing key inside a FormData object,
      * or adds the key if it does not already exist.
      *
      * The difference between `set()` and `append()` is that if the specified key already exists, `set()` will overwrite all existing values with the new one, whereas `append()` will append the new value onto the end of the existing set of values.
      *
      * @param name The name of the field whose data is contained in `value`.
      * @param value The field's value. This can be [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob)
      or [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File). If none of these are specified the value is converted to a string.
      * @param fileName The filename reported to the server, when a Blob or File is passed as the second parameter. The default filename for Blob objects is "blob". The default filename for File objects is the file's filename.
      */
    def append(name: String, value: Any): Unit = js.native
    def append(name: String, value: Any, fileName: String): Unit = js.native
    
    /**
      * Deletes a key and its value(s) from a `FormData` object.
      *
      * @param name The name of the key you want to delete.
      */
    def delete(name: String): Unit = js.native
    
    /**
      * Returns an [`iterator`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols) allowing to go through the `FormData` key/value pairs.
      * The key of each pair is a string; the value is a [`FormDataValue`](https://developer.mozilla.org/en-US/docs/Web/API/FormDataEntryValue).
      */
    def entries(): SpecIterableIterator[js.Tuple2[String, FormDataEntryValue]] = js.native
    
    /**
      * Executes given callback function for each field of the FormData instance
      */
    def forEach(
      callbackfn: js.Function3[/* value */ FormDataEntryValue, /* key */ String, /* iterable */ this.type, Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ FormDataEntryValue, /* key */ String, /* iterable */ this.type, Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Returns the first value associated with a given key from within a `FormData` object.
      * If you expect multiple values and want all of them, use the `getAll()` method instead.
      *
      * @param {string} name A name of the value you want to retrieve.
      *
      * @returns A `FormDataEntryValue` containing the value. If the key doesn't exist, the method returns null.
      */
    def get(name: String): FormDataEntryValue | Null = js.native
    
    /**
      * Returns all the values associated with a given key from within a `FormData` object.
      *
      * @param {string} name A name of the value you want to retrieve.
      *
      * @returns An array of `FormDataEntryValue` whose key matches the value passed in the `name` parameter. If the key doesn't exist, the method returns an empty list.
      */
    def getAll(name: String): js.Array[FormDataEntryValue] = js.native
    
    /**
      * Returns a boolean stating whether a `FormData` object contains a certain key.
      *
      * @param name A string representing the name of the key you want to test for.
      *
      * @return A boolean value.
      */
    def has(name: String): Boolean = js.native
    
    /**
      * An alias for FormData#entries()
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[SpecIterableIterator[js.Tuple2[String, FormDataEntryValue]]] = js.native
    
    /**
      * Returns an [`iterator`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols) allowing to go through all keys contained in this `FormData` object.
      * Each key is a `string`.
      */
    def keys(): SpecIterableIterator[String] = js.native
    
    /**
      * Set a new value for an existing key inside FormData,
      * or add the new field if it does not already exist.
      *
      * @param name The name of the field whose data is contained in `value`.
      * @param value The field's value. This can be [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob)
      or [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File). If none of these are specified the value is converted to a string.
      * @param fileName The filename reported to the server, when a Blob or File is passed as the second parameter. The default filename for Blob objects is "blob". The default filename for File objects is the file's filename.
      *
      */
    def set(name: String, value: Any): Unit = js.native
    def set(name: String, value: Any, fileName: String): Unit = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
    
    /**
      * Returns an [`iterator`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols) allowing to go through all values contained in this object `FormData` object.
      * Each value is a [`FormDataValue`](https://developer.mozilla.org/en-US/docs/Web/API/FormDataEntryValue).
      */
    def values(): SpecIterableIterator[FormDataEntryValue] = js.native
  }
  
  /**
    * A `string` or `File` that represents a single value from a set of `FormData` key-value pairs.
    */
  type FormDataEntryValue = String | File
}
