package typings.yjs

import org.scalablytyped.runtime.Instantiable0
import typings.lib0.decodingMod.Decoder
import typings.std.Map
import typings.yjs.anon.I
import typings.yjs.distSrcUtilsDocMod.Doc
import typings.yjs.distSrcUtilsStructStoreMod.StructStore
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsEncodingMod {
  
  @JSImport("yjs/dist/src/utils/encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyUpdate(ydoc: Doc, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdate")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyUpdate(ydoc: Doc, update: js.typedarray.Uint8Array, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdate")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def applyUpdateV2(ydoc: Doc, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyUpdateV2(ydoc: Doc, update: js.typedarray.Uint8Array, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyUpdateV2(
    ydoc: Doc,
    update: js.typedarray.Uint8Array,
    transactionOrigin: Any,
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyUpdateV2(
    ydoc: Doc,
    update: js.typedarray.Uint8Array,
    transactionOrigin: Unit,
    YDecoder: Instantiable0[UpdateDecoderV1 | UpdateDecoderV2]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyUpdateV2")(ydoc.asInstanceOf[js.Any], update.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], YDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decodeStateVector(decodedState: js.typedarray.Uint8Array): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeStateVector")(decodedState.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]
  
  inline def encodeStateAsUpdate(doc: Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdate")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdate(doc: Doc, encodedTargetStateVector: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdate")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeStateAsUpdateV2(doc: Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(doc: Doc, encodedTargetStateVector: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(doc: Doc, encodedTargetStateVector: js.typedarray.Uint8Array, encoder: UpdateEncoderV1): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(doc: Doc, encodedTargetStateVector: js.typedarray.Uint8Array, encoder: UpdateEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(doc: Doc, encodedTargetStateVector: Unit, encoder: UpdateEncoderV1): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateAsUpdateV2(doc: Doc, encodedTargetStateVector: Unit, encoder: UpdateEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateAsUpdateV2")(doc.asInstanceOf[js.Any], encodedTargetStateVector.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeStateVector(doc: Map[Double, Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVector")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVector(doc: Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVector")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeStateVectorV2(doc: Map[Double, Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVectorV2(doc: Map[Double, Double], encoder: DSEncoderV1): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVectorV2(doc: Map[Double, Double], encoder: DSEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVectorV2(doc: Doc): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVectorV2(doc: Doc, encoder: DSEncoderV1): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeStateVectorV2(doc: Doc, encoder: DSEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStateVectorV2")(doc.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readClientsStructRefs(decoder: UpdateDecoderV1, doc: Doc): Map[Double, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("readClientsStructRefs")(decoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Map[Double, I]]
  inline def readClientsStructRefs(decoder: UpdateDecoderV2, doc: Doc): Map[Double, I] = (^.asInstanceOf[js.Dynamic].applyDynamic("readClientsStructRefs")(decoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Map[Double, I]]
  
  inline def readStateVector(decoder: DSDecoderV1): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStateVector")(decoder.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]
  inline def readStateVector(decoder: DSDecoderV2): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStateVector")(decoder.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]
  
  inline def readUpdate(decoder: Decoder, ydoc: Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdate(decoder: Decoder, ydoc: Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readUpdateV2(decoder: Decoder, ydoc: Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(decoder: Decoder, ydoc: Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(decoder: Decoder, ydoc: Doc, transactionOrigin: Any, structDecoder: UpdateDecoderV1): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(decoder: Decoder, ydoc: Doc, transactionOrigin: Any, structDecoder: UpdateDecoderV2): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(decoder: Decoder, ydoc: Doc, transactionOrigin: Unit, structDecoder: UpdateDecoderV1): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readUpdateV2(decoder: Decoder, ydoc: Doc, transactionOrigin: Unit, structDecoder: UpdateDecoderV2): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdateV2")(decoder.asInstanceOf[js.Any], ydoc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any], structDecoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeClientsStructs(encoder: UpdateEncoderV1, store: StructStore, _sm: Map[Double, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeClientsStructs")(encoder.asInstanceOf[js.Any], store.asInstanceOf[js.Any], _sm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeClientsStructs(encoder: UpdateEncoderV2, store: StructStore, _sm: Map[Double, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeClientsStructs")(encoder.asInstanceOf[js.Any], store.asInstanceOf[js.Any], _sm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeDocumentStateVector(encoder: DSEncoderV1, doc: Doc): DSEncoderV1 | DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDocumentStateVector")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[DSEncoderV1 | DSEncoderV2]
  inline def writeDocumentStateVector(encoder: DSEncoderV2, doc: Doc): DSEncoderV1 | DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDocumentStateVector")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[DSEncoderV1 | DSEncoderV2]
  
  inline def writeStateAsUpdate(encoder: UpdateEncoderV1, doc: Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeStateAsUpdate(encoder: UpdateEncoderV1, doc: Doc, targetStateVector: Map[Double, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], targetStateVector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeStateAsUpdate(encoder: UpdateEncoderV2, doc: Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeStateAsUpdate(encoder: UpdateEncoderV2, doc: Doc, targetStateVector: Map[Double, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateAsUpdate")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], targetStateVector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeStateVector(encoder: DSEncoderV1, sv: Map[Double, Double]): DSEncoderV1 | DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateVector")(encoder.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[DSEncoderV1 | DSEncoderV2]
  inline def writeStateVector(encoder: DSEncoderV2, sv: Map[Double, Double]): DSEncoderV1 | DSEncoderV2 = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStateVector")(encoder.asInstanceOf[js.Any], sv.asInstanceOf[js.Any])).asInstanceOf[DSEncoderV1 | DSEncoderV2]
  
  inline def writeStructsFromTransaction(encoder: UpdateEncoderV1, transaction: Transaction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStructsFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeStructsFromTransaction(encoder: UpdateEncoderV2, transaction: Transaction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeStructsFromTransaction")(encoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
