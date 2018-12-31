package typings
package xDashEditableLib

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
  def editable(method: java.lang.String): XEditable = js.native
  def editable(method: java.lang.String, params: js.Any): XEditable = js.native
  def editable(options: js.Any): XEditable = js.native
}

