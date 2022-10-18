package typings.sucrase

import typings.sucrase.distTypesParserTokenizerMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNameManagerMod {
  
  @JSImport("sucrase/dist/types/NameManager", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with NameManager {
    def this(code: String, tokens: js.Array[Token]) = this()
    
    /* CompleteClass */
    override def claimFreeName(name: String): String = js.native
    
    /* CompleteClass */
    override def findFreeName(name: String): String = js.native
    
    /* private */ /* CompleteClass */
    override val usedNames: Any = js.native
  }
  
  trait NameManager extends StObject {
    
    def claimFreeName(name: String): String
    
    def findFreeName(name: String): String
    
    /* private */ val usedNames: Any
  }
  object NameManager {
    
    inline def apply(claimFreeName: String => String, findFreeName: String => String, usedNames: Any): NameManager = {
      val __obj = js.Dynamic.literal(claimFreeName = js.Any.fromFunction1(claimFreeName), findFreeName = js.Any.fromFunction1(findFreeName), usedNames = usedNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameManager]
    }
    
    extension [Self <: NameManager](x: Self) {
      
      inline def setClaimFreeName(value: String => String): Self = StObject.set(x, "claimFreeName", js.Any.fromFunction1(value))
      
      inline def setFindFreeName(value: String => String): Self = StObject.set(x, "findFreeName", js.Any.fromFunction1(value))
      
      inline def setUsedNames(value: Any): Self = StObject.set(x, "usedNames", value.asInstanceOf[js.Any])
    }
  }
}
