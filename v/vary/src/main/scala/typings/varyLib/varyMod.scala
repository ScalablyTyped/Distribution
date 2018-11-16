package typings
package varyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vary", JSImport.Namespace)
@js.native
object varyMod extends js.Object {
  def apply(res: nodeLib.httpMod.ServerResponse, field: java.lang.String | js.Array[java.lang.String]): scala.Unit = js.native
  def append(header: java.lang.String, field: java.lang.String): java.lang.String = js.native
  def append(header: java.lang.String, field: js.Array[java.lang.String]): java.lang.String = js.native
}

