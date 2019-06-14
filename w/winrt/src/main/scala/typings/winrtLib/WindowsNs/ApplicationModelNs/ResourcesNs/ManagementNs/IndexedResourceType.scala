package typings
package winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexedResourceType extends js.Object

@JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
@js.native
object IndexedResourceType extends js.Object {
  @js.native
  sealed trait path
    extends winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType
  
  @js.native
  sealed trait string
    extends winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType
  
  /* 1 */ val path: path with scala.Double = js.native
  /* 0 */ val string: string with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType with scala.Double
  ] = js.native
}

