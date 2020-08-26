package typings.tizenCommonWeb.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tizen-common-web/application", "ApplicationControlData")
@js.native
class ApplicationControlData protected () extends js.Object {
  def this(key: String, value: js.Array[String]) = this()
  /**
    * An attribute to store the name of a key.
    */
  var key: String = js.native
  /**
    * An attribute to store the value associated with a key.
    */
  var value: js.Array[String] = js.native
}

