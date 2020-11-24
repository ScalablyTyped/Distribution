package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-converter/dist/data/compiled_api", "SaverDef")
@js.native
object SaverDef extends js.Object {
  
  @js.native
  sealed trait CheckpointFormatVersion extends js.Object
  /** CheckpointFormatVersion enum. */
  @js.native
  object CheckpointFormatVersion extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CheckpointFormatVersion with Double] = js.native
    
    @js.native
    sealed trait LEGACY extends CheckpointFormatVersion
    /* 0 */ @js.native
    object LEGACY extends TopLevel[LEGACY with Double]
    
    @js.native
    sealed trait V1 extends CheckpointFormatVersion
    /* 1 */ @js.native
    object V1 extends TopLevel[V1 with Double]
    
    @js.native
    sealed trait V2 extends CheckpointFormatVersion
    /* 2 */ @js.native
    object V2 extends TopLevel[V2 with Double]
  }
}
