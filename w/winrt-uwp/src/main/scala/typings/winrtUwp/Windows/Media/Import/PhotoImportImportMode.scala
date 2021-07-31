package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportImportMode extends StObject
/** Specifies the types of files that are included in an import operation. */
@JSGlobal("Windows.Media.Import.PhotoImportImportMode")
@js.native
object PhotoImportImportMode extends StObject {
  
  /** Sibling files are ignored. */
  @js.native
  sealed trait ignoreSiblings
    extends StObject
       with PhotoImportImportMode
  
  /** Sidecar files are ignored. */
  @js.native
  sealed trait ignoreSidecars
    extends StObject
       with PhotoImportImportMode
  
  /** Sidecar files and sibling files are ignored. */
  @js.native
  sealed trait ignoreSidecarsAndSiblings
    extends StObject
       with PhotoImportImportMode
  
  /** All files are imported. */
  @js.native
  sealed trait importEverything
    extends StObject
       with PhotoImportImportMode
}
