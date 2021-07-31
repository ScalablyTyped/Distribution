package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOperatorsOrdered extends StObject {
  
  /**
    * Add a remove operation to the bulk operation.
    */
  def delete(): OrderedBulkOperation
  
  /**
    * Add a remove one operation to the bulk operation.
    */
  def deleteOne(): OrderedBulkOperation
  
  /**
    * Add a replace one operation to the bulk operation.
    */
  def replaceOne(doc: js.Object): OrderedBulkOperation
  
  /**
    * Add a single update document to the bulk operation.
    */
  def update(doc: js.Object): OrderedBulkOperation
  
  /**
    * Add a single update one document to the bulk operation.
    */
  def updateOne(doc: js.Object): OrderedBulkOperation
  
  /**
    * Upsert modifier for update bulk operation.
    */
  def upsert(): FindOperatorsOrdered
}
object FindOperatorsOrdered {
  
  @scala.inline
  def apply(
    delete: () => OrderedBulkOperation,
    deleteOne: () => OrderedBulkOperation,
    replaceOne: js.Object => OrderedBulkOperation,
    update: js.Object => OrderedBulkOperation,
    updateOne: js.Object => OrderedBulkOperation,
    upsert: () => FindOperatorsOrdered
  ): FindOperatorsOrdered = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteOne = js.Any.fromFunction0(deleteOne), replaceOne = js.Any.fromFunction1(replaceOne), update = js.Any.fromFunction1(update), updateOne = js.Any.fromFunction1(updateOne), upsert = js.Any.fromFunction0(upsert))
    __obj.asInstanceOf[FindOperatorsOrdered]
  }
  
  @scala.inline
  implicit class FindOperatorsOrderedMutableBuilder[Self <: FindOperatorsOrdered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: () => OrderedBulkOperation): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteOne(value: () => OrderedBulkOperation): Self = StObject.set(x, "deleteOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceOne(value: js.Object => OrderedBulkOperation): Self = StObject.set(x, "replaceOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: js.Object => OrderedBulkOperation): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateOne(value: js.Object => OrderedBulkOperation): Self = StObject.set(x, "updateOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpsert(value: () => FindOperatorsOrdered): Self = StObject.set(x, "upsert", js.Any.fromFunction0(value))
  }
}
