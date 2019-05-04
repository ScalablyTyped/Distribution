package typings
package vegaDashLiteLib.buildSrcStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackProperties extends js.Object {
  /** Measure axis of the stack. */
  var fieldChannel: vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y
  /** Dimension axis of the stack. */
  var groupbyChannel: vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y
  /**
    * Whether this stack will produce impute transform
    */
  var impute: scala.Boolean
  /**
    * See `"stack"` property of Position Field Def.
    */
  var offset: StackOffset
  /** Stack-by fields e.g., color, detail */
  var stackBy: js.Array[vegaDashLiteLib.Anon_Channel]
}

object StackProperties {
  @scala.inline
  def apply(
    fieldChannel: vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y,
    groupbyChannel: vegaDashLiteLib.vegaDashLiteLibStrings.x | vegaDashLiteLib.vegaDashLiteLibStrings.y,
    impute: scala.Boolean,
    offset: StackOffset,
    stackBy: js.Array[vegaDashLiteLib.Anon_Channel]
  ): StackProperties = {
    val __obj = js.Dynamic.literal(fieldChannel = fieldChannel.asInstanceOf[js.Any], groupbyChannel = groupbyChannel.asInstanceOf[js.Any], impute = impute, offset = offset, stackBy = stackBy)
  
    __obj.asInstanceOf[StackProperties]
  }
}

