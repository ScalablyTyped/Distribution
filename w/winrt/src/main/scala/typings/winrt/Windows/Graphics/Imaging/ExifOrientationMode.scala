package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExifOrientationMode extends js.Object
@JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
@js.native
object ExifOrientationMode extends js.Object {
  
  @js.native
  sealed trait ignoreExifOrientation extends ExifOrientationMode
  
  @js.native
  sealed trait respectExifOrientation extends ExifOrientationMode
}
