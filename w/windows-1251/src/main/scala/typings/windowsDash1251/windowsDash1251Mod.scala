package typings.windowsDash1251

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("windows-1251", JSImport.Namespace)
@js.native
object windowsDash1251Mod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.windowsDash1251.windowsDash1251Strings.replacement
    - typings.windowsDash1251.windowsDash1251Strings.fatal
  */
  trait DecoderMode extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.windowsDash1251.windowsDash1251Strings.fatal
    - typings.windowsDash1251.windowsDash1251Strings.html
  */
  trait EncoderMode extends js.Object
  
  @js.native
  trait windows1251 extends js.Object {
    def decode(text: String): String = js.native
    def decode(text: String, options: Anon_ModeDecoderMode): String = js.native
    def encode(input: String): String = js.native
    def encode(input: String, options: Anon_Mode): String = js.native
  }
  
  var labels: js.Array[String] = js.native
  var version: String = js.native
  def decode(text: String): String = js.native
  def decode(text: String, options: Anon_ModeDecoderMode): String = js.native
  def encode(input: String): String = js.native
  def encode(input: String, options: Anon_Mode): String = js.native
}

