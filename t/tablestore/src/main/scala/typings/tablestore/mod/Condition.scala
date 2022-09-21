package typings.tablestore.mod

import typings.tablestore.anon.EXPECTEXIST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablestore", "Condition")
@js.native
open class Condition protected () extends StObject {
  def this(rowExistenceExpectation: EnumValues[EXPECTEXIST]) = this()
  def this(rowExistenceExpectation: EnumValues[EXPECTEXIST], columnCondition: ColumnCondition) = this()
  
  var columnCondition: ColumnCondition = js.native
}
