package typings
package xrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object xrmLibMembers extends js.Object {
  var Xrm: xrmLib.XrmNs.XrmStatic = js.native
  /**
    * Gets the global context.
    * The method provides access to the global context without going through the form context.
    *
    * It is preferreed to use {@link Xrm.Utility.getGlobalContext Xrm.Utility.getGlobalContext()} instead.
    * @see {@link Xrm.Utility.getGlobalContext}
    */
  def GetGlobalContext(): xrmLib.XrmNs.GlobalContext = js.native
}

