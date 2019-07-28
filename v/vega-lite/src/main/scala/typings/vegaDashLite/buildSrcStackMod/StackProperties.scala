package typings.vegaDashLite.buildSrcStackMod

import typings.vegaDashLite.Anon_Channel
import typings.vegaDashLite.vegaDashLiteStrings.x
import typings.vegaDashLite.vegaDashLiteStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackProperties extends js.Object {
  /** Measure axis of the stack. */
  var fieldChannel: x | y
  /** Dimension axis of the stack. */
  var groupbyChannel: x | y
  /**
    * Whether this stack will produce impute transform
    */
  var impute: Boolean
  /**
    * See `"stack"` property of Position Field Def.
    */
  var offset: StackOffset
  /** Stack-by fields e.g., color, detail */
  var stackBy: js.Array[Anon_Channel]
}

object StackProperties {
  @scala.inline
  def apply(
    fieldChannel: x | y,
    groupbyChannel: x | y,
    impute: Boolean,
    offset: StackOffset,
    stackBy: js.Array[Anon_Channel]
  ): StackProperties = {
    val __obj = js.Dynamic.literal(fieldChannel = fieldChannel.asInstanceOf[js.Any], groupbyChannel = groupbyChannel.asInstanceOf[js.Any], impute = impute, offset = offset, stackBy = stackBy)
  
    __obj.asInstanceOf[StackProperties]
  }
}

