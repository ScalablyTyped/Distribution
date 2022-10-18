package typings.yjs

import typings.std.Map
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcUtilsDeleteSetMod.DeleteSet
import typings.yjs.distSrcUtilsDocMod.Doc
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsSnapshotMod {
  
  @JSImport("yjs/dist/src/utils/Snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/utils/Snapshot", "Snapshot")
  @js.native
  open class Snapshot_ protected () extends StObject {
    /**
      * @param {DeleteSet} ds
      * @param {Map<number,number>} sv state map
      */
    def this(ds: DeleteSet, sv: Map[Double, Double]) = this()
    
    /**
      * @type {DeleteSet}
      */
    var ds: DeleteSet = js.native
    
    /**
      * State Map
      * @type {Map<number,number>}
      */
    var sv: Map[Double, Double] = js.native
  }
  
  inline def createDocFromSnapshot(originDoc: Doc, snapshot: Snapshot_): Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocFromSnapshot")(originDoc.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Doc]
  inline def createDocFromSnapshot(originDoc: Doc, snapshot: Snapshot_, newDoc: Doc): Doc = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocFromSnapshot")(originDoc.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any], newDoc.asInstanceOf[js.Any])).asInstanceOf[Doc]
  
  inline def createSnapshot(ds: DeleteSet, sm: Map[Double, Double]): Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSnapshot")(ds.asInstanceOf[js.Any], sm.asInstanceOf[js.Any])).asInstanceOf[Snapshot_]
  
  inline def decodeSnapshot(buf: js.typedarray.Uint8Array): Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshot")(buf.asInstanceOf[js.Any]).asInstanceOf[Snapshot_]
  
  inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array): Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any]).asInstanceOf[Snapshot_]
  inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array, decoder: DSDecoderV1): Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[Snapshot_]
  inline def decodeSnapshotV2(buf: js.typedarray.Uint8Array, decoder: DSDecoderV2): Snapshot_ = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeSnapshotV2")(buf.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[Snapshot_]
  
  @JSImport("yjs/dist/src/utils/Snapshot", "emptySnapshot")
  @js.native
  val emptySnapshot: Snapshot_ = js.native
  
  inline def encodeSnapshot(snapshot: Snapshot_): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshot")(snapshot.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodeSnapshotV2(snapshot: Snapshot_): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeSnapshotV2(snapshot: Snapshot_, encoder: DSEncoderV1): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeSnapshotV2(snapshot: Snapshot_, encoder: DSEncoderV2): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSnapshotV2")(snapshot.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def equalSnapshots(snap1: Snapshot_, snap2: Snapshot_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalSnapshots")(snap1.asInstanceOf[js.Any], snap2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isVisible(item: Item): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isVisible(item: Item, snapshot: Snapshot_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(item.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def snapshot(doc: Doc): Snapshot_ = ^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(doc.asInstanceOf[js.Any]).asInstanceOf[Snapshot_]
  
  inline def splitSnapshotAffectedStructs(transaction: Transaction, snapshot: Snapshot_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splitSnapshotAffectedStructs")(transaction.asInstanceOf[js.Any], snapshot.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
