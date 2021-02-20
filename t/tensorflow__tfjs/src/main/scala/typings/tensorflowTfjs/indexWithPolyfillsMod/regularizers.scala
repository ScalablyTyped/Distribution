package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsLayers.regularizersMod.L1Args
import typings.tensorflowTfjsLayers.regularizersMod.L1L2Args
import typings.tensorflowTfjsLayers.regularizersMod.L2Args
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularizers {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "regularizers.l1")
  @js.native
  def l1(): Regularizer = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "regularizers.l1")
  @js.native
  def l1(config: L1Args): Regularizer = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "regularizers.l1l2")
  @js.native
  def l1l2(): Regularizer = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "regularizers.l1l2")
  @js.native
  def l1l2(config: L1L2Args): Regularizer = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "regularizers.l2")
  @js.native
  def l2(): Regularizer = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "regularizers.l2")
  @js.native
  def l2(config: L2Args): Regularizer = js.native
}
