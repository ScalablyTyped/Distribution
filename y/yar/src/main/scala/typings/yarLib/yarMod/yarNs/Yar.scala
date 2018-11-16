package typings
package yarLib.yarMod.yarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Yar extends js.Object {
  /**
           * Session id, see `customSessionIDGenerator`.
           */
  val id: java.lang.String = js.native
  /**
           * clears key.
           */
  def clear(key: java.lang.String): scala.Unit = js.native
  /**
           * stores volatile data - data that should be deleted once read.
           * When given no arguments, it will return all of the flash messages and delete the originals.
           * When given only a type, it will return all of the flash messages of that type and delete the originals.
           * When given a type and a message, it will set or append that message to the given type.
           * 'isOverride' used to indicate that the message provided should replace
           * any existing value instead of being appended to it (defaults to false).
           */
  def flash(`type`: java.lang.String): js.Array[_] = js.native
  /**
           * stores volatile data - data that should be deleted once read.
           * When given no arguments, it will return all of the flash messages and delete the originals.
           * When given only a type, it will return all of the flash messages of that type and delete the originals.
           * When given a type and a message, it will set or append that message to the given type.
           * 'isOverride' used to indicate that the message provided should replace
           * any existing value instead of being appended to it (defaults to false).
           */
  def flash(`type`: java.lang.String, message: js.Any): js.Array[_] = js.native
  /**
           * stores volatile data - data that should be deleted once read.
           * When given no arguments, it will return all of the flash messages and delete the originals.
           * When given only a type, it will return all of the flash messages of that type and delete the originals.
           * When given a type and a message, it will set or append that message to the given type.
           * 'isOverride' used to indicate that the message provided should replace
           * any existing value instead of being appended to it (defaults to false).
           */
  def flash(`type`: java.lang.String, message: js.Any, isOverride: scala.Boolean): js.Array[_] = js.native
  /**
           * retrieve value using a key. If 'clear' is 'true', key is cleared on return.
           */
  def get(key: java.lang.String): js.Any = js.native
  /**
           * retrieve value using a key. If 'clear' is 'true', key is cleared on return.
           */
  def get(key: java.lang.String, clear: scala.Boolean): js.Any = js.native
  /**
           * if set to 'true', enables lazy mode.
           * In lazy mode, request.yar can be modified directly (e.g. setting request.yar.myKey to an object value),
           * and those keys will be stored and loaded back.
           * Lazy mode isn't as fast as the normal get/set because
           * it has to store the session state on every responses regardless of any changes being made.
           */
  def `lazy`(enabled: scala.Boolean): scala.Unit = js.native
  /**
           * clears the session and assigns a new session id.
           */
  def reset(): scala.Unit = js.native
  /**
           * - assigns a value (string, object, etc) to a given key which will persist across requests. Returns the value.
           */
  def set[T](key: java.lang.String, value: T): T = js.native
  /**
           *  assigns values to multiple keys using each 'keysObject' top-level property. Returns the keysObject.
           */
  def set[T /* <: ScalablyTyped.runtime.StringDictionary[js.Any] */](keysObject: T): T = js.native
  /**
           * Manually notify the session of changes (when using get()
           * and changing the content of the returned reference directly without calling set()).
           */
  def touch(): scala.Unit = js.native
}

