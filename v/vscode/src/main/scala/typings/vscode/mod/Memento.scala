package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Memento extends StObject {
  
  /**
    * Return a value.
    *
    * @param key A string.
    * @return The stored value or `undefined`.
    */
  def get[T](key: String): js.UndefOr[T] = js.native
  /**
    * Return a value.
    *
    * @param key A string.
    * @param defaultValue A value that should be returned when there is no
    * value (`undefined`) with the given key.
    * @return The stored value or the defaultValue.
    */
  def get[T](key: String, defaultValue: T): T = js.native
  
  /**
    * Store a value. The value must be JSON-stringifyable.
    *
    * @param key A string.
    * @param value A value. MUST not contain cyclic references.
    */
  def update(key: String, value: js.Any): Thenable[Unit] = js.native
}
