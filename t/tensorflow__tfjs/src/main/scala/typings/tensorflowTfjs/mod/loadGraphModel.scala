package typings.tensorflowTfjs.mod

import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "loadGraphModel")
@js.native
object loadGraphModel extends js.Object {
  def apply(modelUrl: String): js.Promise[typings.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: String, options: LoadOptions): js.Promise[typings.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: IOHandler): js.Promise[typings.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  def apply(modelUrl: IOHandler, options: LoadOptions): js.Promise[typings.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
}

