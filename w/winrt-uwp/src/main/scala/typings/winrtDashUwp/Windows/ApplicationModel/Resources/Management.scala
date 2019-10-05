package typings.winrtDashUwp.Windows.ApplicationModel.Resources

import typings.winrtDashUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Management")
@js.native
object Management extends js.Object {
  @js.native
  sealed trait IndexedResourceType extends js.Object
  
  /** Specifies whether an IndexedResourceCandidate is a file or a string. */
  @js.native
  object IndexedResourceType extends js.Object {
    /** Reserved. */
    @js.native
    sealed trait embeddedData extends IndexedResourceType
    
    /** The IndexedResourceCandidate is a file. */
    @js.native
    sealed trait path extends IndexedResourceType
    
    /** The IndexedResourceCandidate is a string. */
    @js.native
    sealed trait string extends IndexedResourceType
    
    /* 2 */ val embeddedData: typings.winrtDashUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.embeddedData with Double = js.native
    /* 1 */ val path: typings.winrtDashUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.path with Double = js.native
    /* 0 */ val string: typings.winrtDashUwp.Windows.ApplicationModel.Resources.Management.IndexedResourceType.string with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IndexedResourceType with Double] = js.native
  }
  
}

