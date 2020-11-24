package typings.winreg.Winreg

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registry extends js.Object {
  
  /**
    * The registry hive architecture ('x86' or 'x64').
    * @readonly
    */
  var arch: String = js.native
  
  /**
    * Remove all subkeys and values (including the default value) from this registry key.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def clear(cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
  
  /**
    * Create this registry key. Note that this is a no-op if the key already exists.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def create(cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
  
  /**
    * Delete this key and all subkeys from the registry.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def destroy(cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
  
  /**
    * Alias for the clear method to keep it backward compatible.
    * @method
    * @deprecated Use {@link Registry#clear} or {@link Registry#destroy} in favour of this method.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def erase(cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
  
  /**
    * Gets a named value from this registry key.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err, item)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {RegistryItem=} cb.item - the retrieved registry item
    * @returns {Registry} this registry key object
    */
  def get(name: String, cb: js.Function2[/* err */ Error, /* result */ RegistryItem, Unit]): Registry = js.native
  
  /**
    * The hive id.
    * @readonly
    */
  var hive: String = js.native
  
  /**
    * The hostname.
    * @readonly
    */
  var host: String = js.native
  
  /**
    * The registry key name.
    * @readonly
    */
  var key: String = js.native
  
  /**
    * Checks if this key already exists.
    * @param {function (err, exists)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {boolean=} cb.exists - true if a registry key with this name already exists
    * @returns {Registry} this registry key object
    */
  def keyExists(cb: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Registry = js.native
  
  /**
    * Retrieve all subkeys from this registry key.
    * @param {function (err, items)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {array=} cb.items - an array of {@link Registry} objects
    * @returns {Registry} this registry key object
    */
  def keys(cb: js.Function2[/* err */ Error, /* result */ js.Array[this.type], Unit]): Registry = js.native
  
  /**
    * Creates a new {@link Registry} instance that points to the parent registry key.
    * @readonly
    */
  var parent: Registry = js.native
  
  /**
    * The full path to the registry key.
    * @readonly
    */
  var path: String = js.native
  
  /**
    * Remove a named value from this registry key. If name is empty, sets the default value of this key.
    * Note: This key must be already existing.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def remove(name: String, cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
  
  /**
    * Sets a named value in this registry key, overwriting an already existing value.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {string} type - the value type
    * @param {string} value - the value
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def set(name: String, `type`: String, value: String, cb: js.Function1[/* err */ Error, Unit]): Registry = js.native
  
  /**
    * Checks if a value with the given name already exists within this key.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err, exists)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {boolean=} cb.exists - true if a value with the given name was found in this key
    * @returns {Registry} this registry key object
    */
  def valueExists(name: String, cb: js.Function2[/* err */ Error, /* exists */ Boolean, Unit]): Registry = js.native
  
  /**
    * Retrieve all values from this registry key.
    * @param {valuesCallback} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {array=} cb.items - an array of {@link RegistryItem} objects
    * @returns {Registry} this registry key object
    */
  def values(cb: js.Function2[/* err */ Error, /* result */ js.Array[RegistryItem], Unit]): Registry = js.native
}
object Registry {
  
  @scala.inline
  def apply(
    arch: String,
    clear: js.Function1[/* err */ Error, Unit] => Registry,
    create: js.Function1[/* err */ Error, Unit] => Registry,
    destroy: js.Function1[/* err */ Error, Unit] => Registry,
    erase: js.Function1[/* err */ Error, Unit] => Registry,
    get: (String, js.Function2[/* err */ Error, /* result */ RegistryItem, Unit]) => Registry,
    hive: String,
    host: String,
    key: String,
    keyExists: js.Function2[/* err */ Error, /* exists */ Boolean, Unit] => Registry,
    keys: js.Function2[/* err */ Error, /* result */ js.Array[Registry], Unit] => Registry,
    parent: Registry,
    path: String,
    remove: (String, js.Function1[/* err */ Error, Unit]) => Registry,
    set: (String, String, String, js.Function1[/* err */ Error, Unit]) => Registry,
    valueExists: (String, js.Function2[/* err */ Error, /* exists */ Boolean, Unit]) => Registry,
    values: js.Function2[/* err */ Error, /* result */ js.Array[RegistryItem], Unit] => Registry
  ): Registry = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], clear = js.Any.fromFunction1(clear), create = js.Any.fromFunction1(create), destroy = js.Any.fromFunction1(destroy), erase = js.Any.fromFunction1(erase), get = js.Any.fromFunction2(get), hive = hive.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyExists = js.Any.fromFunction1(keyExists), keys = js.Any.fromFunction1(keys), parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction4(set), valueExists = js.Any.fromFunction2(valueExists), values = js.Any.fromFunction1(values))
    __obj.asInstanceOf[Registry]
  }
  
  @scala.inline
  implicit class RegistryOps[Self <: Registry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: js.Function1[/* err */ Error, Unit] => Registry): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreate(value: js.Function1[/* err */ Error, Unit] => Registry): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: js.Function1[/* err */ Error, Unit] => Registry): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErase(value: js.Function1[/* err */ Error, Unit] => Registry): Self = this.set("erase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: (String, js.Function2[/* err */ Error, /* result */ RegistryItem, Unit]) => Registry): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHive(value: String): Self = this.set("hive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExists(value: js.Function2[/* err */ Error, /* exists */ Boolean, Unit] => Registry): Self = this.set("keyExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: js.Function2[/* err */ Error, /* result */ js.Array[Registry], Unit] => Registry): Self = this.set("keys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: Registry): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: (String, js.Function1[/* err */ Error, Unit]) => Registry): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (String, String, String, js.Function1[/* err */ Error, Unit]) => Registry): Self = this.set("set", js.Any.fromFunction4(value))
    
    @scala.inline
    def setValueExists(value: (String, js.Function2[/* err */ Error, /* exists */ Boolean, Unit]) => Registry): Self = this.set("valueExists", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValues(value: js.Function2[/* err */ Error, /* result */ js.Array[RegistryItem], Unit] => Registry): Self = this.set("values", js.Any.fromFunction1(value))
  }
}
