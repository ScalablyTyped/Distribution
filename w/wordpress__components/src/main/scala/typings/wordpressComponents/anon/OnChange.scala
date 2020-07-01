package typings.wordpressComponents.anon

import typings.wordpressComponents.selectControlMod.SelectControl.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChange[T /* <: String | js.Array[String] */] extends js.Object {
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  var value: js.UndefOr[T] = js.undefined
  /**
    * A function that receives the value of the new option that is being
    * selected as input. If multiple is true the value received is an
    * array of the selected value. If multiple is false the value received
    * is a single value with the new selected value.
    */
  def onChange(value: T): Unit
}

object OnChange {
  @scala.inline
  def apply[/* <: java.lang.String | js.Array[java.lang.String] */ T](onChange: T => Unit, options: js.Array[Option] = null, value: T = null): OnChange[T] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange[T]]
  }
}

