package typings.winrtUwp.Windows.ApplicationModel.Resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  }
}
