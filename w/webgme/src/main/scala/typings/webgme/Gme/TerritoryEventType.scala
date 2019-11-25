package typings.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webgme.webgmeStrings.load
  - typings.webgme.webgmeStrings.unload
  - typings.webgme.webgmeStrings.update
  - typings.webgme.webgmeStrings.complete
  - typings.webgme.webgmeStrings.incomplete
*/
trait TerritoryEventType extends js.Object

object TerritoryEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.webgme.webgmeStrings.complete = this.cast("complete")
  @scala.inline
  def incomplete: typings.webgme.webgmeStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def load: typings.webgme.webgmeStrings.load = this.cast("load")
  @scala.inline
  def unload: typings.webgme.webgmeStrings.unload = this.cast("unload")
  @scala.inline
  def update: typings.webgme.webgmeStrings.update = this.cast("update")
}

