package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "signal")
@js.native
object signalNs extends js.Object {
  val frame: js.Function5[
    /* signal */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D, 
    /* frameLength */ scala.Double, 
    /* frameStep */ scala.Double, 
    /* padEnd */ js.UndefOr[scala.Boolean], 
    /* padValue */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val hammingWindow: js.Function1[
    /* windowLength */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
  val hannWindow: js.Function1[
    /* windowLength */ scala.Double, 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D
  ] = js.native
}

