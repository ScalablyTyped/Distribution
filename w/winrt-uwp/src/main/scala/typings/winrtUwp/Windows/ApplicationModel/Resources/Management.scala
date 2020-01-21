package typings.winrtUwp.Windows.ApplicationModel.Resources

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IndexedResourceType with Double] = js.native
    /* 2 */ @js.native
    object embeddedData extends TopLevel[embeddedData with Double]
    
    /* 1 */ @js.native
    object path extends TopLevel[path with Double]
    
    /* 0 */ @js.native
    object string extends TopLevel[string with Double]
    
  }
  
}

