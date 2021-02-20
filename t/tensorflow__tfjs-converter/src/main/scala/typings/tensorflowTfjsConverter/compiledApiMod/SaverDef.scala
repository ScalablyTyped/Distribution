package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SaverDef {
  
  @js.native
  sealed trait CheckpointFormatVersion extends StObject
  /** CheckpointFormatVersion enum. */
  @JSImport("@tensorflow/tfjs-converter/dist/data/compiled_api", "SaverDef.CheckpointFormatVersion")
  @js.native
  object CheckpointFormatVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CheckpointFormatVersion with Double] = js.native
    
    @js.native
    sealed trait LEGACY extends CheckpointFormatVersion
    /* 0 */ val LEGACY: typings.tensorflowTfjsConverter.compiledApiMod.SaverDef.CheckpointFormatVersion.LEGACY with Double = js.native
    
    @js.native
    sealed trait V1 extends CheckpointFormatVersion
    /* 1 */ val V1: typings.tensorflowTfjsConverter.compiledApiMod.SaverDef.CheckpointFormatVersion.V1 with Double = js.native
    
    @js.native
    sealed trait V2 extends CheckpointFormatVersion
    /* 2 */ val V2: typings.tensorflowTfjsConverter.compiledApiMod.SaverDef.CheckpointFormatVersion.V2 with Double = js.native
  }
}
