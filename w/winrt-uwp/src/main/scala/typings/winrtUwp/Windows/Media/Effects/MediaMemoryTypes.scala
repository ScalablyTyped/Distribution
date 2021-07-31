package typings.winrtUwp.Windows.Media.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaMemoryTypes extends StObject
/** Specifies the types of memory that can be used for a media operation. */
@JSGlobal("Windows.Media.Effects.MediaMemoryTypes")
@js.native
object MediaMemoryTypes extends StObject {
  
  /** CPU memory. */
  @js.native
  sealed trait cpu
    extends StObject
       with MediaMemoryTypes
  
  /** GPU memory. */
  @js.native
  sealed trait gpu
    extends StObject
       with MediaMemoryTypes
  
  /** Both GPU and CPU memory. */
  @js.native
  sealed trait gpuAndCpu
    extends StObject
       with MediaMemoryTypes
}
