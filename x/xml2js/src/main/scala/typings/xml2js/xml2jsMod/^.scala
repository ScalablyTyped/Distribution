package typings.xml2js.xml2jsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml2js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parseString(xml: convertableToString, callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def parseString(
    xml: convertableToString,
    options: OptionsV2,
    callback: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
}

