package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spectral {
  
  @JSImport("@tensorflow/tfjs-node", "spectral")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("fft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def ifft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def irfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("irfft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  
  @scala.inline
  def rfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("rfft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  @scala.inline
  def rfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], fftLength: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("rfft")(input.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any])).asInstanceOf[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
}
