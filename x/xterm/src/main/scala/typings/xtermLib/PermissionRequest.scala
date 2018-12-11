package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PermissionRequest extends DeferredPermissionRequest {
  val state: MSWebViewPermissionState
  def defer(): scala.Unit
}

@JSGlobal("PermissionRequest")
@js.native
object PermissionRequest
  extends ScalablyTyped.runtime.Instantiable0[PermissionRequest]

