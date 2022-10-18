package typings.tensorflowTfjsConverter.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsignal extends StObject {
  
  def frame(signal: Tensor1D, frameLength: Double, frameStep: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Boolean, padValue: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Unit, padValue: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def hammingWindow(windowLength: Double): Tensor1D = js.native
  
  def hannWindow(windowLength: Double): Tensor1D = js.native
  
  def stft(signal: Tensor1D, frameLength: Double, frameStep: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(signal: Tensor1D, frameLength: Double, frameStep: Double, fftLength: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(
    signal: Tensor1D,
    frameLength: Double,
    frameStep: Double,
    fftLength: Double,
    windowFn: js.Function1[/* length */ Double, Tensor1D]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def stft(
    signal: Tensor1D,
    frameLength: Double,
    frameStep: Double,
    fftLength: Unit,
    windowFn: js.Function1[/* length */ Double, Tensor1D]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
}
