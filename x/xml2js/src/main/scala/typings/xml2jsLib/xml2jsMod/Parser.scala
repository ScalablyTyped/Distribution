package typings
package xml2jsLib.xml2jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml2js", "Parser")
@js.native
class Parser ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: OptionsV2) = this()
  def parseString(str: convertableToString): scala.Unit = js.native
  def parseString(str: convertableToString, cb: js.Function): scala.Unit = js.native
  def reset(): scala.Unit = js.native
}

