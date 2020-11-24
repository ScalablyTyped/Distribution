package typings.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindOperatorsUnordered extends js.Object {
  
  /**
    * Get the number of operations in the bulk.
    */
  var length: scala.Double = js.native
  
  /**
    * Add a remove operation to the bulk operation.
    */
  def remove(): UnorderedBulkOperation = js.native
  
  /**
    * Add a remove one operation to the bulk operation.
    */
  def removeOne(): UnorderedBulkOperation = js.native
  
  /**
    * Add a replace one operation to the bulk operation.
    * @param doc The new document to replace the existing one with.
    */
  def replaceOne(doc: js.Object): UnorderedBulkOperation = js.native
  
  /**
    * Add a single update document to the bulk operation.
    * @param doc Update operations
    */
  def update(doc: js.Object): UnorderedBulkOperation = js.native
  
  /**
    * Add a single update one document to the bulk operation.
    * @param doc Update operations
    */
  def updateOne(doc: js.Object): UnorderedBulkOperation = js.native
  
  /**
    * Upsert modifier for update bulk operation.
    */
  def upsert(): FindOperatorsUnordered = js.native
}
object FindOperatorsUnordered {
  
  @scala.inline
  def apply(
    length: scala.Double,
    remove: () => UnorderedBulkOperation,
    removeOne: () => UnorderedBulkOperation,
    replaceOne: js.Object => UnorderedBulkOperation,
    update: js.Object => UnorderedBulkOperation,
    updateOne: js.Object => UnorderedBulkOperation,
    upsert: () => FindOperatorsUnordered
  ): FindOperatorsUnordered = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removeOne = js.Any.fromFunction0(removeOne), replaceOne = js.Any.fromFunction1(replaceOne), update = js.Any.fromFunction1(update), updateOne = js.Any.fromFunction1(updateOne), upsert = js.Any.fromFunction0(upsert))
    __obj.asInstanceOf[FindOperatorsUnordered]
  }
  
  @scala.inline
  implicit class FindOperatorsUnorderedOps[Self <: FindOperatorsUnordered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLength(value: scala.Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => UnorderedBulkOperation): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveOne(value: () => UnorderedBulkOperation): Self = this.set("removeOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceOne(value: js.Object => UnorderedBulkOperation): Self = this.set("replaceOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: js.Object => UnorderedBulkOperation): Self = this.set("update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateOne(value: js.Object => UnorderedBulkOperation): Self = this.set("updateOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpsert(value: () => FindOperatorsUnordered): Self = this.set("upsert", js.Any.fromFunction0(value))
  }
}
