package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @JSImport("@wordpress/customize-browser/Element", "Element")
  @js.native
  open class Element protected () extends Value[String] {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    var element: JQuery[HTMLElement] = js.native
    
    var events: String = js.native
    
    def find(selector: Any): JQuery[HTMLElement] = js.native
    
    def initialize(element: JQuery[HTMLElement]): Unit = js.native
    def initialize(element: JQuery[HTMLElement], options: js.Object): Unit = js.native
    
    def refresh(): Unit = js.native
    
    def update(): Unit = js.native
    def update(to: String): Unit = js.native
    def update(to: JQuery[HTMLElement]): Unit = js.native
  }
  /* static members */
  object Element {
    
    @JSImport("@wordpress/customize-browser/Element", "Element")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/customize-browser/Element", "Element.synchronizer")
    @js.native
    def synchronizer: ElementSynchronizer = js.native
    inline def synchronizer_=(x: ElementSynchronizer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("synchronizer")(x.asInstanceOf[js.Any])
  }
  
  trait ElementSynchronizer extends StObject {
    
    var checkbox: ElementSynchronizerMethod[Boolean]
    
    var html: ElementSynchronizerMethod[String]
    
    var radio: ElementSynchronizerMethod[Boolean]
    
    var `val`: ElementSynchronizerMethod[String]
  }
  object ElementSynchronizer {
    
    inline def apply(
      checkbox: ElementSynchronizerMethod[Boolean],
      html: ElementSynchronizerMethod[String],
      radio: ElementSynchronizerMethod[Boolean],
      `val`: ElementSynchronizerMethod[String]
    ): ElementSynchronizer = {
      val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementSynchronizer]
    }
    
    extension [Self <: ElementSynchronizer](x: Self) {
      
      inline def setCheckbox(value: ElementSynchronizerMethod[Boolean]): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: ElementSynchronizerMethod[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setRadio(value: ElementSynchronizerMethod[Boolean]): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
      
      inline def setVal(value: ElementSynchronizerMethod[String]): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ElementSynchronizerMethod[T] extends StObject {
    
    def refresh(): T = js.native
    
    def update(to: T): Unit = js.native
    def update(to: js.ThisFunction2[/* this */ HTMLElement, /* index */ Double, /* value */ T, T]): Unit = js.native
  }
}
