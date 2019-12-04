package typings.atTensorflowTfjsDashNode

import typings.atTensorflowTfjsDashCore.distIoTypesMod.ModelArtifacts
import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node/dist/io/io_utils", JSImport.Namespace)
@js.native
object distIoIoUnderscoreUtilsMod extends js.Object {
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): Anon_DateSaved = js.native
  def toArrayBuffer(buf: js.Array[Buffer]): ArrayBuffer = js.native
  def toArrayBuffer(buf: Buffer): ArrayBuffer = js.native
  def toBuffer(ab: ArrayBuffer): Buffer = js.native
}

