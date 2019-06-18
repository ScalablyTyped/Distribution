package typings
package atWordpressRichDashTextLib.atWordpressRichDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatProps extends js.Object {
  var activeAttributes: stdLib.Record[java.lang.String, java.lang.String]
  var isActive: scala.Boolean
  var value: Value
  def onChange(value: Value): scala.Unit
}

object FormatProps {
  @scala.inline
  def apply(
    activeAttributes: stdLib.Record[java.lang.String, java.lang.String],
    isActive: scala.Boolean,
    onChange: Value => scala.Unit,
    value: Value
  ): FormatProps = {
    val __obj = js.Dynamic.literal(activeAttributes = activeAttributes, isActive = isActive, onChange = js.Any.fromFunction1(onChange), value = value)
  
    __obj.asInstanceOf[FormatProps]
  }
}

