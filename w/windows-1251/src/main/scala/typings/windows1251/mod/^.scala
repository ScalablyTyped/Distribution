package typings.windows1251.mod

import typings.windows1251.anon.Mode
import typings.windows1251.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("windows-1251", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def decode(text: String): String = js.native
  def decode(text: String, options: `0`): String = js.native
  
  def encode(input: String): String = js.native
  def encode(input: String, options: Mode): String = js.native
  
  var labels: js.Array[String] = js.native
  
  var version: String = js.native
}
