package typings.typescript.typescriptMod

import typings.typescript.typescriptNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnscopedEmitHelper extends EmitHelper {
  @JSName("scoped")
  val scoped_UnscopedEmitHelper: `false`
  @JSName("text")
  val text_UnscopedEmitHelper: String
}

object UnscopedEmitHelper {
  @scala.inline
  def apply(name: String, scoped: `false`, text: String, priority: Int | Double = null): UnscopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnscopedEmitHelper]
  }
}

