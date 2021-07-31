package typings.xlsx.mod

import typings.ssf.mod.SSFDate
import typings.ssf.mod.SSFTable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SSF {
  
  @JSImport("xlsx", "SSF")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def format(fmt: String, `val`: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(fmt: String, `val`: js.Any, opts: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(fmt: Double, `val`: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(fmt: Double, `val`: js.Any, opts: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getTable(): SSFTable = ^.asInstanceOf[js.Dynamic].applyDynamic("get_table")().asInstanceOf[SSFTable]
  
  @scala.inline
  def isDate(fmt: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_date")(fmt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def load(fmt: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(fmt.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def load(fmt: String, idx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fmt.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def loadTable(tbl: SSFTable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load_table")(tbl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def parseDateCode(v: Double): SSFDate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_date_code")(v.asInstanceOf[js.Any]).asInstanceOf[SSFDate]
  @scala.inline
  def parseDateCode(v: Double, opts: js.Any): SSFDate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse_date_code")(v.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SSFDate]
  
  @JSImport("xlsx", "SSF.version")
  @js.native
  val version: String = js.native
}
