package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signal {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.frame")
  @js.native
  def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.frame")
  @js.native
  def frame(
    signal: Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    padEnd: js.UndefOr[scala.Nothing],
    padValue: Double
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.frame")
  @js.native
  def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Boolean): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.frame")
  @js.native
  def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Boolean, padValue: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.hammingWindow")
  @js.native
  def hammingWindow(windowLength: Double): Tensor[R1] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.hannWindow")
  @js.native
  def hannWindow(windowLength: Double): Tensor[R1] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.stft")
  @js.native
  def stft(signal: Tensor[R1], frameLength: Double, frameStep: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.stft")
  @js.native
  def stft(
    signal: Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    fftLength: js.UndefOr[scala.Nothing],
    windowFn: js.Function1[/* length */ Double, Tensor[R1]]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.stft")
  @js.native
  def stft(signal: Tensor[R1], frameLength: Double, frameStep: Double, fftLength: Double): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "signal.stft")
  @js.native
  def stft(
    signal: Tensor[R1],
    frameLength: Double,
    frameStep: Double,
    fftLength: Double,
    windowFn: js.Function1[/* length */ Double, Tensor[R1]]
  ): Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}
