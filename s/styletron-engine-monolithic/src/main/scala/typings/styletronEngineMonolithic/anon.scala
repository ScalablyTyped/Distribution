package typings.styletronEngineMonolithic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Block extends StObject {
    
    var block: String
    
    var pseudo: String
  }
  object Block {
    
    inline def apply(block: String, pseudo: String): Block = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], pseudo = pseudo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setPseudo(value: String): Self = StObject.set(x, "pseudo", value.asInstanceOf[js.Any])
    }
  }
}
