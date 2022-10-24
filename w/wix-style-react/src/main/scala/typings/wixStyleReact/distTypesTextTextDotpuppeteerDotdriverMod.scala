package typings.wixStyleReact

import typings.puppeteer.mod.ElementHandle
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextTextDotpuppeteerDotdriverMod {
  
  trait TextPuppeteerDriver extends StObject {
    
    def element(): ElementHandle[Element]
    
    def getValue(): js.Promise[String]
  }
  object TextPuppeteerDriver {
    
    inline def apply(element: () => ElementHandle[Element], getValue: () => js.Promise[String]): TextPuppeteerDriver = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[TextPuppeteerDriver]
    }
    
    extension [Self <: TextPuppeteerDriver](x: Self) {
      
      inline def setElement(value: () => ElementHandle[Element]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => js.Promise[String]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
}
