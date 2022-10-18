package typings.yjs

import typings.std.Map
import typings.yjs.distSrcStructsGCMod.GC
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcUtilsIDMod.ID
import typings.yjs.distSrcUtilsStructStoreMod.StructStore
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.DSDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.DSEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsDeleteSetMod {
  
  @JSImport("yjs/dist/src/utils/DeleteSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/utils/DeleteSet", "DeleteItem")
  @js.native
  open class DeleteItem protected () extends StObject {
    /**
      * @param {number} clock
      * @param {number} len
      */
    def this(clock: Double, len: Double) = this()
    
    /**
      * @type {number}
      */
    var clock: Double = js.native
    
    /**
      * @type {number}
      */
    var len: Double = js.native
  }
  
  @JSImport("yjs/dist/src/utils/DeleteSet", "DeleteSet")
  @js.native
  open class DeleteSet () extends StObject {
    
    /**
      * @type {Map<number,Array<DeleteItem>>}
      */
    var clients: Map[Double, js.Array[DeleteItem]] = js.native
  }
  
  inline def addToDeleteSet(ds: DeleteSet, client: Double, clock: Double, length: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addToDeleteSet")(ds.asInstanceOf[js.Any], client.asInstanceOf[js.Any], clock.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createDeleteSet(): DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteSet")().asInstanceOf[DeleteSet]
  
  inline def createDeleteSetFromStructStore(ss: StructStore): DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteSetFromStructStore")(ss.asInstanceOf[js.Any]).asInstanceOf[DeleteSet]
  
  inline def findIndexDS(dis: js.Array[DeleteItem], clock: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexDS")(dis.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def isDeleted(ds: DeleteSet, id: ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDeleted")(ds.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def iterateDeletedStructs(transaction: Transaction, ds: DeleteSet, f: js.Function1[/* arg0 */ GC | Item, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateDeletedStructs")(transaction.asInstanceOf[js.Any], ds.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergeDeleteSets(dss: js.Array[DeleteSet]): DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeleteSets")(dss.asInstanceOf[js.Any]).asInstanceOf[DeleteSet]
  
  inline def readAndApplyDeleteSet(decoder: DSDecoderV1, transaction: Transaction, store: StructStore): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readAndApplyDeleteSet")(decoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  inline def readAndApplyDeleteSet(decoder: DSDecoderV2, transaction: Transaction, store: StructStore): js.typedarray.Uint8Array | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readAndApplyDeleteSet")(decoder.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array | Null]
  
  inline def readDeleteSet(decoder: DSDecoderV1): DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("readDeleteSet")(decoder.asInstanceOf[js.Any]).asInstanceOf[DeleteSet]
  inline def readDeleteSet(decoder: DSDecoderV2): DeleteSet = ^.asInstanceOf[js.Dynamic].applyDynamic("readDeleteSet")(decoder.asInstanceOf[js.Any]).asInstanceOf[DeleteSet]
  
  inline def sortAndMergeDeleteSet(ds: DeleteSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sortAndMergeDeleteSet")(ds.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def writeDeleteSet(encoder: DSEncoderV1, ds: DeleteSet): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDeleteSet")(encoder.asInstanceOf[js.Any], ds.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeDeleteSet(encoder: DSEncoderV2, ds: DeleteSet): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDeleteSet")(encoder.asInstanceOf[js.Any], ds.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
