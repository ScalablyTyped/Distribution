package typings.yjs

import typings.std.Map
import typings.yjs.anon.Missing
import typings.yjs.distSrcStructsGCMod.GC
import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcUtilsIDMod.ID
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsStructStoreMod {
  
  @JSImport("yjs/dist/src/utils/StructStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/utils/StructStore", "StructStore")
  @js.native
  open class StructStore () extends StObject {
    
    /**
      * @type {Map<number,Array<GC|Item>>}
      */
    var clients: Map[Double, js.Array[GC | Item]] = js.native
    
    /**
      * @type {null | Uint8Array}
      */
    var pendingDs: Null | js.typedarray.Uint8Array = js.native
    
    /**
      * @type {null | { missing: Map<number, number>, update: Uint8Array }}
      */
    var pendingStructs: Missing | Null = js.native
  }
  
  inline def addStruct(store: StructStore, struct: GC): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addStruct(store: StructStore, struct: Item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def find(store: StructStore, id: ID): GC | Item = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[GC | Item]
  
  inline def findIndexCleanStart(transaction: Transaction, structs: js.Array[Item | GC], clock: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexCleanStart")(transaction.asInstanceOf[js.Any], structs.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def findIndexSS(structs: js.Array[Item | GC], clock: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndexSS")(structs.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getItem(arg0: StructStore, arg1: ID): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Item]
  
  inline def getItemCleanEnd(transaction: Transaction, store: StructStore, id: ID): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCleanEnd")(transaction.asInstanceOf[js.Any], store.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Item]
  
  inline def getItemCleanStart(transaction: Transaction, id: ID): Item = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemCleanStart")(transaction.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Item]
  
  inline def getState(store: StructStore, client: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getState")(store.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getStateVector(store: StructStore): Map[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateVector")(store.asInstanceOf[js.Any]).asInstanceOf[Map[Double, Double]]
  
  inline def integretyCheck(store: StructStore): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("integretyCheck")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def iterateStructs(
    transaction: Transaction,
    structs: js.Array[Item | GC],
    clockStart: Double,
    len: Double,
    f: js.Function1[/* arg0 */ GC | Item, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateStructs")(transaction.asInstanceOf[js.Any], structs.asInstanceOf[js.Any], clockStart.asInstanceOf[js.Any], len.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replaceStruct(store: StructStore, struct: GC, newStruct: GC): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceStruct(store: StructStore, struct: GC, newStruct: Item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceStruct(store: StructStore, struct: Item, newStruct: GC): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceStruct(store: StructStore, struct: Item, newStruct: Item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStruct")(store.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], newStruct.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
