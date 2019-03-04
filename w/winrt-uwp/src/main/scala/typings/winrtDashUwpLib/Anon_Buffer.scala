package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */ var buffer: js.Array[scala.Double]
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */ var bytesWritten: scala.Double
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: js.Array[scala.Double], bytesWritten: scala.Double): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesWritten = bytesWritten)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

