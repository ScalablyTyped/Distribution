package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/utils/base-path", JSImport.Namespace)
@js.native
object basePathMod extends js.Object {
  
  @js.native
  class BasePath () extends js.Object {
    
    def add(fileName: String): Unit = js.native
    
    var basePaths: js.Any = js.native
    
    def reset(): Unit = js.native
    
    def trim(fileName: String): String = js.native
  }
  /* static members */
  @js.native
  object BasePath extends js.Object {
    
    def normalize(path: String): String = js.native
  }
}
