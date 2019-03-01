package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Result extends js.Object {
  /** If a correlation exists, this will be set to a 4x4 transform matrix that changes basis from the infrared frame source coordinate system to the target entity coordinate system. */ var result: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Matrix4x4
  /** True if a correlation exists, otherwise false. */ var returnValue: scala.Boolean
}

object Anon_Result {
  @scala.inline
  def apply(result: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Matrix4x4, returnValue: scala.Boolean): Anon_Result = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_Result]
  }
}

