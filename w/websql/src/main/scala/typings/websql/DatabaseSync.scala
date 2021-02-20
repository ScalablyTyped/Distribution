package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.4 Synchronous database API
  */
@js.native
trait DatabaseSync extends StObject {
  
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionSyncCallback): Unit = js.native
  
  def readTransaction(callback: SQLTransactionSyncCallback): Unit = js.native
  
  def transaction(callback: SQLTransactionSyncCallback): Unit = js.native
  
  /*readonly/const*/ var version: DOMString = js.native
}
object DatabaseSync {
  
  @scala.inline
  def apply(
    changeVersion: (DOMString, DOMString, SQLTransactionSyncCallback) => Unit,
    readTransaction: SQLTransactionSyncCallback => Unit,
    transaction: SQLTransactionSyncCallback => Unit,
    version: DOMString
  ): DatabaseSync = {
    val __obj = js.Dynamic.literal(changeVersion = js.Any.fromFunction3(changeVersion), readTransaction = js.Any.fromFunction1(readTransaction), transaction = js.Any.fromFunction1(transaction), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSync]
  }
  
  @scala.inline
  implicit class DatabaseSyncMutableBuilder[Self <: DatabaseSync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeVersion(value: (DOMString, DOMString, SQLTransactionSyncCallback) => Unit): Self = StObject.set(x, "changeVersion", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReadTransaction(value: SQLTransactionSyncCallback => Unit): Self = StObject.set(x, "readTransaction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransaction(value: SQLTransactionSyncCallback => Unit): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(value: DOMString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
