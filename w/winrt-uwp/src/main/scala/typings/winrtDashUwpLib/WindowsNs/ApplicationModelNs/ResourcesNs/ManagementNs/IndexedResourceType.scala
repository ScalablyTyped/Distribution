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
  
  /* 2 */ val embeddedData: embeddedData with scala.Double = js.native
  /* 1 */ val path: path with scala.Double = js.native
  /* 0 */ val string: string with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType with scala.Double
  ] = js.native
}

