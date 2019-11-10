package typings.telejson.telejsonMod

import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("telejson", "reviver")
@js.native
object reviver extends js.Object {
  def apply(): js.ThisFunction2[
    /* this */ js.Any, 
    /* key */ String, 
    /* value */ String | ValueContainer, 
    String | Double | js.Symbol | RegExp | Date | ValueContainer | (js.Function1[/* repeated */ _, _]) | Null
  ] = js.native
}

