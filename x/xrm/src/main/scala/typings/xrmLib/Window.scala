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
  def apply(GetGlobalContext: () => xrmLib.XrmNs.GlobalContext, Xrm: xrmLib.XrmNs.XrmStatic): Window = {
    val __obj = js.Dynamic.literal(GetGlobalContext = js.Any.fromFunction0(GetGlobalContext), Xrm = Xrm)
  
    __obj.asInstanceOf[Window]
  }
}

