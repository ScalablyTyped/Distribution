package typings.tensorflowTfjs.distIndexWithPolyfillsMod

import typings.tensorflowTfjsCore.distBackendsBackendMod.DataMover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "DataStorage")
@js.native
open class DataStorage[T] protected ()
  extends typings.tensorflowTfjs.mod.DataStorage[T] {
  def this(backend: typings.tensorflowTfjsCore.distBackendsBackendMod.KernelBackend, dataMover: DataMover) = this()
}
