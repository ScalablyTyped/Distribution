package typings.wdioRepl

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wdio/repl/build/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  val INTRO_MESSAGE: /* "\nThe execution has stopped!\nYou can now go into the browser or use the command line as REPL\n(To exit, press ^C again or type .exit)\n" */ String = js.native
  
  @js.native
  object DEFAULT_CONFIG extends js.Object {
    
    var commandTimeout: Double = js.native
    
    var prompt: String = js.native
    
    var useColor: Boolean = js.native
    
    var useGlobal: Boolean = js.native
  }
  
  @js.native
  object STATIC_RETURNS extends /* type */ StringDictionary[String]
}
