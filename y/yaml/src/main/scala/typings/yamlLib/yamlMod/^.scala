package typings
package yamlLib.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Document: yamlLib.yamlMod.astNs.DocumentConstructor = js.native
  val defaultOptions: ParseOptions = js.native
  def createNode(value: js.Any): yamlLib.yamlMod.astNs.MapBase | yamlLib.yamlMod.astNs.SeqBase | yamlLib.yamlMod.astNs.Scalar = js.native
  def createNode(value: js.Any, wrapScalars: yamlLib.yamlLibNumbers.`false`): yamlLib.yamlMod.astNs.MapBase | yamlLib.yamlMod.astNs.SeqBase | java.lang.String | scala.Double | scala.Boolean | scala.Null = js.native
  def createNode(value: js.Any, wrapScalars: yamlLib.yamlLibNumbers.`true`): yamlLib.yamlMod.astNs.MapBase | yamlLib.yamlMod.astNs.SeqBase | yamlLib.yamlMod.astNs.Scalar = js.native
  def parse(str: java.lang.String): js.Any = js.native
  def parse(str: java.lang.String, options: ParseOptions): js.Any = js.native
  def parseAllDocuments(str: java.lang.String): js.Array[yamlLib.yamlMod.astNs.Document] = js.native
  def parseAllDocuments(str: java.lang.String, options: ParseOptions): js.Array[yamlLib.yamlMod.astNs.Document] = js.native
  def parseCST(str: java.lang.String): ParsedCST = js.native
  def parseDocument(str: java.lang.String): yamlLib.yamlMod.astNs.Document = js.native
  def parseDocument(str: java.lang.String, options: ParseOptions): yamlLib.yamlMod.astNs.Document = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, options: ParseOptions): java.lang.String = js.native
}

