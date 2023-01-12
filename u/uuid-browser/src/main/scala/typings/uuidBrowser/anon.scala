package typings.uuidBrowser

import typings.uuidBrowser.interfacesMod.InputBuffer
import typings.uuidBrowser.interfacesMod.V4Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Random
    extends StObject
       with V4Options {
    
    var random: InputBuffer
  }
  object Random {
    
    inline def apply(random: InputBuffer): Random = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
      __obj.asInstanceOf[Random]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Random] (val x: Self) extends AnyVal {
      
      inline def setRandom(value: InputBuffer): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rng
    extends StObject
       with V4Options {
    
    def rng(): InputBuffer
  }
  object Rng {
    
    inline def apply(rng: () => InputBuffer): Rng = {
      val __obj = js.Dynamic.literal(rng = js.Any.fromFunction0(rng))
      __obj.asInstanceOf[Rng]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rng] (val x: Self) extends AnyVal {
      
      inline def setRng(value: () => InputBuffer): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
    }
  }
}
