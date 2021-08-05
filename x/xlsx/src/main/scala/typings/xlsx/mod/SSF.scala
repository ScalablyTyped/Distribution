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
  
  inline def format(fmt: String, `val`: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(fmt: String, `val`: js.Any, opts: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(fmt: Double, `val`: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(fmt: Double, `val`: js.Any, opts: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTable(): SSFTable = ^.asInstanceOf[js.Dynamic].applyDynamic("get_table")().asInstanceOf[SSFTable]
  
  inline def isDate(fmt: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_date")(fmt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def load(fmt: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(fmt.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def load(fmt: String, idx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fmt.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def loadTable(tbl: SSFTable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load_table")(tbl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseDateCode(v: Double): SSFDate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_date_code")(v.asInstanceOf[js.Any]).asInstanceOf[SSFDate]
  inline def parseDateCode(v: Double, opts: js.Any): SSFDate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse_date_code")(v.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SSFDate]
  
  @JSImport("xlsx", "SSF.version")
  @js.native
  val version: String = js.native
}
