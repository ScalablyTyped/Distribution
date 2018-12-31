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
  
  val Ascending: Ascending with java.lang.String = js.native
  val Descending: Descending with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.Direction with java.lang.String] = js.native
}

