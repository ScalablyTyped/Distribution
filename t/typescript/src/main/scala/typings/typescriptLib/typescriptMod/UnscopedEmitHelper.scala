package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnscopedEmitHelper extends EmitHelper {
  @JSName("scoped")
  val scoped_UnscopedEmitHelper: typescriptLib.typescriptLibNumbers.`false`
  @JSName("text")
  val text_UnscopedEmitHelper: java.lang.String
}

object UnscopedEmitHelper {
  @scala.inline
  def apply(
    name: java.lang.String,
    scoped: typescriptLib.typescriptLibNumbers.`false`,
    text: java.lang.String,
    priority: scala.Int | scala.Double = null
  ): UnscopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name, scoped = scoped, text = text)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnscopedEmitHelper]
  }
}

