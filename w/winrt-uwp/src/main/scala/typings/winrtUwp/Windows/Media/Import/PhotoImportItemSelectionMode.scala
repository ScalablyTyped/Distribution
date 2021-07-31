package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportItemSelectionMode extends StObject
/** Specifies the initial selection state for items that are discovered using PhotoImportSession::FindItemsAsync . */
@JSGlobal("Windows.Media.Import.PhotoImportItemSelectionMode")
@js.native
object PhotoImportItemSelectionMode extends StObject {
  
  /** All found items are initially selected. */
  @js.native
  sealed trait selectAll
    extends StObject
       with PhotoImportItemSelectionMode
  
  /** New found items are initially selected. */
  @js.native
  sealed trait selectNew
    extends StObject
       with PhotoImportItemSelectionMode
  
  /** No found items are initially selected. */
  @js.native
  sealed trait selectNone
    extends StObject
       with PhotoImportItemSelectionMode
}
