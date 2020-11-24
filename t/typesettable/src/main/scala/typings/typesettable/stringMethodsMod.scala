package typings.typesettable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/utils/stringMethods", JSImport.Namespace)
@js.native
object stringMethodsMod extends js.Object {
  
  @js.native
  class StringMethods () extends js.Object
  /* static members */
  @js.native
  object StringMethods extends js.Object {
    
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    def combineWhitespace(str: String): String = js.native
    
    def isNotEmptyString(str: String): Boolean = js.native
    
    def trimEnd(str: String): String = js.native
    def trimEnd(str: String, c: String): String = js.native
    
    def trimStart(str: String): String = js.native
    def trimStart(str: String, splitter: String): String = js.native
  }
}
