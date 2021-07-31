package typings.yargs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yerrorMod {
  
  @JSImport("yargs/build/lib/yerror", "YError")
  @js.native
  class YError ()
    extends StObject
       with Error {
    def this(msg: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
