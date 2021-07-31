package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.3 Asynchronous database API - The transaction() and readTransaction() methods takes
  * one to three arguments. When called, these methods must immediately return and then
  * asynchronously run the transaction steps with the transaction callback being the
  * first argument, the error callback being the second argument, if any, the success
  * callback being the third argument, if any, and with no preflight operation or
  * postflight operation
  */
@js.native
trait Database extends StObject {
  
  /** The changeVersion() method allows scripts to atomically verify the version number and change
    * it at the same time as doing a schema update. When the method is invoked, it must immediately
    * return, and then asynchronously run the transaction steps with the transaction callback being
    * the third argument, the error callback being the fourth argument, the success callback being
    * the fifth argument
    */
  def changeVersion(oldVersion: DOMString, newVersion: DOMString): Unit = js.native
  def changeVersion(
    oldVersion: DOMString,
    newVersion: DOMString,
    callback: Unit,
    errorCallback: Unit,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  def changeVersion(
    oldVersion: DOMString,
    newVersion: DOMString,
    callback: Unit,
    errorCallback: SQLTransactionErrorCallback
  ): Unit = js.native
  def changeVersion(
    oldVersion: DOMString,
    newVersion: DOMString,
    callback: Unit,
    errorCallback: SQLTransactionErrorCallback,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionCallback): Unit = js.native
  def changeVersion(
    oldVersion: DOMString,
    newVersion: DOMString,
    callback: SQLTransactionCallback,
    errorCallback: Unit,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  def changeVersion(
    oldVersion: DOMString,
    newVersion: DOMString,
    callback: SQLTransactionCallback,
    errorCallback: SQLTransactionErrorCallback
  ): Unit = js.native
  def changeVersion(
    oldVersion: DOMString,
    newVersion: DOMString,
    callback: SQLTransactionCallback,
    errorCallback: SQLTransactionErrorCallback,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  
  def readTransaction(callback: SQLTransactionCallback): Unit = js.native
  def readTransaction(callback: SQLTransactionCallback, errorCallback: Unit, successCallback: SQLVoidCallback): Unit = js.native
  def readTransaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
  def readTransaction(
    callback: SQLTransactionCallback,
    errorCallback: SQLTransactionErrorCallback,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  
  def transaction(callback: SQLTransactionCallback): Unit = js.native
  def transaction(callback: SQLTransactionCallback, errorCallback: Unit, successCallback: SQLVoidCallback): Unit = js.native
  def transaction(callback: SQLTransactionCallback, errorCallback: SQLTransactionErrorCallback): Unit = js.native
  def transaction(
    callback: SQLTransactionCallback,
    errorCallback: SQLTransactionErrorCallback,
    successCallback: SQLVoidCallback
  ): Unit = js.native
  
  /*readonly/const*/ var version: DOMString = js.native
}
