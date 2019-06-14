package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

/**
  * Can be Ascending or Descending - Default: Ascending
  */
@JSGlobal("umbraco.resources.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait Ascending
    extends umbracoLib.umbracoNs.resourcesNs.Direction
  
  @js.native
  sealed trait Descending
    extends umbracoLib.umbracoNs.resourcesNs.Direction
  
  /* 0 */ val Ascending: Ascending with scala.Double = js.native
  /* 1 */ val Descending: Descending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.Direction with scala.Double] = js.native
}

