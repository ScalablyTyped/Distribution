package typings.svgBakerRuntime

import typings.svgBakerRuntime.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSymbolMod {
  
  @JSImport("svg-baker-runtime/src/symbol", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SpriteSymbol {
    def this(cfg: Content) = this()
    
    /* CompleteClass */
    var content: String = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    override def stringify(): String = js.native
    
    /* CompleteClass */
    var viewBox: String = js.native
  }
  
  trait SpriteSymbol extends StObject {
    
    var content: String
    
    def destroy(): Unit
    
    var id: String
    
    def stringify(): String
    
    var viewBox: String
  }
  object SpriteSymbol {
    
    inline def apply(content: String, destroy: () => Unit, id: String, stringify: () => String, viewBox: String): SpriteSymbol = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), id = id.asInstanceOf[js.Any], stringify = js.Any.fromFunction0(stringify), viewBox = viewBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteSymbol]
    }
    
    extension [Self <: SpriteSymbol](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStringify(value: () => String): Self = StObject.set(x, "stringify", js.Any.fromFunction0(value))
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    }
  }
}
