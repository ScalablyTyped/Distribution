package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstack extends js.Object {
  val STACKABLE_MARKS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.square | vegaDashEmbedLib.vegaDashEmbedLibStrings.area | vegaDashEmbedLib.vegaDashEmbedLibStrings.circle | vegaDashEmbedLib.vegaDashEmbedLibStrings.line | vegaDashEmbedLib.vegaDashEmbedLibStrings.text | vegaDashEmbedLib.vegaDashEmbedLibStrings.rule | vegaDashEmbedLib.vegaDashEmbedLibStrings.point | vegaDashEmbedLib.vegaDashEmbedLibStrings.bar | vegaDashEmbedLib.vegaDashEmbedLibStrings.tick
  ] = js.native
  val STACK_BY_DEFAULT_MARKS: js.Array[
    vegaDashEmbedLib.vegaDashEmbedLibStrings.area | vegaDashEmbedLib.vegaDashEmbedLibStrings.bar
  ] = js.native
  def isStackOffset(s: java.lang.String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ scala.Boolean = js.native
  def stack(
    m: vegaDashLiteLib.buildSrcMarkMod.MarkDef,
    encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
    stackConfig: vegaDashLiteLib.buildSrcStackMod.StackOffset
  ): vegaDashLiteLib.buildSrcStackMod.StackProperties = js.native
  def stack(
    m: vegaDashLiteLib.buildSrcMarkMod.Mark,
    encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[vegaDashLiteLib.buildSrcFielddefMod.Field],
    stackConfig: vegaDashLiteLib.buildSrcStackMod.StackOffset
  ): vegaDashLiteLib.buildSrcStackMod.StackProperties = js.native
}

