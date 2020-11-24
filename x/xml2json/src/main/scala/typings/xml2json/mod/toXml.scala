package typings.xml2json.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xml2json", "toXml")
@js.native
object toXml extends js.Object {
  
  def apply(json: String): String = js.native
  def apply(json: String, options: XmlOptions): String = js.native
  def apply(json: StringDictionary[js.Any]): String = js.native
  def apply(json: StringDictionary[js.Any], options: XmlOptions): String = js.native
  def apply(json: Buffer): String = js.native
  def apply(json: Buffer, options: XmlOptions): String = js.native
}
