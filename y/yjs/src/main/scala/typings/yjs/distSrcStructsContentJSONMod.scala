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

object distSrcStructsContentJSONMod {
  
  @JSImport("yjs/dist/src/structs/ContentJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentJSON", "ContentJSON")
  @js.native
  open class ContentJSON protected () extends StObject {
    /**
      * @param {Array<any>} arr
      */
    def this(arr: js.Array[Any]) = this()
    
    /**
      * @type {Array<any>}
      */
    var arr: js.Array[Any] = js.native
    
    /**
      * @return {ContentJSON}
      */
    def copy(): ContentJSON = js.native
    
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
      * @param {ContentJSON} right
      * @return {boolean}
      */
    def mergeWith(right: ContentJSON): Boolean = js.native
    
    /**
      * @param {number} offset
      * @return {ContentJSON}
      */
    def splice(offset: Double): ContentJSON = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  inline def readContentJSON(decoder: UpdateDecoderV1): ContentJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentJSON")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentJSON]
  inline def readContentJSON(decoder: UpdateDecoderV2): ContentJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentJSON")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentJSON]
}
