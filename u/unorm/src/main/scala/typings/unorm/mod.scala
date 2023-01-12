package typings.unorm

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("unorm", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  trait Static extends StObject {
    
    def nfc(str: String): String
    
    def nfd(str: String): String
    
    def nfkc(str: String): String
    
    def nfkd(str: String): String
  }
  object Static {
    
    inline def apply(nfc: String => String, nfd: String => String, nfkc: String => String, nfkd: String => String): Static = {
      val __obj = js.Dynamic.literal(nfc = js.Any.fromFunction1(nfc), nfd = js.Any.fromFunction1(nfd), nfkc = js.Any.fromFunction1(nfkc), nfkd = js.Any.fromFunction1(nfkd))
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setNfc(value: String => String): Self = StObject.set(x, "nfc", js.Any.fromFunction1(value))
      
      inline def setNfd(value: String => String): Self = StObject.set(x, "nfd", js.Any.fromFunction1(value))
      
      inline def setNfkc(value: String => String): Self = StObject.set(x, "nfkc", js.Any.fromFunction1(value))
      
      inline def setNfkd(value: String => String): Self = StObject.set(x, "nfkd", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
