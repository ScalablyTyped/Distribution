package typings
package umbracoLib.umbracoNs.resourcesNs

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
  sealed trait Debug
    extends umbracoLib.umbracoNs.resourcesNs.LogType
  
  @js.native
  sealed trait Info
    extends umbracoLib.umbracoNs.resourcesNs.LogType
  
  /* 0 */ val Debug: Debug with scala.Double = js.native
  /* 1 */ val Info: Info with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.LogType with scala.Double] = js.native
}

