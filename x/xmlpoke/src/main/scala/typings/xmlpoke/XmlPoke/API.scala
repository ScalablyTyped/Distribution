package typings.xmlpoke.XmlPoke

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  def add(map: PathToValueMap): API = js.native
  def add(xpath: String, value: Value): API = js.native
  def addNamespace(prefix: String, uri: String): API = js.native
  def clear(xpath: String): API = js.native
  def ensure(xpath: String): API = js.native
  def errorOnNoMatches(): API = js.native
  def remove(xpath: String): API = js.native
  def set(map: PathToValueMap): API = js.native
  def set(xpath: String, value: Value): API = js.native
  def setOrAdd(map: PathToValueMap): API = js.native
  def setOrAdd(xpath: String, value: Value): API = js.native
  def withBasePath(xpath: String): API = js.native
}

