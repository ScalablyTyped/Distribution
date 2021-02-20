package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.typesMod.OnProgressCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/progress", "monitorPromisesProgress")
  @js.native
  def monitorPromisesProgress(promises: js.Array[js.Promise[js.Object | Unit]], onProgress: OnProgressCallback): js.Promise[js.Array[js.Object]] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/progress", "monitorPromisesProgress")
  @js.native
  def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: js.UndefOr[scala.Nothing],
    endFraction: Double
  ): js.Promise[js.Array[js.Object]] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/progress", "monitorPromisesProgress")
  @js.native
  def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: Double
  ): js.Promise[js.Array[js.Object]] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/progress", "monitorPromisesProgress")
  @js.native
  def monitorPromisesProgress(
    promises: js.Array[js.Promise[js.Object | Unit]],
    onProgress: OnProgressCallback,
    startFraction: Double,
    endFraction: Double
  ): js.Promise[js.Array[js.Object]] = js.native
}
