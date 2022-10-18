package typings.yjs

import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcUtilsDocMod.Doc
import typings.yjs.distSrcUtilsStructStoreMod.StructStore
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStructsContentDocMod {
  
  @JSImport("yjs/dist/src/structs/ContentDoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentDoc", "ContentDoc")
  @js.native
  open class ContentDoc protected () extends StObject {
    /**
      * @param {Doc} doc
      */
    def this(doc: Doc) = this()
    
    /**
      * @return {ContentDoc}
      */
    def copy(): ContentDoc = js.native
    
    /**
      * @param {Transaction} transaction
      */
    def delete(transaction: Transaction): Unit = js.native
    
    /**
      * @type {Doc}
      */
    var doc: Doc = js.native
    
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
      * @param {ContentDoc} right
      * @return {boolean}
      */
    def mergeWith(right: ContentDoc): Boolean = js.native
    
    var opts: Any = js.native
    
    /**
      * @param {number} offset
      * @return {ContentDoc}
      */
    def splice(offset: Double): ContentDoc = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  inline def readContentDoc(decoder: UpdateDecoderV1): ContentDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDoc")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentDoc]
  inline def readContentDoc(decoder: UpdateDecoderV2): ContentDoc = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentDoc")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentDoc]
}
