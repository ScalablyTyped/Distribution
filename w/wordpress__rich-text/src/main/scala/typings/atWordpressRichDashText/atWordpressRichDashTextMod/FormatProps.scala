package typings.atWordpressRichDashText.atWordpressRichDashTextMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatProps extends js.Object {
  var activeAttributes: Record[String, String]
  var isActive: Boolean
  var value: Value
  def onChange(value: Value): Unit
}

object FormatProps {
  @scala.inline
  def apply(activeAttributes: Record[String, String], isActive: Boolean, onChange: Value => Unit, value: Value): FormatProps = {
    val __obj = js.Dynamic.literal(activeAttributes = activeAttributes.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormatProps]
  }
}

