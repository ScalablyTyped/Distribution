package typings.tabbable

import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tabbable", JSImport.Namespace)
  @js.native
  def apply(el: Document): js.Array[HTMLElement] = js.native
  @JSImport("tabbable", JSImport.Namespace)
  @js.native
  def apply(el: Document, options: Options): js.Array[HTMLElement] = js.native
  @JSImport("tabbable", JSImport.Namespace)
  @js.native
  def apply(el: Element): js.Array[HTMLElement] = js.native
  @JSImport("tabbable", JSImport.Namespace)
  @js.native
  def apply(el: Element, options: Options): js.Array[HTMLElement] = js.native
  
  @JSImport("tabbable", "isFocusable")
  @js.native
  def isFocusable(el: HTMLElement): Boolean = js.native
  
  @JSImport("tabbable", "isTabbable")
  @js.native
  def isTabbable(el: HTMLElement): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    var includeContainer: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeContainer(value: Boolean): Self = StObject.set(x, "includeContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeContainerUndefined: Self = StObject.set(x, "includeContainer", js.undefined)
    }
  }
}
