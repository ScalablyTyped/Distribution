package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.area
import typings.vegaDashEmbed.vegaDashEmbedStrings.bar
import typings.vegaDashEmbed.vegaDashEmbedStrings.circle
import typings.vegaDashEmbed.vegaDashEmbedStrings.line
import typings.vegaDashEmbed.vegaDashEmbedStrings.point
import typings.vegaDashEmbed.vegaDashEmbedStrings.rule
import typings.vegaDashEmbed.vegaDashEmbedStrings.square
import typings.vegaDashEmbed.vegaDashEmbedStrings.text
import typings.vegaDashEmbed.vegaDashEmbedStrings.tick
import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcFielddefMod.Field
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcMarkMod.MarkDef
import typings.vegaDashLite.buildSrcStackMod.StackOffset
import typings.vegaDashLite.buildSrcStackMod.StackProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstack extends js.Object {
  val STACKABLE_MARKS: js.Array[square | area | circle | line | text | rule | point | bar | tick] = js.native
  val STACK_BY_DEFAULT_MARKS: js.Array[area | bar] = js.native
  def isStackOffset(s: String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean = js.native
  def stack(m: MarkDef, encoding: Encoding[Field], stackConfig: StackOffset): StackProperties = js.native
  def stack(m: Mark, encoding: Encoding[Field], stackConfig: StackOffset): StackProperties = js.native
}

