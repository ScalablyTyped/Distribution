package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogType extends js.Object

/**
  * LogType
  */
@JSGlobal("umbraco.resources.LogType")
@js.native
object LogType extends js.Object {
  @js.native
  sealed trait Debug extends LogType
  
  @js.native
  sealed trait Info extends LogType
  
}

