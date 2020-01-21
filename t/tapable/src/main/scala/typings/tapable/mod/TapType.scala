package typings.tapable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tapable.tapableStrings.sync
  - typings.tapable.tapableStrings.async
  - typings.tapable.tapableStrings.promise
*/
trait TapType extends js.Object

object TapType {
  @scala.inline
  def async: typings.tapable.tapableStrings.async = this.cast("async")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def promise: typings.tapable.tapableStrings.promise = this.cast("promise")
  @scala.inline
  def sync: typings.tapable.tapableStrings.sync = this.cast("sync")
}

