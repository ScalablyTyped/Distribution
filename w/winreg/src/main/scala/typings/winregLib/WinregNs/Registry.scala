package typings
package winregLib.WinregNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  /**
    * The registry hive architecture ('x86' or 'x64').
    * @readonly
    */
  var arch: java.lang.String
  /**
    * The hive id.
    * @readonly
    */
  var hive: java.lang.String
  /**
    * The hostname.
    * @readonly
    */
  var host: java.lang.String
  /**
    * The registry key name.
    * @readonly
    */
  var key: java.lang.String
  /**
    * Creates a new {@link Registry} instance that points to the parent registry key.
    * @readonly
    */
  var parent: Registry
  /**
    * The full path to the registry key.
    * @readonly
    */
  var path: java.lang.String
  /**
    * Remove all subkeys and values (including the default value) from this registry key.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def clear(cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): Registry
  /**
    * Create this registry key. Note that this is a no-op if the key already exists.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def create(cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): Registry
  /**
    * Delete this key and all subkeys from the registry.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def destroy(cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): Registry
  /**
    * Alias for the clear method to keep it backward compatible.
    * @method
    * @deprecated Use {@link Registry#clear} or {@link Registry#destroy} in favour of this method.
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def erase(cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): Registry
  /**
    * Gets a named value from this registry key.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err, item)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {RegistryItem=} cb.item - the retrieved registry item
    * @returns {Registry} this registry key object
    */
  def get(
    name: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* result */ RegistryItem, scala.Unit]
  ): Registry
  /**
    * Checks if this key already exists.
    * @param {function (err, exists)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {boolean=} cb.exists - true if a registry key with this name already exists
    * @returns {Registry} this registry key object
    */
  def keyExists(cb: js.Function2[/* err */ stdLib.Error, /* exists */ scala.Boolean, scala.Unit]): Registry
  /**
    * Retrieve all subkeys from this registry key.
    * @param {function (err, items)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {array=} cb.items - an array of {@link Registry} objects
    * @returns {Registry} this registry key object
    */
  def keys(cb: js.Function2[/* err */ stdLib.Error, /* result */ js.Array[this.type], scala.Unit]): Registry
  /**
    * Remove a named value from this registry key. If name is empty, sets the default value of this key.
    * Note: This key must be already existing.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def remove(name: java.lang.String, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): Registry
  /**
    * Sets a named value in this registry key, overwriting an already existing value.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {string} type - the value type
    * @param {string} value - the value
    * @param {function (err)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @returns {Registry} this registry key object
    */
  def set(
    name: java.lang.String,
    `type`: java.lang.String,
    value: java.lang.String,
    cb: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): Registry
  /**
    * Checks if a value with the given name already exists within this key.
    * @param {string} name - the value name, use {@link Registry.DEFAULT_VALUE} or an empty string for the default value
    * @param {function (err, exists)} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {boolean=} cb.exists - true if a value with the given name was found in this key
    * @returns {Registry} this registry key object
    */
  def valueExists(
    name: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* exists */ scala.Boolean, scala.Unit]
  ): Registry
  /**
    * Retrieve all values from this registry key.
    * @param {valuesCallback} cb - callback function
    * @param {error=} cb.err - error object or null if successful
    * @param {array=} cb.items - an array of {@link RegistryItem} objects
    * @returns {Registry} this registry key object
    */
  def values(cb: js.Function2[/* err */ stdLib.Error, /* result */ js.Array[RegistryItem], scala.Unit]): Registry
}

object Registry {
  @scala.inline
  def apply(
    arch: java.lang.String,
    clear: js.Function1[js.Function1[/* err */ stdLib.Error, scala.Unit], Registry],
    create: js.Function1[js.Function1[/* err */ stdLib.Error, scala.Unit], Registry],
    destroy: js.Function1[js.Function1[/* err */ stdLib.Error, scala.Unit], Registry],
    erase: js.Function1[js.Function1[/* err */ stdLib.Error, scala.Unit], Registry],
    get: js.Function2[
      java.lang.String, 
      js.Function2[/* err */ stdLib.Error, /* result */ RegistryItem, scala.Unit], 
      Registry
    ],
    hive: java.lang.String,
    host: java.lang.String,
    key: java.lang.String,
    keyExists: js.Function1[
      js.Function2[/* err */ stdLib.Error, /* exists */ scala.Boolean, scala.Unit], 
      Registry
    ],
    keys: js.Function1[
      js.Function2[/* err */ stdLib.Error, /* result */ js.Array[Registry], scala.Unit], 
      Registry
    ],
    parent: Registry,
    path: java.lang.String,
    remove: js.Function2[java.lang.String, js.Function1[/* err */ stdLib.Error, scala.Unit], Registry],
    set: js.Function4[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      js.Function1[/* err */ stdLib.Error, scala.Unit], 
      Registry
    ],
    valueExists: js.Function2[
      java.lang.String, 
      js.Function2[/* err */ stdLib.Error, /* exists */ scala.Boolean, scala.Unit], 
      Registry
    ],
    values: js.Function1[
      js.Function2[/* err */ stdLib.Error, /* result */ js.Array[RegistryItem], scala.Unit], 
      Registry
    ]
  ): Registry = {
    val __obj = js.Dynamic.literal(arch = arch, clear = clear, create = create, destroy = destroy, erase = erase, get = get, hive = hive, host = host, key = key, keyExists = keyExists, keys = keys, parent = parent, path = path, remove = remove, set = set, valueExists = valueExists, values = values)
  
    __obj.asInstanceOf[Registry]
  }
}

