package typings.winrt.Windows.ApplicationModel.Resources.Management

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path
import typings.winrt.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexedResourceType with Double] = js.native
  /* 1 */ @js.native
  object path extends TopLevel[path with Double]
  
  /* 0 */ @js.native
  object string extends TopLevel[string with Double]
  
}

