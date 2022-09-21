package typings.utf8

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object utf8 {
    
    @JSGlobal("utf8")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(byteString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(byteString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encode(inputString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(inputString.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("utf8.version")
    @js.native
    val version: String = js.native
  }
}
