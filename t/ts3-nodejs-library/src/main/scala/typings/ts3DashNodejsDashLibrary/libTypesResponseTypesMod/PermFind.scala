package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermFind extends js.Object {
  var id1: Double
  var id2: Double
  var p: Double
  var t: Double
}

object PermFind {
  @scala.inline
  def apply(id1: Double, id2: Double, p: Double, t: Double): PermFind = {
    val __obj = js.Dynamic.literal(id1 = id1, id2 = id2, p = p, t = t)
  
    __obj.asInstanceOf[PermFind]
  }
}

