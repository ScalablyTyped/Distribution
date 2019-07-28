package typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexedResourceType extends js.Object

@JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
@js.native
object IndexedResourceType extends js.Object {
  @js.native
  sealed trait path extends IndexedResourceType
  
  @js.native
  sealed trait string extends IndexedResourceType
  
  /* 1 */ val path: typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType.path with Double = js.native
  /* 0 */ val string: typings.winrt.WindowsNs.ApplicationModelNs.ResourcesNs.ManagementNs.IndexedResourceType.string with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexedResourceType with Double] = js.native
}

