package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.3.1 Executing SQL statements
  */
@js.native
trait SQLTransaction extends StObject {
  
  def executeSql(sqlStatement: DOMString): Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: Unit, callback: Unit, errorCallback: SQLStatementErrorCallback): Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: Unit, callback: SQLStatementCallback): Unit = js.native
  def executeSql(
    sqlStatement: DOMString,
    arguments: Unit,
    callback: SQLStatementCallback,
    errorCallback: SQLStatementErrorCallback
  ): Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: ObjectArray): Unit = js.native
  def executeSql(
    sqlStatement: DOMString,
    arguments: ObjectArray,
    callback: Unit,
    errorCallback: SQLStatementErrorCallback
  ): Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: ObjectArray, callback: SQLStatementCallback): Unit = js.native
  def executeSql(
    sqlStatement: DOMString,
    arguments: ObjectArray,
    callback: SQLStatementCallback,
    errorCallback: SQLStatementErrorCallback
  ): Unit = js.native
}
