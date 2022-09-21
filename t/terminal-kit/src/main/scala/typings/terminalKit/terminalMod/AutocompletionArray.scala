package typings.terminalKit.terminalMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("terminal-kit/Terminal", "AutocompletionArray")
@js.native
open class AutocompletionArray[T] ()
  extends StObject
     with Array[T] {
  
  var postfix: js.UndefOr[String] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
