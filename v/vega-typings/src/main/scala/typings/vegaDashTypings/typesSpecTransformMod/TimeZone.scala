package typings.vegaDashTypings.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.vegaDashTypingsStrings.local
  - typings.vegaDashTypings.vegaDashTypingsStrings.utc
*/
trait TimeZone extends js.Object

object TimeZone {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def local: typings.vegaDashTypings.vegaDashTypingsStrings.local = this.cast("local")
  @scala.inline
  def utc: typings.vegaDashTypings.vegaDashTypingsStrings.utc = this.cast("utc")
}

