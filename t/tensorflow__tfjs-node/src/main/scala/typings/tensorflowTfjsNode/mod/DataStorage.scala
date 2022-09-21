package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.backendMod.DataMover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "DataStorage")
@js.native
open class DataStorage[T] protected ()
  extends typings.tensorflowTfjs.mod.DataStorage[T] {
  def this(backend: typings.tensorflowTfjsCore.backendMod.KernelBackend, dataMover: DataMover) = this()
}
