package typings.tablestore.mod

import typings.tablestore.tablestoreStrings.DELETE
import typings.tablestore.tablestoreStrings.DELETE_ALL
import typings.tablestore.tablestoreStrings.INCREMENT
import typings.tablestore.tablestoreStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UpdateType {
  
  @JSImport("tablestore", "UpdateType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tablestore", "UpdateType.DELETE")
  @js.native
  def DELETE: typings.tablestore.tablestoreStrings.DELETE = js.native
  inline def DELETE_=(x: DELETE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "UpdateType.DELETE_ALL")
  @js.native
  def DELETE_ALL: typings.tablestore.tablestoreStrings.DELETE_ALL = js.native
  inline def DELETE_ALL_=(x: DELETE_ALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE_ALL")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "UpdateType.INCREMENT")
  @js.native
  def INCREMENT: typings.tablestore.tablestoreStrings.INCREMENT = js.native
  inline def INCREMENT_=(x: INCREMENT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCREMENT")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "UpdateType.PUT")
  @js.native
  def PUT: typings.tablestore.tablestoreStrings.PUT = js.native
  inline def PUT_=(x: PUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
}
