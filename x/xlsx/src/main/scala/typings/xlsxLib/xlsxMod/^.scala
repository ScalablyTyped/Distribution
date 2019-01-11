package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xlsx", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val stream: xlsxLib.xlsxMod.StreamUtils = js.native
  val utils: xlsxLib.xlsxMod.XLSX$Utils = js.native
  val version: java.lang.String = js.native
  def read(data: js.Any): xlsxLib.xlsxMod.WorkBook = js.native
  def read(data: js.Any, opts: xlsxLib.xlsxMod.ParsingOptions): xlsxLib.xlsxMod.WorkBook = js.native
  def readFile(filename: java.lang.String): xlsxLib.xlsxMod.WorkBook = js.native
  def readFile(filename: java.lang.String, opts: xlsxLib.xlsxMod.ParsingOptions): xlsxLib.xlsxMod.WorkBook = js.native
  def write(data: xlsxLib.xlsxMod.WorkBook): js.Any = js.native
  def write(data: xlsxLib.xlsxMod.WorkBook, opts: xlsxLib.xlsxMod.WritingOptions): js.Any = js.native
  def writeFile(data: xlsxLib.xlsxMod.WorkBook, filename: java.lang.String): js.Any = js.native
  def writeFile(data: xlsxLib.xlsxMod.WorkBook, filename: java.lang.String, opts: xlsxLib.xlsxMod.WritingOptions): js.Any = js.native
}

