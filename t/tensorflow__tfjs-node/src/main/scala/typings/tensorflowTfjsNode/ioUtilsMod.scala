package typings.tensorflowTfjsNode

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/io/io_utils", JSImport.Namespace)
@js.native
object ioUtilsMod extends js.Object {
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): AnonDateSaved = js.native
  def toArrayBuffer(buf: js.Array[Buffer]): ArrayBuffer = js.native
  def toArrayBuffer(buf: Buffer): ArrayBuffer = js.native
  def toBuffer(ab: ArrayBuffer): Buffer = js.native
}

