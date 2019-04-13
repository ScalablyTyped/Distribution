package typings
package xml2jsLib.xml2jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml2js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parseString(
    xml: convertableToString,
    callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def parseString(
    xml: convertableToString,
    options: OptionsV2,
    callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

