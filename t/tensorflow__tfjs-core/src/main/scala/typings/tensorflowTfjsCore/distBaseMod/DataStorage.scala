package typings.tensorflowTfjsCore.distBaseMod

import typings.tensorflowTfjsCore.distBackendsBackendMod.DataMover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "DataStorage")
@js.native
open class DataStorage[T] protected ()
  extends typings.tensorflowTfjsCore.distBackendsBackendMod.DataStorage[T] {
  def this(backend: typings.tensorflowTfjsCore.distBackendsBackendMod.KernelBackend, dataMover: DataMover) = this()
}
