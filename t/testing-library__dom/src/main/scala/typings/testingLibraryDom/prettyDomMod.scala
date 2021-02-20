package typings.testingLibraryDom

import typings.prettyFormat.mod.OptionsReceived
import typings.prettyFormat.typesMod.NewPlugin
import typings.std.Element
import typings.std.HTMLDocument
import typings.testingLibraryDom.testingLibraryDomBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prettyDomMod {
  
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: Element): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: Double): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: Double): Unit = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "logDOM")
  @js.native
  def logDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
  
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: js.UndefOr[scala.Nothing], maxLength: Double, options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: js.UndefOr[scala.Nothing], options: OptionsReceived): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double): String | `false` = js.native
  @JSImport("@testing-library/dom/types/pretty-dom", "prettyDOM")
  @js.native
  def prettyDOM(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  
  object prettyFormat {
    
    /**
      * Returns a presentation string of your `val` object
      * @param val any potential JavaScript object
      * @param options Custom settings
      */
    @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat")
    @js.native
    def apply(`val`: js.Any): String = js.native
    @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat")
    @js.native
    def apply(`val`: js.Any, options: typings.prettyFormat.typesMod.OptionsReceived): String = js.native
    
    object plugins {
      
      @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat.plugins")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat.plugins.AsymmetricMatcher")
      @js.native
      def AsymmetricMatcher: NewPlugin = js.native
      @scala.inline
      def AsymmetricMatcher_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat.plugins.ConvertAnsi")
      @js.native
      def ConvertAnsi: NewPlugin = js.native
      @scala.inline
      def ConvertAnsi_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertAnsi")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat.plugins.DOMCollection")
      @js.native
      def DOMCollection: NewPlugin = js.native
      @scala.inline
      def DOMCollection_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat.plugins.DOMElement")
      @js.native
      def DOMElement: NewPlugin = js.native
      @scala.inline
      def DOMElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat.plugins.Immutable")
      @js.native
      def Immutable: NewPlugin = js.native
      @scala.inline
      def Immutable_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat.plugins.ReactElement")
      @js.native
      def ReactElement: NewPlugin = js.native
      @scala.inline
      def ReactElement_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
      
      @JSImport("@testing-library/dom/types/pretty-dom", "prettyFormat.plugins.ReactTestComponent")
      @js.native
      def ReactTestComponent: NewPlugin = js.native
      @scala.inline
      def ReactTestComponent_=(x: NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
    }
  }
}
