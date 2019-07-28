package typings.yaml.yamlMod

import typings.yaml.yamlMod.astNs.DocumentConstructor
import typings.yaml.yamlMod.astNs.MapBase
import typings.yaml.yamlMod.astNs.Scalar
import typings.yaml.yamlMod.astNs.SeqBase
import typings.yaml.yamlNumbers.`false`
import typings.yaml.yamlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Document: DocumentConstructor = js.native
  val defaultOptions: ParseOptions = js.native
  def createNode(value: js.Any): MapBase | SeqBase | Scalar = js.native
  @JSName("createNode")
  def createNode_false(value: js.Any, wrapScalars: `false`): MapBase | SeqBase | String | Double | Boolean | Null = js.native
  @JSName("createNode")
  def createNode_true(value: js.Any, wrapScalars: `true`): MapBase | SeqBase | Scalar = js.native
  def parse(str: String): js.Any = js.native
  def parse(str: String, options: ParseOptions): js.Any = js.native
  def parseAllDocuments(str: String): js.Array[typings.yaml.yamlMod.astNs.Document] = js.native
  def parseAllDocuments(str: String, options: ParseOptions): js.Array[typings.yaml.yamlMod.astNs.Document] = js.native
  def parseCST(str: String): ParsedCST = js.native
  def parseDocument(str: String): typings.yaml.yamlMod.astNs.Document = js.native
  def parseDocument(str: String, options: ParseOptions): typings.yaml.yamlMod.astNs.Document = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, options: ParseOptions): String = js.native
}

