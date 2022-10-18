package typings.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWrapCellMod {
  
  @JSImport("table/dist/src/wrapCell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapCell(cellValue: String, cellWidth: Double, useWrapWord: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCell")(cellValue.asInstanceOf[js.Any], cellWidth.asInstanceOf[js.Any], useWrapWord.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
