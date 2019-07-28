package typings.umbraco.umbracoNs.resourcesNs

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
  
  /* 0 */ val Debug: typings.umbraco.umbracoNs.resourcesNs.LogType.Debug with Double = js.native
  /* 1 */ val Info: typings.umbraco.umbracoNs.resourcesNs.LogType.Info with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogType with Double] = js.native
}

