package typings
package xmlpokeLib.XmlPokeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  def add(map: PathToValueMap): API = js.native
  def add(xpath: java.lang.String, value: Value): API = js.native
  def addNamespace(prefix: java.lang.String, uri: java.lang.String): API = js.native
  def clear(xpath: java.lang.String): API = js.native
  def ensure(xpath: java.lang.String): API = js.native
  def errorOnNoMatches(): API = js.native
  def remove(xpath: java.lang.String): API = js.native
  def set(map: PathToValueMap): API = js.native
  def set(xpath: java.lang.String, value: Value): API = js.native
  def setOrAdd(map: PathToValueMap): API = js.native
  def setOrAdd(xpath: java.lang.String, value: Value): API = js.native
  def withBasePath(xpath: java.lang.String): API = js.native
}

