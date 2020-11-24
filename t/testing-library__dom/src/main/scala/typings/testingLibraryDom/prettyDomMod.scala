package typings.testingLibraryDom

import typings.prettyFormat.mod.OptionsReceived
import typings.prettyFormat.typesMod.NewPlugin
import typings.std.Element
import typings.std.HTMLDocument
import typings.testingLibraryDom.testingLibraryDomBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/dom/types/pretty-dom", JSImport.Namespace)
@js.native
object prettyDomMod extends js.Object {
  
  def logDOM(): Unit = js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
  def logDOM(dom: Element): Unit = js.native
  def logDOM(dom: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def logDOM(dom: Element, maxLength: Double): Unit = js.native
  def logDOM(dom: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def logDOM(dom: HTMLDocument): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: Double): Unit = js.native
  def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
  
  def prettyDOM(): String | `false` = js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): String | `false` = js.native
  def prettyDOM(dom: Element): String | `false` = js.native
  def prettyDOM(dom: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  def prettyDOM(dom: Element, maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  
  @js.native
  object prettyFormat extends js.Object {
    
    /**
      * Returns a presentation string of your `val` object
      * @param val any potential JavaScript object
      * @param options Custom settings
      */
    def apply(`val`: js.Any): String = js.native
    def apply(`val`: js.Any, options: typings.prettyFormat.typesMod.OptionsReceived): String = js.native
    
    @js.native
    object plugins extends js.Object {
      
      var AsymmetricMatcher: NewPlugin = js.native
      
      var ConvertAnsi: NewPlugin = js.native
      
      var DOMCollection: NewPlugin = js.native
      
      var DOMElement: NewPlugin = js.native
      
      var Immutable: NewPlugin = js.native
      
      var ReactElement: NewPlugin = js.native
      
      var ReactTestComponent: NewPlugin = js.native
    }
  }
}
