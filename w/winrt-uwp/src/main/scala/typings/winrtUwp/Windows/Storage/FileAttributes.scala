package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAttributes extends js.Object

/** Describes the attributes of a file or folder. */
@JSGlobal("Windows.Storage.FileAttributes")
@js.native
object FileAttributes extends js.Object {
  /** The item is archived. */
  @js.native
  sealed trait archive extends FileAttributes
  
  /** The item is a directory. */
  @js.native
  sealed trait directory extends FileAttributes
  
  /** The item is locally incomplete. Windows only. */
  @js.native
  sealed trait locallyIncomplete extends FileAttributes
  
  /** The item is normal. That is, the item doesn't have any of the other values in the enumeration. */
  @js.native
  sealed trait normal extends FileAttributes
  
  /** The item is read-only. */
  @js.native
  sealed trait readOnly extends FileAttributes
  
  /** The item is a temporary file. */
  @js.native
  sealed trait temporary extends FileAttributes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileAttributes with Double] = js.native
  /* 3 */ @js.native
  object archive extends TopLevel[archive with Double]
  
  /* 2 */ @js.native
  object directory extends TopLevel[directory with Double]
  
  /* 5 */ @js.native
  object locallyIncomplete extends TopLevel[locallyIncomplete with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object readOnly extends TopLevel[readOnly with Double]
  
  /* 4 */ @js.native
  object temporary extends TopLevel[temporary with Double]
  
}

