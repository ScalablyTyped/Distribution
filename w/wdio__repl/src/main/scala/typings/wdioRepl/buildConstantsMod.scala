package typings.wdioRepl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConstantsMod {
  
  object DEFAULT_CONFIG {
    
    @JSImport("@wdio/repl/build/constants", "DEFAULT_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/repl/build/constants", "DEFAULT_CONFIG.commandTimeout")
    @js.native
    def commandTimeout: Double = js.native
    inline def commandTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commandTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/repl/build/constants", "DEFAULT_CONFIG.prompt")
    @js.native
    def prompt: String = js.native
    inline def prompt_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prompt")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/repl/build/constants", "DEFAULT_CONFIG.useColor")
    @js.native
    def useColor: Boolean = js.native
    inline def useColor_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/repl/build/constants", "DEFAULT_CONFIG.useGlobal")
    @js.native
    def useGlobal: Boolean = js.native
    inline def useGlobal_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useGlobal")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wdio/repl/build/constants", "INTRO_MESSAGE")
  @js.native
  val INTRO_MESSAGE: /* "\nThe execution has stopped!\nYou can now go into the browser or use the command line as REPL\n(To exit, press ^C again or type .exit)\n" */ String = js.native
}
