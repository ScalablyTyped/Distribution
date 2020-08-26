package typings.yaml.utilMod

import typings.std.Error
import typings.yaml.anon.End
import typings.yaml.parseCstMod.CST.Node
import typings.yaml.parseCstMod.CST.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/util", "YAMLError")
@js.native
class YAMLError () extends Error {
  var linePos: js.UndefOr[End] = js.native
  @JSName("name")
  var name_YAMLError: typings.yaml.yamlStrings.YAMLReferenceError | typings.yaml.yamlStrings.YAMLSemanticError | typings.yaml.yamlStrings.YAMLSyntaxError | typings.yaml.yamlStrings.YAMLWarning = js.native
  var nodeType: js.UndefOr[Type] = js.native
  var range: js.UndefOr[Range] = js.native
  var source: js.UndefOr[Node] = js.native
  /**
    * Drops `source` and adds `nodeType`, `range` and `linePos`, as well as
    * adding details to `message`. Run automatically for document errors if
    * the `prettyErrors` option is set.
    */
  def makePretty(): Unit = js.native
}

