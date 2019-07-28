package typings.vegaDashLite.buildSrcStackMod

import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcFielddefMod.Field
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcMarkMod.MarkDef
import typings.vegaDashLite.vegaDashLiteStrings.area
import typings.vegaDashLite.vegaDashLiteStrings.bar
import typings.vegaDashLite.vegaDashLiteStrings.circle
import typings.vegaDashLite.vegaDashLiteStrings.line
import typings.vegaDashLite.vegaDashLiteStrings.point
import typings.vegaDashLite.vegaDashLiteStrings.rule
import typings.vegaDashLite.vegaDashLiteStrings.square
import typings.vegaDashLite.vegaDashLiteStrings.text
import typings.vegaDashLite.vegaDashLiteStrings.tick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/stack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val STACKABLE_MARKS: js.Array[square | area | circle | line | text | rule | point | bar | tick] = js.native
  val STACK_BY_DEFAULT_MARKS: js.Array[area | bar] = js.native
  def isStackOffset(s: String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean = js.native
  def stack(m: MarkDef, encoding: Encoding[Field], stackConfig: StackOffset): StackProperties = js.native
  def stack(m: Mark, encoding: Encoding[Field], stackConfig: StackOffset): StackProperties = js.native
}

