package typings
package swiftclickLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiftClickStatic extends js.Object {
  def attach(contextEl: stdLib.Element): SwiftClickObject
}

object SwiftClickStatic {
  @scala.inline
  def apply(attach: stdLib.Element => SwiftClickObject): SwiftClickStatic = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
  
    __obj.asInstanceOf[SwiftClickStatic]
  }
}

