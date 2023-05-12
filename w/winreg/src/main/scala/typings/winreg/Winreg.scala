package typings.winreg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Winreg {
  
  trait Options extends StObject {
    
    /**
      * Optional registry hive architecture ('x86' or 'x64'; only valid on Windows 64 Bit Operating Systems).
      */
    var arch: js.UndefOr[String] = js.undefined
    
    /**
      * Optional hive ID, default is HKLM.
      */
    var hive: js.UndefOr[String] = js.undefined
    
    /**
      * Optional hostname, must start with '\\' sequence.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Optional key, default is the root key.
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setHive(value: String): Self = StObject.set(x, "hive", value.asInstanceOf[js.Any])
      
      inline def setHiveUndefined: Self = StObject.set(x, "hive", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Registry extends StObject {
    
    /**
      * The registry hive architecture ('x86' or 'x64').
      */
    var arch: String
    
    /**
      * Remove all subkeys and values (including the default value) from this registry key.
      * @param {function (err)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @returns {Registry} this registry key object
      */
    def clear(cb: js.Function1[/* err */ js.Error, Unit]): Registry
    
    /**
      * Create this registry key. Note that this is a no-op if the key already exists.
      * @param {function (err)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @returns {Registry} this registry key object
      */
    def create(cb: js.Function1[/* err */ js.Error, Unit]): Registry
    
    /**
      * Delete this key and all subkeys from the registry.
      * @param {function (err)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @returns {Registry} this registry key object
      */
    def destroy(cb: js.Function1[/* err */ js.Error, Unit]): Registry
    
    /**
      * Alias for the clear method to keep it backward compatible.
      * @method
      * @deprecated Use {@link Registry#clear} or {@link Registry#destroy} in favour of this method.
      * @param {function (err)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @returns {Registry} this registry key object
      */
    def erase(cb: js.Function1[/* err */ js.Error, Unit]): Registry
    
    /**
      * Gets a named value from this registry key.
      * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
      * @param {function (err, item)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @param {RegistryItem=} cb.item - the retrieved registry item
      * @returns {Registry} this registry key object
      */
    def get(name: String, cb: js.Function2[/* err */ js.Error, /* result */ RegistryItem, Unit]): Registry
    
    /**
      * The hive id.
      */
    var hive: String
    
    /**
      * The hostname.
      */
    var host: String
    
    /**
      * The registry key name.
      */
    var key: String
    
    /**
      * Checks if this key already exists.
      * @param {function (err, exists)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @param {boolean=} cb.exists - true if a registry key with this name already exists
      * @returns {Registry} this registry key object
      */
    def keyExists(cb: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Registry
    
    /**
      * Retrieve all subkeys from this registry key.
      * @param {function (err, items)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @param {array=} cb.items - an array of {@link Registry} objects
      * @returns {Registry} this registry key object
      */
    def keys(cb: js.Function2[/* err */ js.Error, /* result */ js.Array[this.type], Unit]): Registry
    
    /**
      * Creates a new {@link Registry} instance that points to the parent registry key.
      */
    var parent: Registry
    
    /**
      * The full path to the registry key.
      */
    var path: String
    
    /**
      * Remove a named value from this registry key. If name is empty, sets the default value of this key.
      * Note: This key must be already existing.
      * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
      * @param {function (err)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @returns {Registry} this registry key object
      */
    def remove(name: String, cb: js.Function1[/* err */ js.Error, Unit]): Registry
    
    /**
      * Sets a named value in this registry key, overwriting an already existing value.
      * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
      * @param {string} type - the value type
      * @param {string} value - the value
      * @param {function (err)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @returns {Registry} this registry key object
      */
    def set(name: String, `type`: String, value: String, cb: js.Function1[/* err */ js.Error, Unit]): Registry
    
    /**
      * Checks if a value with the given name already exists within this key.
      * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
      * @param {function (err, exists)} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @param {boolean=} cb.exists - true if a value with the given name was found in this key
      * @returns {Registry} this registry key object
      */
    def valueExists(name: String, cb: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Registry
    
    /**
      * Retrieve all values from this registry key.
      * @param {valuesCallback} cb - callback function
      * @param {error=} cb.err - error object or null if successful
      * @param {array=} cb.items - an array of {@link RegistryItem} objects
      * @returns {Registry} this registry key object
      */
    def values(cb: js.Function2[/* err */ js.Error, /* result */ js.Array[RegistryItem], Unit]): Registry
  }
  object Registry {
    
    inline def apply(
      arch: String,
      clear: js.Function1[/* err */ js.Error, Unit] => Registry,
      create: js.Function1[/* err */ js.Error, Unit] => Registry,
      destroy: js.Function1[/* err */ js.Error, Unit] => Registry,
      erase: js.Function1[/* err */ js.Error, Unit] => Registry,
      get: (String, js.Function2[/* err */ js.Error, /* result */ RegistryItem, Unit]) => Registry,
      hive: String,
      host: String,
      key: String,
      keyExists: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit] => Registry,
      keys: js.Function2[/* err */ js.Error, /* result */ js.Array[Registry], Unit] => Registry,
      parent: Registry,
      path: String,
      remove: (String, js.Function1[/* err */ js.Error, Unit]) => Registry,
      set: (String, String, String, js.Function1[/* err */ js.Error, Unit]) => Registry,
      valueExists: (String, js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]) => Registry,
      values: js.Function2[/* err */ js.Error, /* result */ js.Array[RegistryItem], Unit] => Registry
    ): Registry = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], clear = js.Any.fromFunction1(clear), create = js.Any.fromFunction1(create), destroy = js.Any.fromFunction1(destroy), erase = js.Any.fromFunction1(erase), get = js.Any.fromFunction2(get), hive = hive.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyExists = js.Any.fromFunction1(keyExists), keys = js.Any.fromFunction1(keys), parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction4(set), valueExists = js.Any.fromFunction2(valueExists), values = js.Any.fromFunction1(values))
      __obj.asInstanceOf[Registry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Registry] (val x: Self) extends AnyVal {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setClear(value: js.Function1[/* err */ js.Error, Unit] => Registry): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setCreate(value: js.Function1[/* err */ js.Error, Unit] => Registry): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: js.Function1[/* err */ js.Error, Unit] => Registry): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setErase(value: js.Function1[/* err */ js.Error, Unit] => Registry): Self = StObject.set(x, "erase", js.Any.fromFunction1(value))
      
      inline def setGet(value: (String, js.Function2[/* err */ js.Error, /* result */ RegistryItem, Unit]) => Registry): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setHive(value: String): Self = StObject.set(x, "hive", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyExists(value: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit] => Registry): Self = StObject.set(x, "keyExists", js.Any.fromFunction1(value))
      
      inline def setKeys(value: js.Function2[/* err */ js.Error, /* result */ js.Array[Registry], Unit] => Registry): Self = StObject.set(x, "keys", js.Any.fromFunction1(value))
      
      inline def setParent(value: Registry): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: (String, js.Function1[/* err */ js.Error, Unit]) => Registry): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setSet(value: (String, String, String, js.Function1[/* err */ js.Error, Unit]) => Registry): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
      
      inline def setValueExists(value: (String, js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]) => Registry): Self = StObject.set(x, "valueExists", js.Any.fromFunction2(value))
      
      inline def setValues(value: js.Function2[/* err */ js.Error, /* result */ js.Array[RegistryItem], Unit] => Registry): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
    }
  }
  
  trait RegistryItem extends StObject {
    
    /**
      * The hive architecture.
      */
    var arch: String
    
    /**
      * The hive id.
      */
    var hive: String
    
    /**
      * The hostname.
      */
    var host: String
    
    /**
      * The registry key.
      */
    var key: String
    
    /**
      * The value name.
      */
    var name: String
    
    /**
      * The value type.
      */
    var `type`: String
    
    /**
      * The value.
      */
    var value: String
  }
  object RegistryItem {
    
    inline def apply(arch: String, hive: String, host: String, key: String, name: String, `type`: String, value: String): RegistryItem = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], hive = hive.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistryItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistryItem] (val x: Self) extends AnyVal {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setHive(value: String): Self = StObject.set(x, "hive", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
