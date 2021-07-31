package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExifOrientationMode extends StObject
@JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
@js.native
object ExifOrientationMode extends StObject {
  
  @js.native
  sealed trait ignoreExifOrientation
    extends StObject
       with ExifOrientationMode
  
  @js.native
  sealed trait respectExifOrientation
    extends StObject
       with ExifOrientationMode
}
