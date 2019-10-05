package typings.tampermonkey

import typings.tampermonkey.Tampermonkey.ValueChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_addValueChangeListener")
@js.native
object GM_addValueChangeListener extends js.Object {
  /**
    * Adds a change listener to the storage and returns the listener ID.
    * The `remote` argument of the callback function shows whether this value was
    * modified from the instance of another tab (`true`) or within this script
    * instance (`false`). Therefore this functionality can be used by scripts of
    * different browser tabs to communicate with each other.
    * @param name Name of the observed variable
    */
  def apply(name: String, listener: ValueChangeListener): Double = js.native
}

