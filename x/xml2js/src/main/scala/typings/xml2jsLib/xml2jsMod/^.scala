package typings
package xml2jsLib.xml2jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml2js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val defaults: xml2jsLib.Anon_01 = js.native
  def parseString(
    xml: convertableToString,
    callback: js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def parseString(
    xml: convertableToString,
    options: OptionsV2,
    callback: js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

