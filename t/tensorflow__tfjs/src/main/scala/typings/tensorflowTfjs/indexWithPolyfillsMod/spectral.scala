package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spectral {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "spectral.fft")
  @js.native
  def fft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "spectral.ifft")
  @js.native
  def ifft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "spectral.irfft")
  @js.native
  def irfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "spectral.rfft")
  @js.native
  def rfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "spectral.rfft")
  @js.native
  def rfft(input: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], fftLength: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}
