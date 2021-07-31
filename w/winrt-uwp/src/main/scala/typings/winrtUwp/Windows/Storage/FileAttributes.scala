package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileAttributes extends StObject
/** Describes the attributes of a file or folder. */
@JSGlobal("Windows.Storage.FileAttributes")
@js.native
object FileAttributes extends StObject {
  
  /** The item is archived. */
  @js.native
  sealed trait archive
    extends StObject
       with FileAttributes
  
  /** The item is a directory. */
  @js.native
  sealed trait directory
    extends StObject
       with FileAttributes
  
  /** The item is locally incomplete. Windows only. */
  @js.native
  sealed trait locallyIncomplete
    extends StObject
       with FileAttributes
  
  /** The item is normal. That is, the item doesn't have any of the other values in the enumeration. */
  @js.native
  sealed trait normal
    extends StObject
       with FileAttributes
  
  /** The item is read-only. */
  @js.native
  sealed trait readOnly
    extends StObject
       with FileAttributes
  
  /** The item is a temporary file. */
  @js.native
  sealed trait temporary
    extends StObject
       with FileAttributes
}
