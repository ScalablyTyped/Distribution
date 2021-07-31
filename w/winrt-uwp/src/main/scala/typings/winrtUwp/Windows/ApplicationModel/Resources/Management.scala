package typings.winrtUwp.Windows.ApplicationModel.Resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    sealed trait embeddedData
      extends StObject
         with IndexedResourceType
    
    /** The IndexedResourceCandidate is a file. */
    @js.native
    sealed trait path
      extends StObject
         with IndexedResourceType
    
    /** The IndexedResourceCandidate is a string. */
    @js.native
    sealed trait string
      extends StObject
         with IndexedResourceType
  }
}
