package typings
package atXmppXmlLib.xmlMod.xmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser
  extends nodeLib.eventsMod.EventEmitter {
  val XMLError: ScalablyTyped.runtime.Instantiable0[atXmppXmlLib.xmlMod.XMLError] = js.native
  var cursor: Element | scala.Null = js.native
  val parser: ltxLib.ltxMod.Parser = js.native
  var root: Element | scala.Null = js.native
  def end(data: nodeLib.Buffer): scala.Unit = js.native
  def onEndElement(name: java.lang.String): scala.Unit = js.native
  def onStartElement(name: java.lang.String): scala.Unit = js.native
  def onStartElement(name: java.lang.String, attrs: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def onStartElement(name: java.lang.String, attrs: java.lang.String): scala.Unit = js.native
  def onText(str: java.lang.String): scala.Unit = js.native
  def write(data: nodeLib.Buffer): scala.Unit = js.native
}

