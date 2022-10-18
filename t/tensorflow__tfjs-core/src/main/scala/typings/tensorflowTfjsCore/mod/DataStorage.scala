package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distBackendsBackendMod.DataMover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "DataStorage")
@js.native
open class DataStorage[T] protected ()
  extends typings.tensorflowTfjsCore.distBaseMod.DataStorage[T] {
  def this(backend: typings.tensorflowTfjsCore.distBackendsBackendMod.KernelBackend, dataMover: DataMover) = this()
}
