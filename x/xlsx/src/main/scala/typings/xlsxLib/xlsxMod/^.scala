package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xlsx", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val stream: StreamUtils = js.native
  val utils: XLSX$Utils = js.native
  val version: java.lang.String = js.native
  def read(data: js.Any): WorkBook = js.native
  def read(data: js.Any, opts: ParsingOptions): WorkBook = js.native
  def readFile(filename: java.lang.String): WorkBook = js.native
  def readFile(filename: java.lang.String, opts: ParsingOptions): WorkBook = js.native
  def write(data: WorkBook): js.Any = js.native
  def write(data: WorkBook, opts: WritingOptions): js.Any = js.native
  def writeFile(data: WorkBook, filename: java.lang.String): js.Any = js.native
  def writeFile(data: WorkBook, filename: java.lang.String, opts: WritingOptions): js.Any = js.native
}

