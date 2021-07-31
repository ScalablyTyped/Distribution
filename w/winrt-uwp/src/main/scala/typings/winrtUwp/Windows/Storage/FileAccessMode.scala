package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileAccessMode extends StObject
/** Specifies whether to access a file in read-only mode or in read/write mode. */
@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends StObject {
  
  /** Access the file stream in read-only mode. */
  @js.native
  sealed trait read
    extends StObject
       with FileAccessMode
  
  /** Access the file stream in read/write mode. */
  @js.native
  sealed trait readWrite
    extends StObject
       with FileAccessMode
}
