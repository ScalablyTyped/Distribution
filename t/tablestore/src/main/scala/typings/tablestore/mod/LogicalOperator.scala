package typings.tablestore.mod

import typings.tablestore.tablestoreNumbers.`1`
import typings.tablestore.tablestoreNumbers.`2`
import typings.tablestore.tablestoreNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LogicalOperator {
  
  @JSImport("tablestore", "LogicalOperator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tablestore", "LogicalOperator.AND")
  @js.native
  def AND: `2` = js.native
  inline def AND_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AND")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "LogicalOperator.NOT")
  @js.native
  def NOT: `1` = js.native
  inline def NOT_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "LogicalOperator.OR")
  @js.native
  def OR: `3` = js.native
  inline def OR_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OR")(x.asInstanceOf[js.Any])
}
