package typings.tabbable

import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(el: Document): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def apply(el: Document, options: Options): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def apply(el: Element): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  @scala.inline
  def apply(el: Element, options: Options): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].apply(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  @JSImport("tabbable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isFocusable(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusable")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTabbable(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTabbable")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var includeContainer: js.UndefOr[Boolean] = js.undefined
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
