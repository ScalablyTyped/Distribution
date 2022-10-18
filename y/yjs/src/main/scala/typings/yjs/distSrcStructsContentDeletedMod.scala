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

object distSrcStructsContentDeletedMod {
  
  @JSImport("yjs/dist/src/structs/ContentDeleted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentDeleted", "ContentDeleted")
  @js.native
  open class ContentDeleted protected () extends StObject {
    /**
      * @param {number} len
      */
    def this(len: Double) = this()
    
    /**
      * @return {ContentDeleted}
      */
    def copy(): ContentDeleted = js.native
    
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
    
    var len: Double = js.native
    
    /**
      * @param {ContentDeleted} right
      * @return {boolean}
      */
    def mergeWith(right: ContentDeleted): Boolean = js.native
    
    /**
      * @param {number} offset
      * @return {ContentDeleted}
      */
    def splice(offset: Double): ContentDeleted = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  inline def readContentDeleted(decoder: UpdateDecoderV1): ContentDeleted = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDeleted")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentDeleted]
  inline def readContentDeleted(decoder: UpdateDecoderV2): ContentDeleted = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDeleted")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentDeleted]
}
