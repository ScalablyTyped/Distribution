package typings
package xrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Xrm: xrmLib.XrmNs.XrmStatic
  def GetGlobalContext(): xrmLib.XrmNs.GlobalContext
}

object Window {
  @scala.inline
  def apply(GetGlobalContext: js.Function0[xrmLib.XrmNs.GlobalContext], Xrm: xrmLib.XrmNs.XrmStatic): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetGlobalContext")(GetGlobalContext)
    __obj.updateDynamic("Xrm")(Xrm)
    __obj.asInstanceOf[Window]
  }
}

