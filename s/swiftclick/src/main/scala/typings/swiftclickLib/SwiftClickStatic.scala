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
  def apply(attach: js.Function1[stdLib.Element, SwiftClickObject]): SwiftClickStatic = {
    val __obj = js.Dynamic.literal(attach = attach)
  
    __obj.asInstanceOf[SwiftClickStatic]
  }
}

