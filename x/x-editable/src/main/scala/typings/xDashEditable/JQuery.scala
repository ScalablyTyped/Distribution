package typings.xDashEditable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Initializes editable with the specified options
    * @param options an object with options specific to the editable instance
    */
  def editable(): XEditable = js.native
  /**
    * Initializes editable calling the specific method with is parameters
    * @param method the method to call
    * @param params the parameters expected by the method
    */
  def editable(method: String): XEditable = js.native
  def editable(method: String, params: js.Any): XEditable = js.native
  def editable(options: js.Any): XEditable = js.native
}

