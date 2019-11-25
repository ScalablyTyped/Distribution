package typings.wpapi.wpapiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPEndpoint extends js.Object {
  var args: StringDictionary[HTTPArgument]
  var methods: js.Array[HTTPMethod]
}

object HTTPEndpoint {
  @scala.inline
  def apply(args: StringDictionary[HTTPArgument], methods: js.Array[HTTPMethod]): HTTPEndpoint = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTTPEndpoint]
  }
}

