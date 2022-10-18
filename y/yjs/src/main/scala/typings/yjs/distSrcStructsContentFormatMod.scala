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

object distSrcStructsContentFormatMod {
  
  @JSImport("yjs/dist/src/structs/ContentFormat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentFormat", "ContentFormat")
  @js.native
  open class ContentFormat protected () extends StObject {
    /**
      * @param {string} key
      * @param {Object} value
      */
    def this(key: String, value: js.Object) = this()
    
    /**
      * @return {ContentFormat}
      */
    def copy(): ContentFormat = js.native
    
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
    
    var key: String = js.native
    
    /**
      * @param {ContentFormat} right
      * @return {boolean}
      */
    def mergeWith(right: ContentFormat): Boolean = js.native
    
    /**
      * @param {number} offset
      * @return {ContentFormat}
      */
    def splice(offset: Double): ContentFormat = js.native
    
    var value: js.Object = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  inline def readContentFormat(decoder: UpdateDecoderV1): ContentFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentFormat")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentFormat]
  inline def readContentFormat(decoder: UpdateDecoderV2): ContentFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentFormat")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentFormat]
}
