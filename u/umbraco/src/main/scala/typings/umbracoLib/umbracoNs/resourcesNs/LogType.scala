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
  
  val Debug: Debug with java.lang.String = js.native
  val Info: Info with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.LogType with java.lang.String] = js.native
}

