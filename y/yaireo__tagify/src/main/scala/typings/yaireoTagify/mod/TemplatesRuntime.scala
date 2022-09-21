package typings.yaireoTagify.mod

import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.yaireoTagify.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Render functions for the template feature at runtime.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
@js.native
trait TemplatesRuntime[T /* <: BaseTagData */] extends StObject {
  
  /**
    * This callback is called when the dropdown menu is about to be shown.
    * It receives the current settings and should return the HTML for the
    * dropdown menu container.
    */
  def dropdown(settings: TagifyRuntimeSettings[T]): String = js.native
  
  /**
    * This callback is called to prepend the {@link dropdownHeader} template and
    * append {@link dropdownFooter} template to the generated HTML string of the
    * list of dropdown items.
    */
  def dropdownContent(htmlContent: String): String = js.native
  
  /**
    * Template for a footer that is rendered beneath the list of dropdown items.
    */
  def dropdownFooter(suggestions: js.Array[T]): String = js.native
  
  /**
    * Template for a header that is rendered above the list of dropdown items.
    */
  def dropdownHeader(suggestions: js.Array[T]): String = js.native
  
  /**
    * This callback is called once for each item in the dropdown list. It
    * is given an item and should return the HTML markup for that item.
    */
  def dropdownItem(item: T): String = js.native
  
  /**
    * Callback invoked when no matching dropdown item was found. If there
    * is no match for the typed text, a special dropdown item will be
    * rendered using the value returned by this callback.
    */
  var dropdownItemNoMatch: (js.ThisFunction1[/* this */ Tagify[T], /* data */ Value, String]) | Null = js.native
  
  /**
    * Template for the rendered tags.
    */
  def tag(tagData: T, tagify: Tagify[T]): String = js.native
  
  /**
    * Template for wrapper element for the tags.
    */
  def wrapper(input: HTMLInputElement, settings: TagifyRuntimeSettings[T]): String = js.native
  def wrapper(input: HTMLTextAreaElement, settings: TagifyRuntimeSettings[T]): String = js.native
}
