package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoImportAccessMode extends StObject
/** Specifies the access mode with which photos are imported. */
@JSGlobal("Windows.Media.Import.PhotoImportAccessMode")
@js.native
object PhotoImportAccessMode extends StObject {
  
  /** Photos are imported with read and delete access. */
  @js.native
  sealed trait readAndDelete
    extends StObject
       with PhotoImportAccessMode
  
  /** Photos are imported with read-only access. */
  @js.native
  sealed trait readOnly
    extends StObject
       with PhotoImportAccessMode
  
  /** Photos are imported with read and write access. */
  @js.native
  sealed trait readWrite
    extends StObject
       with PhotoImportAccessMode
}
