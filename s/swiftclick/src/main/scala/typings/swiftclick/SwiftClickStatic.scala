package typings.swiftclick

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiftClickStatic extends js.Object {
  def attach(contextEl: Element): SwiftClickObject
}

object SwiftClickStatic {
  @scala.inline
  def apply(attach: Element => SwiftClickObject): SwiftClickStatic = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach))
  
    __obj.asInstanceOf[SwiftClickStatic]
  }
}

