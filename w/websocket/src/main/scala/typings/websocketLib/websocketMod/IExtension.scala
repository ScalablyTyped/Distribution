package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtension extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object IExtension {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): IExtension = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[IExtension]
  }
}

