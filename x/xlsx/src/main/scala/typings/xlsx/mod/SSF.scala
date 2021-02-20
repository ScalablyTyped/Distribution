package typings.xlsx.mod

import typings.ssf.mod.SSFDate
import typings.ssf.mod.SSFTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SSF {
  
  @JSImport("xlsx", "SSF.format")
  @js.native
  def format(fmt: String, `val`: js.Any): String = js.native
  @JSImport("xlsx", "SSF.format")
  @js.native
  def format(fmt: String, `val`: js.Any, opts: js.Any): String = js.native
  @JSImport("xlsx", "SSF.format")
  @js.native
  def format(fmt: Double, `val`: js.Any): String = js.native
  @JSImport("xlsx", "SSF.format")
  @js.native
  def format(fmt: Double, `val`: js.Any, opts: js.Any): String = js.native
  
  @JSImport("xlsx", "SSF.get_table")
  @js.native
  def getTable(): SSFTable = js.native
  
  @JSImport("xlsx", "SSF.is_date")
  @js.native
  def isDate(fmt: String): Boolean = js.native
  
  @JSImport("xlsx", "SSF.load")
  @js.native
  def load(fmt: String): Double = js.native
  @JSImport("xlsx", "SSF.load")
  @js.native
  def load(fmt: String, idx: Double): Double = js.native
  
  @JSImport("xlsx", "SSF.load_table")
  @js.native
  def loadTable(tbl: SSFTable): Unit = js.native
  
  @JSImport("xlsx", "SSF.parse_date_code")
  @js.native
  def parseDateCode(v: Double): SSFDate = js.native
  @JSImport("xlsx", "SSF.parse_date_code")
  @js.native
  def parseDateCode(v: Double, opts: js.Any): SSFDate = js.native
  
  @JSImport("xlsx", "SSF.version")
  @js.native
  val version: String = js.native
}
