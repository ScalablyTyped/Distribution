package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.TopLevel
import typings.umbraco.umbraco.resources.LogType.Debug
import typings.umbraco.umbraco.resources.LogType.Info
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogType with Double] = js.native
  /* 0 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  /* 1 */ @js.native
  object Info extends TopLevel[Info with Double]
  
}

