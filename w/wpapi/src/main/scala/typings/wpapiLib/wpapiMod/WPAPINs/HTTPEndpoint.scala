package typings
package wpapiLib.wpapiMod.WPAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPEndpoint extends js.Object {
  var args: org.scalablytyped.runtime.StringDictionary[HTTPArgument]
  var methods: js.Array[HTTPMethod]
}

object HTTPEndpoint {
  @scala.inline
  def apply(args: org.scalablytyped.runtime.StringDictionary[HTTPArgument], methods: js.Array[HTTPMethod]): HTTPEndpoint = {
    val __obj = js.Dynamic.literal(args = args, methods = methods)
  
    __obj.asInstanceOf[HTTPEndpoint]
  }
}

