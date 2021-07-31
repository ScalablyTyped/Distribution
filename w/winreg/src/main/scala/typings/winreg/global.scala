package typings.winreg

import org.scalablytyped.runtime.Shortcut
import typings.std.Error
import typings.winreg.Winreg.Options
import typings.winreg.Winreg.Registry
import typings.winreg.Winreg.RegistryItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Winreg extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Winreg")
    @js.native
    class ^ protected ()
      extends StObject
         with Registry {
      /**
        * Creates a registry object, which provides access to a single registry key.
        * Note: This class is returned by a call to ```require('winreg')```.
        *
        * @public
        * @class
        *
        * @param {@link Options} options - the options
        *
        * @example
        * var Registry = require('winreg')
        * ,   autoStartCurrentUser = new Registry({
        *       hive: Registry.HKCU,
        *       key:  '\\Software\\Microsoft\\Windows\\CurrentVersion\\Run'
        *     });
        */
      def this(options: Options) = this()
      
      /**
        * The registry hive architecture ('x86' or 'x64').
        * @readonly
        */
      /* CompleteClass */
      var arch: String = js.native
      
      /**
        * Remove all subkeys and values (including the default value) from this registry key.
        * @param {function (err)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def clear(cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
      
      /**
        * Create this registry key. Note that this is a no-op if the key already exists.
        * @param {function (err)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def create(cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
      
      /**
        * Delete this key and all subkeys from the registry.
        * @param {function (err)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def destroy(cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
      
      /**
        * Alias for the clear method to keep it backward compatible.
        * @method
        * @deprecated Use {@link Registry#clear} or {@link Registry#destroy} in favour of this method.
        * @param {function (err)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def erase(cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
      
      /**
        * Gets a named value from this registry key.
        * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
        * @param {function (err, item)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @param {RegistryItem=} cb.item - the retrieved registry item
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def get(name: String, cb: js.Function2[/* err */ Error, /* result */ RegistryItem, Unit]): Registry = js.native
      
      /**
        * The hive id.
        * @readonly
        */
      /* CompleteClass */
      var hive: String = js.native
      
      /**
        * The hostname.
        * @readonly
        */
      /* CompleteClass */
      var host: String = js.native
      
      /**
        * The registry key name.
        * @readonly
        */
      /* CompleteClass */
      var key: String = js.native
      
      /**
        * Checks if this key already exists.
        * @param {function (err, exists)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @param {boolean=} cb.exists - true if a registry key with this name already exists
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def keyExists(cb: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Registry = js.native
      
      /**
        * Retrieve all subkeys from this registry key.
        * @param {function (err, items)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @param {array=} cb.items - an array of {@link Registry} objects
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def keys(cb: js.Function2[/* err */ Error, /* result */ js.Array[this.type], Unit]): Registry = js.native
      
      /**
        * Creates a new {@link Registry} instance that points to the parent registry key.
        * @readonly
        */
      /* CompleteClass */
      var parent: Registry = js.native
      
      /**
        * The full path to the registry key.
        * @readonly
        */
      /* CompleteClass */
      var path: String = js.native
      
      /**
        * Remove a named value from this registry key. If name is empty, sets the default value of this key.
        * Note: This key must be already existing.
        * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
        * @param {function (err)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def remove(name: String, cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
      
      /**
        * Sets a named value in this registry key, overwriting an already existing value.
        * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
        * @param {string} type - the value type
        * @param {string} value - the value
        * @param {function (err)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def set(name: String, `type`: String, value: String, cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
      
      /**
        * Checks if a value with the given name already exists within this key.
        * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
        * @param {function (err, exists)} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @param {boolean=} cb.exists - true if a value with the given name was found in this key
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def valueExists(name: String, cb: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Registry = js.native
      
      /**
        * Retrieve all values from this registry key.
        * @param {valuesCallback} cb - callback function
        * @param {error=} cb.err - error object or null if successful
        * @param {array=} cb.items - an array of {@link RegistryItem} objects
        * @returns {Registry} this registry key object
        */
      /* CompleteClass */
      override def values(cb: js.Function2[/* err */ Error, /* result */ js.Array[RegistryItem], Unit]): Registry = js.native
    }
    
    @JSGlobal("Winreg")
    @js.native
    val ^ : WinregStatic = js.native
    
    type _To = WinregStatic
    
    /* This means you don't have to write `^`, but can instead just say `Winreg.foo` */
    override def _to: WinregStatic = ^
  }
}
