package typings.trustedTypes

import org.scalablytyped.runtime.Shortcut
import typings.std.Extract
import typings.std.NonNullable
import typings.std.Parameters
import typings.std.Pick
import typings.trustedTypes.mod.global.TrustedTypePolicyFactory
import typings.trustedTypes.mod.global.TrustedTypePolicyOptions
import typings.trustedTypes.trustedTypesBooleans.`true`
import typings.trustedTypes.trustedTypesStrings.createHTML
import typings.trustedTypes.trustedTypesStrings.createScript
import typings.trustedTypes.trustedTypesStrings.createScriptURL
import typings.trustedTypes.trustedTypesStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  // This is not available in global scope. It's only used for the export. This is
  // necessary to be able to use these types from nodejs (for SSR).
  @JSImport("trusted-types", JSImport.Default)
  @js.native
  val default: TrustedTypePolicyFactory = js.native
  
  object global {
    
    @JSGlobal("TrustedHTML")
    @js.native
    class TrustedHTML protected () extends StObject {
      
      // To prevent instantiting with 'new'.
      var brand: `true` = js.native
    }
    
    @JSGlobal("TrustedScript")
    @js.native
    class TrustedScript protected () extends StObject {
      
      // To prevent instantiting with 'new'.
      var brand: `true` = js.native
    }
    
    @JSGlobal("TrustedScriptURL")
    @js.native
    class TrustedScriptURL protected () extends StObject {
      
      // To prevent instantiting with 'new'.
      var brand: `true` = js.native
    }
    
    trait TrustedTypePolicy[Options /* <: TrustedTypePolicyOptions */] extends StObject {
      
      @JSName("createHTML")
      def createHTML_createHTML(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createHTML'> is not an array type */ args: Args[Options, createHTML]
      ): TrustedHTML
      
      @JSName("createScriptURL")
      def createScriptURL_createScriptURL(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createScriptURL'> is not an array type */ args: Args[Options, createScriptURL]
      ): TrustedScriptURL
      
      @JSName("createScript")
      def createScript_createScript(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createScript'> is not an array type */ args: Args[Options, createScript]
      ): TrustedScript
      
      val name: String
    }
    object TrustedTypePolicy {
      
      @scala.inline
      def apply[Options /* <: TrustedTypePolicyOptions */](
        createHTML: Args[Options, createHTML] => TrustedHTML,
        createScript: Args[Options, createScript] => TrustedScript,
        createScriptURL: Args[Options, createScriptURL] => TrustedScriptURL,
        name: String
      ): TrustedTypePolicy[Options] = {
        val __obj = js.Dynamic.literal(createHTML = js.Any.fromFunction1(createHTML), createScript = js.Any.fromFunction1(createScript), createScriptURL = js.Any.fromFunction1(createScriptURL), name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[TrustedTypePolicy[Options]]
      }
      
      @scala.inline
      implicit class TrustedTypePolicyMutableBuilder[Self <: TrustedTypePolicy[?], Options /* <: TrustedTypePolicyOptions */] (val x: Self & TrustedTypePolicy[Options]) extends AnyVal {
        
        @scala.inline
        def setCreateHTML(value: Args[Options, createHTML] => TrustedHTML): Self = StObject.set(x, "createHTML", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateScript(value: Args[Options, createScript] => TrustedScript): Self = StObject.set(x, "createScript", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateScriptURL(value: Args[Options, createScriptURL] => TrustedScriptURL): Self = StObject.set(x, "createScriptURL", js.Any.fromFunction1(value))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait TrustedTypePolicyFactory extends StObject {
      
      def createPolicy[Options /* <: TrustedTypePolicyOptions */](policyName: String): Pick[TrustedTypePolicy[Options], name | (Extract[/* keyof Options */ String, FnNames])] = js.native
      def createPolicy[Options /* <: TrustedTypePolicyOptions */](policyName: String, policyOptions: Options): Pick[TrustedTypePolicy[Options], name | (Extract[/* keyof Options */ String, FnNames])] = js.native
      
      val defaultPolicy: TrustedTypePolicy[TrustedTypePolicyOptions] | Null = js.native
      
      val emptyHTML: TrustedHTML = js.native
      
      val emptyScript: TrustedScript = js.native
      
      def getAttributeType(tagName: String, attribute: String): String | Null = js.native
      def getAttributeType(tagName: String, attribute: String, elementNs: String): String | Null = js.native
      def getAttributeType(tagName: String, attribute: String, elementNs: String, attrNs: String): String | Null = js.native
      def getAttributeType(tagName: String, attribute: String, elementNs: Unit, attrNs: String): String | Null = js.native
      
      def getPropertyType(tagName: String, property: String): String | Null = js.native
      def getPropertyType(tagName: String, property: String, elementNs: String): String | Null = js.native
      
      def isHTML(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedHTML */ Boolean = js.native
      
      def isScript(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedScript */ Boolean = js.native
      
      def isScriptURL(value: js.Any): /* is trusted-types.trusted-types.<global>.TrustedScriptURL */ Boolean = js.native
    }
    
    trait TrustedTypePolicyOptions extends StObject {
      
      var createHTML: js.UndefOr[js.Function2[/* input */ String, /* repeated */ js.Any, String]] = js.undefined
      
      var createScript: js.UndefOr[js.Function2[/* input */ String, /* repeated */ js.Any, String]] = js.undefined
      
      var createScriptURL: js.UndefOr[js.Function2[/* input */ String, /* repeated */ js.Any, String]] = js.undefined
    }
    object TrustedTypePolicyOptions {
      
      @scala.inline
      def apply(): TrustedTypePolicyOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TrustedTypePolicyOptions]
      }
      
      @scala.inline
      implicit class TrustedTypePolicyOptionsMutableBuilder[Self <: TrustedTypePolicyOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateHTML(value: (/* input */ String, /* repeated */ js.Any) => String): Self = StObject.set(x, "createHTML", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreateHTMLUndefined: Self = StObject.set(x, "createHTML", js.undefined)
        
        @scala.inline
        def setCreateScript(value: (/* input */ String, /* repeated */ js.Any) => String): Self = StObject.set(x, "createScript", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreateScriptURL(value: (/* input */ String, /* repeated */ js.Any) => String): Self = StObject.set(x, "createScriptURL", js.Any.fromFunction2(value))
        
        @scala.inline
        def setCreateScriptURLUndefined: Self = StObject.set(x, "createScriptURL", js.undefined)
        
        @scala.inline
        def setCreateScriptUndefined: Self = StObject.set(x, "createScript", js.undefined)
      }
    }
    
    trait Window extends StObject {
      
      var TrustedHTML: typings.trustedTypes.mod.global.TrustedHTML
      
      var TrustedScript: typings.trustedTypes.mod.global.TrustedScript
      
      var TrustedScriptURL: typings.trustedTypes.mod.global.TrustedScriptURL
      
      var TrustedTypePolicy: typings.trustedTypes.mod.global.TrustedTypePolicy[TrustedTypePolicyOptions]
      
      var TrustedTypePolicyFactory: typings.trustedTypes.mod.global.TrustedTypePolicyFactory
      
      // `trustedTypes` is left intentionally optional to make sure that
      // people handle the case when their code is running in a browser not
      // supporting trustedTypes.
      var trustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.undefined
    }
    object Window {
      
      @scala.inline
      def apply(
        TrustedHTML: TrustedHTML,
        TrustedScript: TrustedScript,
        TrustedScriptURL: TrustedScriptURL,
        TrustedTypePolicy: TrustedTypePolicy[TrustedTypePolicyOptions],
        TrustedTypePolicyFactory: TrustedTypePolicyFactory
      ): Window = {
        val __obj = js.Dynamic.literal(TrustedHTML = TrustedHTML.asInstanceOf[js.Any], TrustedScript = TrustedScript.asInstanceOf[js.Any], TrustedScriptURL = TrustedScriptURL.asInstanceOf[js.Any], TrustedTypePolicy = TrustedTypePolicy.asInstanceOf[js.Any], TrustedTypePolicyFactory = TrustedTypePolicyFactory.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTrustedHTML(value: TrustedHTML): Self = StObject.set(x, "TrustedHTML", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedScript(value: TrustedScript): Self = StObject.set(x, "TrustedScript", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedScriptURL(value: TrustedScriptURL): Self = StObject.set(x, "TrustedScriptURL", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedTypePolicy(value: TrustedTypePolicy[TrustedTypePolicyOptions]): Self = StObject.set(x, "TrustedTypePolicy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedTypePolicyFactory(value: TrustedTypePolicyFactory): Self = StObject.set(x, "TrustedTypePolicyFactory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedTypes(value: TrustedTypePolicyFactory): Self = StObject.set(x, "trustedTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrustedTypesUndefined: Self = StObject.set(x, "trustedTypes", js.undefined)
      }
    }
  }
  
  type Args[Options /* <: TrustedTypePolicyOptions */, K /* <: FnNames */] = Parameters[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options[K] */ js.Any
    ]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.trustedTypes.trustedTypesStrings.createHTML
    - typings.trustedTypes.trustedTypesStrings.createScript
    - typings.trustedTypes.trustedTypesStrings.createScriptURL
  */
  trait FnNames extends StObject
  
  type _To = TrustedTypePolicyFactory
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: TrustedTypePolicyFactory = default
}
