package typings
package vegaDashLiteLib.buildSrcStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/stack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val STACKABLE_MARKS: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.square | vegaDashLiteLib.vegaDashLiteLibStrings.area | vegaDashLiteLib.vegaDashLiteLibStrings.circle | vegaDashLiteLib.vegaDashLiteLibStrings.line | vegaDashLiteLib.vegaDashLiteLibStrings.text | vegaDashLiteLib.vegaDashLiteLibStrings.rule | vegaDashLiteLib.vegaDashLiteLibStrings.point | vegaDashLiteLib.vegaDashLiteLibStrings.bar | vegaDashLiteLib.vegaDashLiteLibStrings.tick
  ] = js.native
  val STACK_BY_DEFAULT_MARKS: js.Array[
    vegaDashLiteLib.vegaDashLiteLibStrings.area | vegaDashLiteLib.vegaDashLiteLibStrings.bar
  ] = js.native
  def isStackOffset(s: java.lang.String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ scala.Boolean = js.native
  def stack(
    m: vegaDashLiteLib.buildSrcMarkMod.MarkDef,
    encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
    stackConfig: StackOffset
  ): StackProperties = js.native
  def stack(
    m: vegaDashLiteLib.buildSrcMarkMod.Mark,
    encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
    stackConfig: StackOffset
  ): StackProperties = js.native
}

