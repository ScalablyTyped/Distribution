package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.4.1 Executing SQL statements
  */
@js.native
trait SQLTransactionSync extends StObject {
  
  def executeSql(sqlStatement: DOMString): SQLResultSet = js.native
  def executeSql(sqlStatement: DOMString, arguments: ObjectArray): SQLResultSet = js.native
}
