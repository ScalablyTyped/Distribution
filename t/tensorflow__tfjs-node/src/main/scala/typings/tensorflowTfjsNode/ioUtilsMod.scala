package typings.tensorflowTfjsNode

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.tensorflowTfjsCore.typesMod.ModelArtifacts
import typings.tensorflowTfjsNode.anon.DateSaved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioUtilsMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", "getModelArtifactsInfoForJSON")
  @js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): DateSaved = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", "toArrayBuffer")
  @js.native
  def toArrayBuffer(buf: js.Array[Buffer]): ArrayBuffer = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", "toArrayBuffer")
  @js.native
  def toArrayBuffer(buf: Buffer): ArrayBuffer = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", "toBuffer")
  @js.native
  def toBuffer(ab: ArrayBuffer): Buffer = js.native
}
