package typings.tensorflowTfjsNode

import typings.node.bufferMod.global.Buffer
import typings.tensorflowTfjsCore.distIoTypesMod.ModelArtifacts
import typings.tensorflowTfjsNode.anon.DateSaved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoIoUtilsMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io/io_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): DateSaved = ^.asInstanceOf[js.Dynamic].applyDynamic("getModelArtifactsInfoForJSON")(modelArtifacts.asInstanceOf[js.Any]).asInstanceOf[DateSaved]
  
  inline def toArrayBuffer(buf: js.Array[Buffer]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def toArrayBuffer(buf: Buffer): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def toBuffer(ab: js.typedarray.ArrayBuffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(ab.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
