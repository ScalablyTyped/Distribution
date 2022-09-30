package typings.tablestore.mod

import typings.tablestore.tablestoreInts.`1`
import typings.tablestore.tablestoreInts.`2`
import typings.tablestore.tablestoreInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BatchWriteType {
  
  @JSImport("tablestore", "BatchWriteType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tablestore", "BatchWriteType.DELETE")
  @js.native
  def DELETE: `3` = js.native
  inline def DELETE_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "BatchWriteType.PUT")
  @js.native
  def PUT: `1` = js.native
  inline def PUT_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUT")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "BatchWriteType.UPDATE")
  @js.native
  def UPDATE: `2` = js.native
  inline def UPDATE_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(x.asInstanceOf[js.Any])
}
