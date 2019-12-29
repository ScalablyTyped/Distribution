package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileAttributes with Double] = js.native
  /* 3 */ @js.native
  object archive extends TopLevel[archive with Double]
  
  /* 2 */ @js.native
  object directory extends TopLevel[directory with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 1 */ @js.native
  object readOnly extends TopLevel[readOnly with Double]
  
  /* 4 */ @js.native
  object temporary extends TopLevel[temporary with Double]
  
}

