package typings.validDataUrl

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object validDataUrl {
    
    inline def apply(candidate: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(candidate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("validDataUrl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("validDataUrl.regex")
    @js.native
    def regex: RegExp = js.native
    inline def regex_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regex")(x.asInstanceOf[js.Any])
  }
}
