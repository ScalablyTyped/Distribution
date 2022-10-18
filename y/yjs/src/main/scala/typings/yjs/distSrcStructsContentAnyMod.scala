package typings.yjs

import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcUtilsStructStoreMod.StructStore
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStructsContentAnyMod {
  
  @JSImport("yjs/dist/src/structs/ContentAny", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentAny", "ContentAny")
  @js.native
  open class ContentAny protected () extends StObject {
    /**
      * @param {Array<any>} arr
      */
    def this(arr: js.Array[Any]) = this()
    
    /**
      * @type {Array<any>}
      */
    var arr: js.Array[Any] = js.native
    
    /**
      * @return {ContentAny}
      */
    def copy(): ContentAny = js.native
    
    /**
      * @param {Transaction} transaction
      */
    def delete(transaction: Transaction): Unit = js.native
    
    /**
      * @param {StructStore} store
      */
    def gc(store: StructStore): Unit = js.native
    
    /**
      * @return {Array<any>}
      */
    def getContent(): js.Array[Any] = js.native
    
    /**
      * @return {number}
      */
    def getLength(): Double = js.native
    
    /**
      * @return {number}
      */
    def getRef(): Double = js.native
    
    /**
      * @param {Transaction} transaction
      * @param {Item} item
      */
    def integrate(transaction: Transaction, item: Item): Unit = js.native
    
    /**
      * @return {boolean}
      */
    def isCountable(): Boolean = js.native
    
    /**
      * @param {ContentAny} right
      * @return {boolean}
      */
    def mergeWith(right: ContentAny): Boolean = js.native
    
    /**
      * @param {number} offset
      * @return {ContentAny}
      */
    def splice(offset: Double): ContentAny = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  inline def readContentAny(decoder: UpdateDecoderV1): ContentAny = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentAny")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentAny]
  inline def readContentAny(decoder: UpdateDecoderV2): ContentAny = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentAny")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentAny]
}
