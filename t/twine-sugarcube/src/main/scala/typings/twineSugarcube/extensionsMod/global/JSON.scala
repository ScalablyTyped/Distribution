package typings.twineSugarcube.extensionsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSON extends js.Object {
  
  /**
    * Returns the given code string, and optional data chunk, wrapped within the JSON deserialization revive wrapper.
    * Intended to allow authors to easily wrap their custom object types (a.k.a. classes) revival code and associated data
    * within the revive wrapper, which should be returned from an object instance's .toJSON() method, so that the instance
    * may be properly revived upon deserialization.
    * @param codeString The revival code string to wrap.
    * @param reviveData he data which should be made available to the evaluated revival code during deserialization via the
    * special $ReviveData$ variable. WARNING: Attempting to pass the value of an object instance's this directly as the
    * reviveData parameter will trigger out of control recursion in the serializer, so a clone of the instance's own data
    * must be passed instead.
    * @since SugarCube 2.9.0
    * @example
    * JSON.reviveWrapper( <valid JavaScript code string> ); // -> Without data chunk
    * JSON.reviveWrapper( <valid JavaScript code string> , myOwnData); // -> With data chunk
    * // E.g. Assume that you're attempting to revive an instance of a custom class named
    * // `Character`, which is assigned to a story variable named `$pc`.  The call
    * // to `JSON.reviveWrapper()` might look something like the following.
    * var ownData = {};
    * Object.keys(this).forEach(function (pn) { ownData[pn] = clone(this[pn]); }, this);
    * return JSON.reviveWrapper('new Character($ReviveData$)', ownData);
    */
  def reviveWrapper(codeString: java.lang.String): js.Array[js.Any] = js.native
  def reviveWrapper(codeString: java.lang.String, reviveData: js.Any): js.Array[js.Any] = js.native
}
