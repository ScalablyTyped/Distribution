package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersTransformerMod {
  
  /* note: abstract class */ @JSImport("sucrase/dist/types/transformers/Transformer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Transformer {
    
    /* CompleteClass */
    override def getHoistedCode(): String = js.native
    
    /* CompleteClass */
    override def getPrefixCode(): String = js.native
    
    /* CompleteClass */
    override def getSuffixCode(): String = js.native
    
    /* CompleteClass */
    override def process(): Boolean = js.native
  }
  
  trait Transformer extends StObject {
    
    def getHoistedCode(): String
    
    def getPrefixCode(): String
    
    def getSuffixCode(): String
    
    def process(): Boolean
  }
  object Transformer {
    
    inline def apply(
      getHoistedCode: () => String,
      getPrefixCode: () => String,
      getSuffixCode: () => String,
      process: () => Boolean
    ): Transformer = {
      val __obj = js.Dynamic.literal(getHoistedCode = js.Any.fromFunction0(getHoistedCode), getPrefixCode = js.Any.fromFunction0(getPrefixCode), getSuffixCode = js.Any.fromFunction0(getSuffixCode), process = js.Any.fromFunction0(process))
      __obj.asInstanceOf[Transformer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transformer] (val x: Self) extends AnyVal {
      
      inline def setGetHoistedCode(value: () => String): Self = StObject.set(x, "getHoistedCode", js.Any.fromFunction0(value))
      
      inline def setGetPrefixCode(value: () => String): Self = StObject.set(x, "getPrefixCode", js.Any.fromFunction0(value))
      
      inline def setGetSuffixCode(value: () => String): Self = StObject.set(x, "getSuffixCode", js.Any.fromFunction0(value))
      
      inline def setProcess(value: () => Boolean): Self = StObject.set(x, "process", js.Any.fromFunction0(value))
    }
  }
}
