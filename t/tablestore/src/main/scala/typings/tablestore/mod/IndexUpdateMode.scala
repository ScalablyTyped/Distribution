package typings.tablestore.mod

import typings.tablestore.tablestoreInts.`0`
import typings.tablestore.tablestoreInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexUpdateMode {
  
  @JSImport("tablestore", "IndexUpdateMode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tablestore", "IndexUpdateMode.IUM_ASYNC_INDEX")
  @js.native
  def IUM_ASYNC_INDEX: `0` = js.native
  inline def IUM_ASYNC_INDEX_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IUM_ASYNC_INDEX")(x.asInstanceOf[js.Any])
  
  @JSImport("tablestore", "IndexUpdateMode.IUM_SYNC_INDEX")
  @js.native
  def IUM_SYNC_INDEX: `1` = js.native
  inline def IUM_SYNC_INDEX_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IUM_SYNC_INDEX")(x.asInstanceOf[js.Any])
}
