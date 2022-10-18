package typings.yjs

import typings.yjs.distSrcStructsItemMod.Item
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcUtilsStructStoreMod.StructStore
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typings.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import typings.yjs.yjsInts.`0`
import typings.yjs.yjsInts.`1`
import typings.yjs.yjsInts.`2`
import typings.yjs.yjsInts.`3`
import typings.yjs.yjsInts.`4`
import typings.yjs.yjsInts.`5`
import typings.yjs.yjsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStructsContentTypeMod {
  
  @JSImport("yjs/dist/src/structs/ContentType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/structs/ContentType", "ContentType")
  @js.native
  open class ContentType protected () extends StObject {
    /**
      * @param {AbstractType<any>} type
      */
    def this(`type`: AbstractType[Any]) = this()
    
    /**
      * @return {ContentType}
      */
    def copy(): ContentType = js.native
    
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
      * @param {ContentType} right
      * @return {boolean}
      */
    def mergeWith(right: ContentType): Boolean = js.native
    
    /**
      * @param {number} offset
      * @return {ContentType}
      */
    def splice(offset: Double): ContentType = js.native
    
    /**
      * @type {AbstractType<any>}
      */
    var `type`: AbstractType[Any] = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/structs/ContentType", "YArrayRefID")
  @js.native
  val YArrayRefID: `0` = js.native
  
  @JSImport("yjs/dist/src/structs/ContentType", "YMapRefID")
  @js.native
  val YMapRefID: `1` = js.native
  
  @JSImport("yjs/dist/src/structs/ContentType", "YTextRefID")
  @js.native
  val YTextRefID: `2` = js.native
  
  @JSImport("yjs/dist/src/structs/ContentType", "YXmlElementRefID")
  @js.native
  val YXmlElementRefID: `3` = js.native
  
  @JSImport("yjs/dist/src/structs/ContentType", "YXmlFragmentRefID")
  @js.native
  val YXmlFragmentRefID: `4` = js.native
  
  @JSImport("yjs/dist/src/structs/ContentType", "YXmlHookRefID")
  @js.native
  val YXmlHookRefID: `5` = js.native
  
  @JSImport("yjs/dist/src/structs/ContentType", "YXmlTextRefID")
  @js.native
  val YXmlTextRefID: `6` = js.native
  
  inline def readContentType(decoder: UpdateDecoderV1): ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentType")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentType]
  inline def readContentType(decoder: UpdateDecoderV2): ContentType = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentType")(decoder.asInstanceOf[js.Any]).asInstanceOf[ContentType]
  
  @JSImport("yjs/dist/src/structs/ContentType", "typeRefs")
  @js.native
  val typeRefs: js.Array[js.Function1[/* arg0 */ UpdateDecoderV1 | UpdateDecoderV2, AbstractType[Any]]] = js.native
}
