package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
