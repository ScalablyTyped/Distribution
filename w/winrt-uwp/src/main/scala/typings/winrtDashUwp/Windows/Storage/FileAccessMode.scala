package typings.winrtDashUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Storage.FileAccessMode.read
import typings.winrtDashUwp.Windows.Storage.FileAccessMode.readWrite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileAccessMode extends js.Object

/** Specifies whether to access a file in read-only mode or in read/write mode. */
@JSGlobal("Windows.Storage.FileAccessMode")
@js.native
object FileAccessMode extends js.Object {
  /** Access the file stream in read-only mode. */
  @js.native
  sealed trait read extends FileAccessMode
  
  /** Access the file stream in read/write mode. */
  @js.native
  sealed trait readWrite extends FileAccessMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileAccessMode with Double] = js.native
  /* 0 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 1 */ @js.native
  object readWrite extends TopLevel[readWrite with Double]
  
}

