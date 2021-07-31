package typings.webcomponentsJs

import org.scalablytyped.runtime.Instantiable0
import typings.std.DocumentFragment
import typings.std.HTMLElement
import typings.webcomponentsJs.mod.global.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait CustomElementConstructor
    extends StObject
       with Instantiable0[HTMLElement]
  
  trait CustomElementInit extends StObject {
    
    var `extends`: js.UndefOr[String] = js.undefined
  }
  object CustomElementInit {
    
    @scala.inline
    def apply(): CustomElementInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomElementInit]
    }
    
    @scala.inline
    implicit class CustomElementInitMutableBuilder[Self <: CustomElementInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    }
  }
  
  trait CustomElementsPolyfill extends StObject {
    
    var flags: js.Any
    
    var hasNative: Boolean
    
    var ready: Boolean
    
    var useNative: Boolean
  }
  object CustomElementsPolyfill {
    
    @scala.inline
    def apply(flags: js.Any, hasNative: Boolean, ready: Boolean, useNative: Boolean): CustomElementsPolyfill = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], hasNative = hasNative.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], useNative = useNative.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomElementsPolyfill]
    }
    
    @scala.inline
    implicit class CustomElementsPolyfillMutableBuilder[Self <: CustomElementsPolyfill] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: js.Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasNative(value: Boolean): Self = StObject.set(x, "hasNative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTMLImportsPolyfill extends StObject {
    
    var IMPORT_LINK_TYPE: String
    
    var flags: js.Any
    
    var isIE: Boolean
    
    var ready: Boolean
    
    var rootDocument: Document
    
    var useNative: Boolean
    
    def whenReady(callback: js.Function0[Unit]): Unit
  }
  object HTMLImportsPolyfill {
    
    @scala.inline
    def apply(
      IMPORT_LINK_TYPE: String,
      flags: js.Any,
      isIE: Boolean,
      ready: Boolean,
      rootDocument: Document,
      useNative: Boolean,
      whenReady: js.Function0[Unit] => Unit
    ): HTMLImportsPolyfill = {
      val __obj = js.Dynamic.literal(IMPORT_LINK_TYPE = IMPORT_LINK_TYPE.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], isIE = isIE.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], rootDocument = rootDocument.asInstanceOf[js.Any], useNative = useNative.asInstanceOf[js.Any], whenReady = js.Any.fromFunction1(whenReady))
      __obj.asInstanceOf[HTMLImportsPolyfill]
    }
    
    @scala.inline
    implicit class HTMLImportsPolyfillMutableBuilder[Self <: HTMLImportsPolyfill] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: js.Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIMPORT_LINK_TYPE(value: String): Self = StObject.set(x, "IMPORT_LINK_TYPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsIE(value: Boolean): Self = StObject.set(x, "isIE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDocument(value: Document): Self = StObject.set(x, "rootDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhenReady(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "whenReady", js.Any.fromFunction1(value))
    }
  }
  
  trait Polyfill extends StObject {
    
    var flags: js.Any
  }
  object Polyfill {
    
    @scala.inline
    def apply(flags: js.Any): Polyfill = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polyfill]
    }
    
    @scala.inline
    implicit class PolyfillMutableBuilder[Self <: Polyfill] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: js.Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    @js.native
    trait CustomElementRegistry extends StObject {
      
      def define(name: String, constructor: js.Function): Unit = js.native
      def define(name: String, constructor: js.Function, options: ElementDefinitionOptions): Unit = js.native
      
      def get(name: String): js.Any = js.native
      
      def whenDefined(name: String): js.Thenable[Unit] = js.native
    }
    
    trait Document extends StObject {
      
      def registerElement(name: String, prototype: CustomElementInit): CustomElementConstructor
    }
    object Document {
      
      @scala.inline
      def apply(registerElement: (String, CustomElementInit) => CustomElementConstructor): Document = {
        val __obj = js.Dynamic.literal(registerElement = js.Any.fromFunction2(registerElement))
        __obj.asInstanceOf[Document]
      }
      
      @scala.inline
      implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRegisterElement(value: (String, CustomElementInit) => CustomElementConstructor): Self = StObject.set(x, "registerElement", js.Any.fromFunction2(value))
      }
    }
    
    trait Element extends StObject {
      
      def createShadowRoot(): ShadowRoot
      
      val shadowRoot: ShadowRoot | Null
    }
    object Element {
      
      @scala.inline
      def apply(createShadowRoot: () => ShadowRoot): Element = {
        val __obj = js.Dynamic.literal(createShadowRoot = js.Any.fromFunction0(createShadowRoot), shadowRoot = null)
        __obj.asInstanceOf[Element]
      }
      
      @scala.inline
      implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateShadowRoot(value: () => ShadowRoot): Self = StObject.set(x, "createShadowRoot", js.Any.fromFunction0(value))
        
        @scala.inline
        def setShadowRoot(value: ShadowRoot): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShadowRootNull: Self = StObject.set(x, "shadowRoot", null)
      }
    }
    
    // This contains duplicates of some types in lib.dom.d.ts in order to support typescript 2.0
    trait ElementDefinitionOptions extends StObject {
      
      var `extends`: js.UndefOr[String] = js.undefined
    }
    object ElementDefinitionOptions {
      
      @scala.inline
      def apply(): ElementDefinitionOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ElementDefinitionOptions]
      }
      
      @scala.inline
      implicit class ElementDefinitionOptionsMutableBuilder[Self <: ElementDefinitionOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      }
    }
    
    @js.native
    trait ShadowRoot
      extends StObject
         with DocumentFragment {
      
      val host: Element = js.native
      
      var innerHTML: String = js.native
    }
    
    trait Window extends StObject {
      
      var CustomElements: CustomElementsPolyfill
      
      var HTMLImports: HTMLImportsPolyfill
      
      var WebComponents: Polyfill
      
      var customElements: CustomElementRegistry
    }
    object Window {
      
      @scala.inline
      def apply(
        CustomElements: CustomElementsPolyfill,
        HTMLImports: HTMLImportsPolyfill,
        WebComponents: Polyfill,
        customElements: CustomElementRegistry
      ): Window = {
        val __obj = js.Dynamic.literal(CustomElements = CustomElements.asInstanceOf[js.Any], HTMLImports = HTMLImports.asInstanceOf[js.Any], WebComponents = WebComponents.asInstanceOf[js.Any], customElements = customElements.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCustomElements(value: CustomElementsPolyfill): Self = StObject.set(x, "CustomElements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHTMLImports(value: HTMLImportsPolyfill): Self = StObject.set(x, "HTMLImports", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebComponents(value: Polyfill): Self = StObject.set(x, "WebComponents", value.asInstanceOf[js.Any])
      }
    }
  }
}
