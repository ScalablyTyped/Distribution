package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrCode extends js.Object {
  var errCode: scala.Double
  var errMsg: java.lang.String
}

object Anon_ErrCode {
  @scala.inline
  def apply(errCode: scala.Double, errMsg: java.lang.String): Anon_ErrCode = {
    val __obj = js.Dynamic.literal(errCode = errCode, errMsg = errMsg)
  
    __obj.asInstanceOf[Anon_ErrCode]
  }
}

