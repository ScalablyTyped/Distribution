package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.FileAccessMode.read
import typings.winrt.Windows.Storage.FileAccessMode.readWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAccessMode extends js.Object

@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends js.Object {
  @js.native
  sealed trait read extends FileAccessMode
  
  @js.native
  sealed trait readWrite extends FileAccessMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileAccessMode with Double] = js.native
  /* 0 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 1 */ @js.native
  object readWrite extends TopLevel[readWrite with Double]
  
}

