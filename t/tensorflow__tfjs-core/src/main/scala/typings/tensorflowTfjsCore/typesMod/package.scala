package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type LoadHandler = js.Function0[js.Promise[typings.tensorflowTfjsCore.typesMod.ModelArtifacts]]
  
  type OnProgressCallback = js.Function1[/* fraction */ scala.Double, scala.Unit]
  
  type SaveHandler = js.Function1[
    /* modelArtifact */ typings.tensorflowTfjsCore.typesMod.ModelArtifacts, 
    js.Promise[typings.tensorflowTfjsCore.typesMod.SaveResult]
  ]
  
  type WeightsManifestConfig = js.Array[typings.tensorflowTfjsCore.typesMod.WeightsManifestGroupConfig]
}
