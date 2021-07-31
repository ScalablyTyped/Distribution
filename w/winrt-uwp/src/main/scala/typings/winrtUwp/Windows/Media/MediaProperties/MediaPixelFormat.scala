package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPixelFormat extends StObject
/** Defines values for media pixel formats. */
@JSGlobal("Windows.Media.MediaProperties.MediaPixelFormat")
@js.native
object MediaPixelFormat extends StObject {
  
  /** BGRA8 media pixel format. */
  @js.native
  sealed trait bgra8
    extends StObject
       with MediaPixelFormat
  
  /** NV12 media pixel format. */
  @js.native
  sealed trait nv12
    extends StObject
       with MediaPixelFormat
}
