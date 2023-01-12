package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.4 Synchronous database API
  */
trait DatabaseSync extends StObject {
  
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionSyncCallback): Unit
  
  def readTransaction(callback: SQLTransactionSyncCallback): Unit
  
  def transaction(callback: SQLTransactionSyncCallback): Unit
  
  /*readonly/const*/ var version: DOMString
}
object DatabaseSync {
  
  inline def apply(
    changeVersion: (DOMString, DOMString, SQLTransactionSyncCallback) => Unit,
    readTransaction: SQLTransactionSyncCallback => Unit,
    transaction: SQLTransactionSyncCallback => Unit,
    version: DOMString
  ): DatabaseSync = {
    val __obj = js.Dynamic.literal(changeVersion = js.Any.fromFunction3(changeVersion), readTransaction = js.Any.fromFunction1(readTransaction), transaction = js.Any.fromFunction1(transaction), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseSync] (val x: Self) extends AnyVal {
    
    inline def setChangeVersion(value: (DOMString, DOMString, SQLTransactionSyncCallback) => Unit): Self = StObject.set(x, "changeVersion", js.Any.fromFunction3(value))
    
    inline def setReadTransaction(value: SQLTransactionSyncCallback => Unit): Self = StObject.set(x, "readTransaction", js.Any.fromFunction1(value))
    
    inline def setTransaction(value: SQLTransactionSyncCallback => Unit): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
    
    inline def setVersion(value: DOMString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
