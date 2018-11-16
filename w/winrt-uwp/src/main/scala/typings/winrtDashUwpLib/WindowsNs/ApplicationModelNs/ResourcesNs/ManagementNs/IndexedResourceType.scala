package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexedResourceType extends js.Object

/** Specifies whether an IndexedResourceCandidate is a file or a string. */
@JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
@js.native
object IndexedResourceType extends js.Object {
  /** Reserved. */
  @js.native
  sealed trait embeddedData
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType
  
  /** The IndexedResourceCandidate is a file. */
  @js.native
  sealed trait path
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType
  
  /** The IndexedResourceCandidate is a string. */
  @js.native
  sealed trait string
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType
  
  val embeddedData: embeddedData with java.lang.String = js.native
  val path: path with java.lang.String = js.native
  val string: string with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType with java.lang.String
  ] = js.native
}

