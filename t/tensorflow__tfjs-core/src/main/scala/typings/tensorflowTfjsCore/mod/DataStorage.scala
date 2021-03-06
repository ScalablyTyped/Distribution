package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.backendMod.DataMover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "DataStorage")
@js.native
class DataStorage[T] protected ()
  extends typings.tensorflowTfjsCore.baseMod.DataStorage[T] {
  def this(backend: typings.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}
