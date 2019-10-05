package typings.xrm

import typings.xrm.Xrm.GlobalContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GetGlobalContext")
@js.native
object GetGlobalContext extends js.Object {
  /**
    * Gets the global context.
    * The method provides access to the global context without going through the form context.
    *
    * It is preferreed to use {@link Xrm.Utility.getGlobalContext Xrm.Utility.getGlobalContext()} instead.
    * @see {@link Xrm.Utility.getGlobalContext}
    */
  def apply(): GlobalContext = js.native
}

