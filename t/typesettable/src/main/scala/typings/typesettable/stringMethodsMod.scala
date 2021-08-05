package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMethodsMod {
  
  @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods")
  @js.native
  class StringMethods () extends StObject
  /* static members */
  object StringMethods {
    
    @JSImport("typesettable/build/src/utils/stringMethods", "StringMethods")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Treat all sequences of consecutive spaces as a single " ".
      */
    inline def combineWhitespace(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("combineWhitespace")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isNotEmptyString(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyString")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def trimEnd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trimEnd(str: String, c: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def trimStart(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trimStart(str: String, splitter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any], splitter.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
