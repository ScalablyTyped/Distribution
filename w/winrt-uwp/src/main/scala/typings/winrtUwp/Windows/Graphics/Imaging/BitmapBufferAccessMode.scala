package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapBufferAccessMode extends StObject
/** Specifies the access mode of a BitmapBuffer . */
@JSGlobal("Windows.Graphics.Imaging.BitmapBufferAccessMode")
@js.native
object BitmapBufferAccessMode extends StObject {
  
  /** The buffer is read-only. */
  @js.native
  sealed trait read
    extends StObject
       with BitmapBufferAccessMode
  
  /** The buffer can be read from and written to. */
  @js.native
  sealed trait readWrite
    extends StObject
       with BitmapBufferAccessMode
  
  /** The buffer is write-only. */
  @js.native
  sealed trait write
    extends StObject
       with BitmapBufferAccessMode
}
