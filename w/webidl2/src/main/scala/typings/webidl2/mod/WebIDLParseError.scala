package typings.webidl2.mod

import typings.std.Error
import typings.webidl2.anon.BareMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webidl2", "WebIDLParseError")
@js.native
class WebIDLParseError protected ()
  extends StObject
     with Error {
  def this(options: BareMessage) = this()
  
  var bareMessage: String = js.native
  
  var context: String = js.native
  
  /** a short peek at the text at the point where the error happened */
  var input: String = js.native
  
  /** the line at which the error occurred. */
  var line: Double = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  @JSName("name")
  var name_WebIDLParseError: typings.webidl2.webidl2Strings.WebIDLParseError = js.native
  
  var sourceName: js.UndefOr[String] = js.native
  
  /** the five tokens at the point of error, as understood by the tokeniser */
  var tokens: js.Array[Token] = js.native
}
