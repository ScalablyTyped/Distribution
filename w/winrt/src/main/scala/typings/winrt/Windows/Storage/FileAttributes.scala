package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAttributes extends js.Object

@JSGlobal("Windows.Storage.FileAttributes")
@js.native
object FileAttributes extends js.Object {
  @js.native
  sealed trait archive extends FileAttributes
  
  @js.native
  sealed trait directory extends FileAttributes
  
  @js.native
  sealed trait normal extends FileAttributes
  
  @js.native
  sealed trait readOnly extends FileAttributes
  
  @js.native
  sealed trait temporary extends FileAttributes
  
  /* 3 */ val archive: typings.winrt.Windows.Storage.FileAttributes.archive with Double = js.native
  /* 2 */ val directory: typings.winrt.Windows.Storage.FileAttributes.directory with Double = js.native
  /* 0 */ val normal: typings.winrt.Windows.Storage.FileAttributes.normal with Double = js.native
  /* 1 */ val readOnly: typings.winrt.Windows.Storage.FileAttributes.readOnly with Double = js.native
  /* 4 */ val temporary: typings.winrt.Windows.Storage.FileAttributes.temporary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileAttributes with Double] = js.native
}

