package typings.tablestore.mod

import typings.tablestore.anon.AND
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablestore", "CompositeCondition")
@js.native
open class CompositeCondition protected () extends ColumnCondition {
  def this(combinator: EnumValues[AND]) = this()
  
  def addSubCondition(condition: ColumnCondition): Unit = js.native
  
  var sub_conditions: js.Array[ColumnCondition] = js.native
}
