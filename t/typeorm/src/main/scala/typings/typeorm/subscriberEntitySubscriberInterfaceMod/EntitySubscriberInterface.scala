package typings.typeorm.subscriberEntitySubscriberInterfaceMod

import typings.typeorm.eventInsertEventMod.InsertEvent
import typings.typeorm.eventLoadEventMod.LoadEvent
import typings.typeorm.eventRemoveEventMod.RemoveEvent
import typings.typeorm.eventTransactionCommitEventMod.TransactionCommitEvent
import typings.typeorm.eventTransactionRollbackEventMod.TransactionRollbackEvent
import typings.typeorm.eventTransactionStartEventMod.TransactionStartEvent
import typings.typeorm.eventUpdateEventMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySubscriberInterface[Entity] extends js.Object {
  
  /**
    * Called after entity is inserted to the database.
    */
  var afterInsert: js.UndefOr[js.Function1[/* event */ InsertEvent[Entity], js.Promise[_] | Unit]] = js.native
  
  /**
    * Called after entity is loaded from the database.
    *
    * For backward compatibility this signature is slightly different from the
    * others.  `event` was added later but is always provided (it is only
    * optional in the signature so that its introduction does not break
    * compilation for existing subscribers).
    */
  var afterLoad: js.UndefOr[
    js.Function2[/* entity */ Entity, /* event */ js.UndefOr[LoadEvent[Entity]], js.Promise[_] | Unit]
  ] = js.native
  
  /**
    * Called after entity is removed from the database.
    */
  var afterRemove: js.UndefOr[js.Function1[/* event */ RemoveEvent[Entity], js.Promise[_] | Unit]] = js.native
  
  /**
    * Called after transaction is committed.
    */
  var afterTransactionCommit: js.UndefOr[js.Function1[/* event */ TransactionCommitEvent, js.Promise[_] | Unit]] = js.native
  
  /**
    * Called after transaction rollback.
    */
  var afterTransactionRollback: js.UndefOr[js.Function1[/* event */ TransactionRollbackEvent, js.Promise[_] | Unit]] = js.native
  
  /**
    * Called after transaction is started.
    */
  var afterTransactionStart: js.UndefOr[js.Function1[/* event */ TransactionStartEvent, js.Promise[_] | Unit]] = js.native
  
  /**
    * Called after entity is updated in the database.
    */
  var afterUpdate: js.UndefOr[js.Function1[/* event */ UpdateEvent[Entity], js.Promise[_] | Unit]] = js.native
  
  /**
    * Called before entity is inserted to the database.
    */
  var beforeInsert: js.UndefOr[js.Function1[/* event */ InsertEvent[Entity], js.Promise[_] | Unit]] = js.native
  
  /**
    * Called before entity is removed from the database.
    */
  var beforeRemove: js.UndefOr[js.Function1[/* event */ RemoveEvent[Entity], js.Promise[_] | Unit]] = js.native
  
  /**
    * Called before transaction is committed.
    */
  var beforeTransactionCommit: js.UndefOr[js.Function1[/* event */ TransactionCommitEvent, js.Promise[_] | Unit]] = js.native
  
  /**
    * Called before transaction rollback.
    */
  var beforeTransactionRollback: js.UndefOr[js.Function1[/* event */ TransactionRollbackEvent, js.Promise[_] | Unit]] = js.native
  
  /**
    * Called before transaction is started.
    */
  var beforeTransactionStart: js.UndefOr[js.Function1[/* event */ TransactionStartEvent, js.Promise[_] | Unit]] = js.native
  
  /**
    * Called before entity is updated in the database.
    */
  var beforeUpdate: js.UndefOr[js.Function1[/* event */ UpdateEvent[Entity], js.Promise[_] | Unit]] = js.native
  
  /**
    * Returns the class of the entity to which events will listen.
    * If this method is omitted, then subscriber will listen to events of all entities.
    */
  var listenTo: js.UndefOr[js.Function0[js.Function | String]] = js.native
}
object EntitySubscriberInterface {
  
  @scala.inline
  def apply[Entity](): EntitySubscriberInterface[Entity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitySubscriberInterface[Entity]]
  }
  
  @scala.inline
  implicit class EntitySubscriberInterfaceOps[Self <: EntitySubscriberInterface[_], Entity] (val x: Self with EntitySubscriberInterface[Entity]) extends AnyVal {
    
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
    def setAfterInsert(value: /* event */ InsertEvent[Entity] => js.Promise[_] | Unit): Self = this.set("afterInsert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterInsert: Self = this.set("afterInsert", js.undefined)
    
    @scala.inline
    def setAfterLoad(value: (/* entity */ Entity, /* event */ js.UndefOr[LoadEvent[Entity]]) => js.Promise[_] | Unit): Self = this.set("afterLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterLoad: Self = this.set("afterLoad", js.undefined)
    
    @scala.inline
    def setAfterRemove(value: /* event */ RemoveEvent[Entity] => js.Promise[_] | Unit): Self = this.set("afterRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterRemove: Self = this.set("afterRemove", js.undefined)
    
    @scala.inline
    def setAfterTransactionCommit(value: /* event */ TransactionCommitEvent => js.Promise[_] | Unit): Self = this.set("afterTransactionCommit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterTransactionCommit: Self = this.set("afterTransactionCommit", js.undefined)
    
    @scala.inline
    def setAfterTransactionRollback(value: /* event */ TransactionRollbackEvent => js.Promise[_] | Unit): Self = this.set("afterTransactionRollback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterTransactionRollback: Self = this.set("afterTransactionRollback", js.undefined)
    
    @scala.inline
    def setAfterTransactionStart(value: /* event */ TransactionStartEvent => js.Promise[_] | Unit): Self = this.set("afterTransactionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterTransactionStart: Self = this.set("afterTransactionStart", js.undefined)
    
    @scala.inline
    def setAfterUpdate(value: /* event */ UpdateEvent[Entity] => js.Promise[_] | Unit): Self = this.set("afterUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterUpdate: Self = this.set("afterUpdate", js.undefined)
    
    @scala.inline
    def setBeforeInsert(value: /* event */ InsertEvent[Entity] => js.Promise[_] | Unit): Self = this.set("beforeInsert", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeInsert: Self = this.set("beforeInsert", js.undefined)
    
    @scala.inline
    def setBeforeRemove(value: /* event */ RemoveEvent[Entity] => js.Promise[_] | Unit): Self = this.set("beforeRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeRemove: Self = this.set("beforeRemove", js.undefined)
    
    @scala.inline
    def setBeforeTransactionCommit(value: /* event */ TransactionCommitEvent => js.Promise[_] | Unit): Self = this.set("beforeTransactionCommit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeTransactionCommit: Self = this.set("beforeTransactionCommit", js.undefined)
    
    @scala.inline
    def setBeforeTransactionRollback(value: /* event */ TransactionRollbackEvent => js.Promise[_] | Unit): Self = this.set("beforeTransactionRollback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeTransactionRollback: Self = this.set("beforeTransactionRollback", js.undefined)
    
    @scala.inline
    def setBeforeTransactionStart(value: /* event */ TransactionStartEvent => js.Promise[_] | Unit): Self = this.set("beforeTransactionStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeTransactionStart: Self = this.set("beforeTransactionStart", js.undefined)
    
    @scala.inline
    def setBeforeUpdate(value: /* event */ UpdateEvent[Entity] => js.Promise[_] | Unit): Self = this.set("beforeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeUpdate: Self = this.set("beforeUpdate", js.undefined)
    
    @scala.inline
    def setListenTo(value: () => js.Function | String): Self = this.set("listenTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteListenTo: Self = this.set("listenTo", js.undefined)
  }
}
