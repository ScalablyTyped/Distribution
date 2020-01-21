package typings.xmppXml.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/xml", "Parser")
@js.native
class Parser () extends EventEmitter {
  val XMLError: Instantiable0[typings.xmppXml.mod.XMLError] = js.native
  var cursor: Element | Null = js.native
  val parser: typings.ltx.mod.Parser = js.native
  var root: Element | Null = js.native
  def end(data: Buffer): Unit = js.native
  def onEndElement(name: String): Unit = js.native
  def onStartElement(name: String): Unit = js.native
  def onStartElement(name: String, attrs: String): Unit = js.native
  def onStartElement(name: String, attrs: StringDictionary[js.Any]): Unit = js.native
  def onText(str: String): Unit = js.native
  def write(data: Buffer): Unit = js.native
}

