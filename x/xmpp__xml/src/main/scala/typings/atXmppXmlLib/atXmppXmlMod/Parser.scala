package typings
package atXmppXmlLib.atXmppXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/xml", "Parser")
@js.native
class Parser ()
  extends nodeLib.eventsMod.EventEmitter {
  val XMLError: org.scalablytyped.runtime.Instantiable0[XMLError] = js.native
  var cursor: Element | scala.Null = js.native
  val parser: ltxLib.ltxMod.Parser = js.native
  var root: Element | scala.Null = js.native
  def end(data: nodeLib.Buffer): scala.Unit = js.native
  def onEndElement(name: java.lang.String): scala.Unit = js.native
  def onStartElement(name: java.lang.String): scala.Unit = js.native
  def onStartElement(name: java.lang.String, attrs: java.lang.String): scala.Unit = js.native
  def onStartElement(name: java.lang.String, attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def onText(str: java.lang.String): scala.Unit = js.native
  def write(data: nodeLib.Buffer): scala.Unit = js.native
}

