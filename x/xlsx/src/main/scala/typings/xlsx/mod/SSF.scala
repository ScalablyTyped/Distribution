package typings.xlsx.mod

import typings.ssf.mod.SSFDate
import typings.ssf.mod.SSFTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xlsx", "SSF")
@js.native
object SSF extends js.Object {
  
  def format(fmt: String, `val`: js.Any): String = js.native
  def format(fmt: String, `val`: js.Any, opts: js.Any): String = js.native
  def format(fmt: Double, `val`: js.Any): String = js.native
  def format(fmt: Double, `val`: js.Any, opts: js.Any): String = js.native
  
  @JSName("get_table")
  def getTable(): SSFTable = js.native
  
  @JSName("is_date")
  def isDate(fmt: String): Boolean = js.native
  
  def load(fmt: String): Double = js.native
  def load(fmt: String, idx: Double): Double = js.native
  
  @JSName("load_table")
  def loadTable(tbl: SSFTable): Unit = js.native
  
  @JSName("parse_date_code")
  def parseDateCode(v: Double): SSFDate = js.native
  @JSName("parse_date_code")
  def parseDateCode(v: Double, opts: js.Any): SSFDate = js.native
  
  val version: String = js.native
}
