package typings.xrm

import typings.xrm.XrmNs.GlobalContext
import typings.xrm.XrmNs.XrmStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var Xrm: XrmStatic = js.native
  /**
    * Gets the global context.
    * The method provides access to the global context without going through the form context.
    *
    * It is preferreed to use {@link Xrm.Utility.getGlobalContext Xrm.Utility.getGlobalContext()} instead.
    * @see {@link Xrm.Utility.getGlobalContext}
    */
  def GetGlobalContext(): GlobalContext = js.native
}

