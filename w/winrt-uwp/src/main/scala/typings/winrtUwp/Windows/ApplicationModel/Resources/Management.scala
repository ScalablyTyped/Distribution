package typings.winrtUwp.Windows.ApplicationModel.Resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Management {
  
  @js.native
  sealed trait IndexedResourceType extends StObject
  /** Specifies whether an IndexedResourceCandidate is a file or a string. */
  @JSGlobal("Windows.ApplicationModel.Resources.Management.IndexedResourceType")
  @js.native
  object IndexedResourceType extends StObject {
    
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
