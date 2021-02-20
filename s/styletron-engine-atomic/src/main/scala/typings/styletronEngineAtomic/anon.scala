package typings.styletronEngineAtomic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Block extends StObject {
    
    var block: String = js.native
    
    var pseudo: String = js.native
  }
  object Block {
    
    @scala.inline
    def apply(block: String, pseudo: String): Block = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], pseudo = pseudo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPseudo(value: String): Self = StObject.set(x, "pseudo", value.asInstanceOf[js.Any])
    }
  }
}
