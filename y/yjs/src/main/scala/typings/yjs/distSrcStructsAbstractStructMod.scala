package typings.yjs

import typings.yjs.distSrcUtilsIDMod.ID
import typings.yjs.distSrcUtilsTransactionMod.Transaction
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typings.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStructsAbstractStructMod {
  
  @JSImport("yjs/dist/src/structs/AbstractStruct", "AbstractStruct")
  @js.native
  open class AbstractStruct protected () extends StObject {
    /**
      * @param {ID} id
      * @param {number} length
      */
    def this(id: ID, length: Double) = this()
    
    /**
      * @type {boolean}
      */
    def deleted: Boolean = js.native
    
    var id: ID = js.native
    
    /**
      * @param {Transaction} transaction
      * @param {number} offset
      */
    def integrate(transaction: Transaction, offset: Double): Unit = js.native
    
    var length: Double = js.native
    
    /**
      * Merge this struct with the item to the right.
      * This method is already assuming that `this.id.clock + this.length === this.id.clock`.
      * Also this method does *not* remove right from StructStore!
      * @param {AbstractStruct} right
      * @return {boolean} wether this merged with right
      */
    def mergeWith(right: AbstractStruct): Boolean = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder The encoder to write data to.
      * @param {number} offset
      * @param {number} encodingRef
      */
    def write(encoder: UpdateEncoderV1, offset: Double, encodingRef: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double, encodingRef: Double): Unit = js.native
  }
}
