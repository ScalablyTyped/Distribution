package typings.yaml.typesMod

import typings.std.Iterable
import typings.yaml.utilMod.Type.DOCUMENT
import typings.yaml.utilMod.Type.FLOW_MAP
import typings.yaml.utilMod.Type.FLOW_SEQ
import typings.yaml.utilMod.Type.MAP
import typings.yaml.utilMod.Type.SEQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "Collection")
@js.native
class Collection () extends Node {
  
  /**
    * Adds a value to the collection. For `!!map` and `!!omap` the value must
    * be a Pair instance or a `{ key, value }` object, which may not have a key
    * that already exists in the map.
    */
  def add(value: js.Any): Unit = js.native
  
  def addIn(path: Iterable[js.Any], value: js.Any): Unit = js.native
  
  /**
    * Removes a value from the collection.
    * @returns `true` if the item was found and removed.
    */
  def delete(key: js.Any): Boolean = js.native
  
  def deleteIn(path: Iterable[js.Any]): Boolean = js.native
  
  /**
    * Returns item at `key`, or `undefined` if not found. By default unwraps
    * scalar values from their surrounding node; to disable set `keepScalar` to
    * `true` (collections are always returned intact).
    */
  def get(key: js.Any): js.Any = js.native
  def get(key: js.Any, keepScalar: Boolean): js.Any = js.native
  
  def getIn(path: Iterable[js.Any]): js.Any = js.native
  def getIn(path: Iterable[js.Any], keepScalar: Boolean): js.Any = js.native
  
  /**
    * Checks if the collection includes a value with the key `key`.
    */
  def has(key: js.Any): Boolean = js.native
  
  def hasIn(path: Iterable[js.Any]): Boolean = js.native
  
  var items: js.Array[js.Any] = js.native
  
  var schema: js.UndefOr[Schema] = js.native
  
  /**
    * Sets a value in this collection. For `!!set`, `value` needs to be a
    * boolean to add/remove the item from the set.
    */
  def set(key: js.Any, value: js.Any): Unit = js.native
  
  def setIn(path: Iterable[js.Any], value: js.Any): Unit = js.native
  
  @JSName("type")
  var type_Collection: js.UndefOr[MAP | FLOW_MAP | SEQ | FLOW_SEQ | DOCUMENT] = js.native
}
