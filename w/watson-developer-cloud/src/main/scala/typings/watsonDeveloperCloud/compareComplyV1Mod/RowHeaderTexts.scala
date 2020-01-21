package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `text` value of a row header that is applicable to this body cell. */
trait RowHeaderTexts extends js.Object {
  /** The `text` value of a row header. */
  var text: js.UndefOr[String] = js.undefined
}

object RowHeaderTexts {
  @scala.inline
  def apply(text: String = null): RowHeaderTexts = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeaderTexts]
  }
}

