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

object distSrcStructsContentStringMod {
  
  @JSImport("yjs/dist/src/structs/ContentString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentString", "ContentString")
  @js.native
  open class ContentString protected () extends StObject {
    /**
      * @param {string} str
      */
    def this(str: String) = this()
    
    /**
      * @return {ContentString}
      */
    def copy(): ContentString = js.native
    
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
      * @param {ContentString} right
      * @return {boolean}
      */
    def mergeWith(right: ContentString): Boolean = js.native
    
    /**
      * @param {number} offset
      * @return {ContentString}
      */
    def splice(offset: Double): ContentString = js.native
    
    /**
      * @type {string}
      */
    var str: String = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  inline def readContentString(decoder: UpdateDecoderV1): ContentString = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentString")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentString]
  inline def readContentString(decoder: UpdateDecoderV2): ContentString = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentString")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentString]
}
