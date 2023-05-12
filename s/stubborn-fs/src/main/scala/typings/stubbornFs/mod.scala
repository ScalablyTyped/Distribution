package typings.stubbornFs

import typings.stubbornFs.anon.Chmod
import typings.stubbornFs.anon.Close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("stubborn-fs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("stubborn-fs", "default.attempt")
    @js.native
    def attempt: Chmod = js.native
    inline def attempt_=(x: Chmod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attempt")(x.asInstanceOf[js.Any])
    
    @JSImport("stubborn-fs", "default.retry")
    @js.native
    def retry: Close = js.native
    inline def retry_=(x: Close): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("retry")(x.asInstanceOf[js.Any])
  }
}
