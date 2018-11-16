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
  
  val path: path with java.lang.String = js.native
  val string: string with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType with java.lang.String
  ] = js.native
}

