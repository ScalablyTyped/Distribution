package typings.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Typescript doesn't allow redefinition of type aliases even if they match,
// thus the _dt_alias to signal this being an alias for the use of DefinitelyTyped
/* Rewritten from type alias, can be one of: 
  - typings.webvrApi.webvrApiStrings.left
  - typings.webvrApi.webvrApiStrings.right
*/
trait VREyeDtAlias extends js.Object

object VREyeDtAlias {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.webvrApi.webvrApiStrings.left = this.cast("left")
  @scala.inline
  def right: typings.webvrApi.webvrApiStrings.right = this.cast("right")
}

