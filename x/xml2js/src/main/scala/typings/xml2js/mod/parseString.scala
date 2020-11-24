package typings.xml2js.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml2js", "parseString")
@js.native
object parseString extends js.Object {
  
  def apply(str: convertableToString, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def apply(
    str: convertableToString,
    options: ParserOptions,
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
}
