package typings.xregexp.xregexpMod

import typings.std.RegExp
import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "forEach")
@js.native
object forEach extends js.Object {
  def apply(
    str: String,
    regex: RegExp,
    callback: js.Function4[
      /* matchArr */ RegExpExecArray, 
      /* index */ Double, 
      /* input */ String, 
      /* regexp */ RegExp, 
      Unit
    ]
  ): js.Any = js.native
}

