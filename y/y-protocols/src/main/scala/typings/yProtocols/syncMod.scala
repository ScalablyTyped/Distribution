package typings.yProtocols

import typings.lib0.decodingMod.Decoder
import typings.lib0.encodingMod.Encoder
import typings.std.Map
import typings.yProtocols.yProtocolsInts.`0`
import typings.yProtocols.yProtocolsInts.`1`
import typings.yProtocols.yProtocolsInts.`2`
import typings.yjs.mod.Doc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("y-protocols/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("y-protocols/sync", "messageYjsSyncStep1")
  @js.native
  val messageYjsSyncStep1: `0` = js.native
  
  @JSImport("y-protocols/sync", "messageYjsSyncStep2")
  @js.native
  val messageYjsSyncStep2: `1` = js.native
  
  @JSImport("y-protocols/sync", "messageYjsUpdate")
  @js.native
  val messageYjsUpdate: `2` = js.native
  
  inline def readSyncMessage(decoder: Decoder, encoder: Encoder, doc: Doc, transactionOrigin: Any): `0` | `2` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("readSyncMessage")(decoder.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[`0` | `2` | `1`]
  
  inline def readSyncStep1(decoder: Decoder, encoder: Encoder, doc: Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readSyncStep1")(decoder.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readSyncStep2(decoder: Decoder, doc: Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readSyncStep2")(decoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readUpdate(decoder: Decoder, doc: Doc, transactionOrigin: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readUpdate")(decoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], transactionOrigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeSyncStep1(encoder: Encoder, doc: Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSyncStep1")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeSyncStep2(encoder: Encoder, doc: Doc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSyncStep2")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeSyncStep2(encoder: Encoder, doc: Doc, encodedStateVector: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSyncStep2")(encoder.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], encodedStateVector.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUpdate(encoder: Encoder, update: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUpdate")(encoder.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type StateMap = Map[Double, Double]
}
