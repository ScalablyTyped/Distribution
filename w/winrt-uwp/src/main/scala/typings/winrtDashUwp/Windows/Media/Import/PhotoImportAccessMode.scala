package typings.winrtDashUwp.Windows.Media.Import

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhotoImportAccessMode extends js.Object

/** Specifies the access mode with which photos are imported. */
@JSGlobal("Windows.Media.Import.PhotoImportAccessMode")
@js.native
object PhotoImportAccessMode extends js.Object {
  /** Photos are imported with read and delete access. */
  @js.native
  sealed trait readAndDelete extends PhotoImportAccessMode
  
  /** Photos are imported with read-only access. */
  @js.native
  sealed trait readOnly extends PhotoImportAccessMode
  
  /** Photos are imported with read and write access. */
  @js.native
  sealed trait readWrite extends PhotoImportAccessMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhotoImportAccessMode with Double] = js.native
  /* 2 */ @js.native
  object readAndDelete extends TopLevel[readAndDelete with Double]
  
  /* 1 */ @js.native
  object readOnly extends TopLevel[readOnly with Double]
  
  /* 0 */ @js.native
  object readWrite extends TopLevel[readWrite with Double]
  
}

