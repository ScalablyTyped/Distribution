package typings.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenizerMod {
  
  @JSImport("typesettable/build/src/utils/tokenizer", "Tokenizer")
  @js.native
  class Tokenizer () extends StObject {
    
    var WhitespaceRegExp: js.Any = js.native
    
    var WordDividerRegExp: js.Any = js.native
    
    /* private */ def shouldCreateNewToken(token: js.Any, newCharacter: js.Any): js.Any = js.native
    
    def tokenize(line: String): js.Array[String] = js.native
  }
}
