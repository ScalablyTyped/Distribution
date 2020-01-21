package typings.webix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webix.webixStrings.onBindRequest
  - typings.webix.webixStrings.onChange
*/
trait DataValueEventName extends js.Object

object DataValueEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onBindRequest: typings.webix.webixStrings.onBindRequest = this.cast("onBindRequest")
  @scala.inline
  def onChange: typings.webix.webixStrings.onChange = this.cast("onChange")
}

