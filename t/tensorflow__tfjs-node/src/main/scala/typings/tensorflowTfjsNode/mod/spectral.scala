package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spectral {
  
  @JSImport("@tensorflow/tfjs-node", "spectral.fft")
  @js.native
  def fft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "spectral.ifft")
  @js.native
  def ifft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "spectral.irfft")
  @js.native
  def irfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "spectral.rfft")
  @js.native
  def rfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs-node", "spectral.rfft")
  @js.native
  def rfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], fftLength: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}
