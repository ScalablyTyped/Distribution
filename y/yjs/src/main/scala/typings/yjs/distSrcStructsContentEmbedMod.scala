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

object distSrcStructsContentEmbedMod {
  
  @JSImport("yjs/dist/src/structs/ContentEmbed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentEmbed", "ContentEmbed")
  @js.native
  open class ContentEmbed protected () extends StObject {
    /**
      * @param {Object} embed
      */
    def this(embed: js.Object) = this()
    
    /**
      * @return {ContentEmbed}
      */
    def copy(): ContentEmbed = js.native
    
    /**
      * @param {Transaction} transaction
      */
    def delete(transaction: Transaction): Unit = js.native
    
    var embed: js.Object = js.native
    
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
      * @param {ContentEmbed} right
      * @return {boolean}
      */
    def mergeWith(right: ContentEmbed): Boolean = js.native
    
    /**
      * @param {number} offset
      * @return {ContentEmbed}
      */
    def splice(offset: Double): ContentEmbed = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  inline def readContentEmbed(decoder: UpdateDecoderV1): ContentEmbed = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentEmbed")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentEmbed]
  inline def readContentEmbed(decoder: UpdateDecoderV2): ContentEmbed = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentEmbed")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentEmbed]
}
