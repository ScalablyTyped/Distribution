package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapAlphaMode extends StObject
@JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
@js.native
object BitmapAlphaMode extends StObject {
  
  @js.native
  sealed trait ignore
    extends StObject
       with BitmapAlphaMode
  
  @js.native
  sealed trait premultiplied
    extends StObject
       with BitmapAlphaMode
  
  @js.native
  sealed trait straight
    extends StObject
       with BitmapAlphaMode
}
