package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMethodsMod {
  
  @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods")
  @js.native
  class StringMethods () extends StObject
  /* static members */
  object StringMethods {
    
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods.combineWhitespace")
    @js.native
    def combineWhitespace(str: String): String = js.native
    
    @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods.isNotEmptyString")
    @js.native
    def isNotEmptyString(str: String): Boolean = js.native
    
    @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods.trimEnd")
    @js.native
    def trimEnd(str: String): String = js.native
    @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods.trimEnd")
    @js.native
    def trimEnd(str: String, c: String): String = js.native
    
    @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods.trimStart")
    @js.native
    def trimStart(str: String): String = js.native
    @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods.trimStart")
    @js.native
    def trimStart(str: String, splitter: String): String = js.native
  }
}
