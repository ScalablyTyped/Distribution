package typings.webix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webix.webixStrings.onAfterLoad
  - typings.webix.webixStrings.onBeforeLoad
  - typings.webix.webixStrings.onBindRequest
  - typings.webix.webixStrings.onChange
  - typings.webix.webixStrings.onLoadError
*/
trait DataRecordEventName extends js.Object

object DataRecordEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onAfterLoad: typings.webix.webixStrings.onAfterLoad = this.cast("onAfterLoad")
  @scala.inline
  def onBeforeLoad: typings.webix.webixStrings.onBeforeLoad = this.cast("onBeforeLoad")
  @scala.inline
  def onBindRequest: typings.webix.webixStrings.onBindRequest = this.cast("onBindRequest")
  @scala.inline
  def onChange: typings.webix.webixStrings.onChange = this.cast("onChange")
  @scala.inline
  def onLoadError: typings.webix.webixStrings.onLoadError = this.cast("onLoadError")
}

