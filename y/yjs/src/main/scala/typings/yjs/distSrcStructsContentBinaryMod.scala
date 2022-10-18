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

object distSrcStructsContentBinaryMod {
  
  @JSImport("yjs/dist/src/structs/ContentBinary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentBinary", "ContentBinary")
  @js.native
  open class ContentBinary protected () extends StObject {
    /**
      * @param {Uint8Array} content
      */
    def this(content: js.typedarray.Uint8Array) = this()
    
    var content: js.typedarray.Uint8Array = js.native
    
    /**
      * @return {ContentBinary}
      */
    def copy(): ContentBinary = js.native
    
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
      * @param {ContentBinary} right
      * @return {boolean}
      */
    def mergeWith(right: ContentBinary): Boolean = js.native
    
    /**
      * @param {number} offset
      * @return {ContentBinary}
      */
    def splice(offset: Double): ContentBinary = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  inline def readContentBinary(decoder: UpdateDecoderV1): ContentBinary = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentBinary")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentBinary]
  inline def readContentBinary(decoder: UpdateDecoderV2): ContentBinary = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentBinary")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentBinary]
}
