package typings.typeorm

import typings.typeorm.insertEventMod.InsertEvent
import typings.typeorm.loadEventMod.LoadEvent
import typings.typeorm.removeEventMod.RemoveEvent
import typings.typeorm.transactionCommitEventMod.TransactionCommitEvent
import typings.typeorm.transactionRollbackEventMod.TransactionRollbackEvent
import typings.typeorm.transactionStartEventMod.TransactionStartEvent
import typings.typeorm.updateEventMod.UpdateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitySubscriberInterfaceMod {
  
  @js.native
  trait EntitySubscriberInterface[Entity] extends StObject {
    
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
    implicit class EntitySubscriberInterfaceMutableBuilder[Self <: EntitySubscriberInterface[_], Entity] (val x: Self with EntitySubscriberInterface[Entity]) extends AnyVal {
      
      @scala.inline
      def setAfterInsert(value: /* event */ InsertEvent[Entity] => js.Promise[_] | Unit): Self = StObject.set(x, "afterInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterInsertUndefined: Self = StObject.set(x, "afterInsert", js.undefined)
      
      @scala.inline
      def setAfterLoad(value: (/* entity */ Entity, /* event */ js.UndefOr[LoadEvent[Entity]]) => js.Promise[_] | Unit): Self = StObject.set(x, "afterLoad", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
      
      @scala.inline
      def setAfterRemove(value: /* event */ RemoveEvent[Entity] => js.Promise[_] | Unit): Self = StObject.set(x, "afterRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterRemoveUndefined: Self = StObject.set(x, "afterRemove", js.undefined)
      
      @scala.inline
      def setAfterTransactionCommit(value: /* event */ TransactionCommitEvent => js.Promise[_] | Unit): Self = StObject.set(x, "afterTransactionCommit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterTransactionCommitUndefined: Self = StObject.set(x, "afterTransactionCommit", js.undefined)
      
      @scala.inline
      def setAfterTransactionRollback(value: /* event */ TransactionRollbackEvent => js.Promise[_] | Unit): Self = StObject.set(x, "afterTransactionRollback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterTransactionRollbackUndefined: Self = StObject.set(x, "afterTransactionRollback", js.undefined)
      
      @scala.inline
      def setAfterTransactionStart(value: /* event */ TransactionStartEvent => js.Promise[_] | Unit): Self = StObject.set(x, "afterTransactionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterTransactionStartUndefined: Self = StObject.set(x, "afterTransactionStart", js.undefined)
      
      @scala.inline
      def setAfterUpdate(value: /* event */ UpdateEvent[Entity] => js.Promise[_] | Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
      
      @scala.inline
      def setBeforeInsert(value: /* event */ InsertEvent[Entity] => js.Promise[_] | Unit): Self = StObject.set(x, "beforeInsert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeInsertUndefined: Self = StObject.set(x, "beforeInsert", js.undefined)
      
      @scala.inline
      def setBeforeRemove(value: /* event */ RemoveEvent[Entity] => js.Promise[_] | Unit): Self = StObject.set(x, "beforeRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeRemoveUndefined: Self = StObject.set(x, "beforeRemove", js.undefined)
      
      @scala.inline
      def setBeforeTransactionCommit(value: /* event */ TransactionCommitEvent => js.Promise[_] | Unit): Self = StObject.set(x, "beforeTransactionCommit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeTransactionCommitUndefined: Self = StObject.set(x, "beforeTransactionCommit", js.undefined)
      
      @scala.inline
      def setBeforeTransactionRollback(value: /* event */ TransactionRollbackEvent => js.Promise[_] | Unit): Self = StObject.set(x, "beforeTransactionRollback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeTransactionRollbackUndefined: Self = StObject.set(x, "beforeTransactionRollback", js.undefined)
      
      @scala.inline
      def setBeforeTransactionStart(value: /* event */ TransactionStartEvent => js.Promise[_] | Unit): Self = StObject.set(x, "beforeTransactionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeTransactionStartUndefined: Self = StObject.set(x, "beforeTransactionStart", js.undefined)
      
      @scala.inline
      def setBeforeUpdate(value: /* event */ UpdateEvent[Entity] => js.Promise[_] | Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
      
      @scala.inline
      def setListenTo(value: () => js.Function | String): Self = StObject.set(x, "listenTo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListenToUndefined: Self = StObject.set(x, "listenTo", js.undefined)
    }
  }
}
