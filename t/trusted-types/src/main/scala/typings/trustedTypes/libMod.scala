package typings.trustedTypes

import org.scalablytyped.runtime.Instantiable0
import typings.std.Extract
import typings.std.NonNullable
import typings.std.Parameters
import typings.std.Pick
import typings.trustedTypes.trustedTypesBooleans.`true`
import typings.trustedTypes.trustedTypesStrings.createHTML
import typings.trustedTypes.trustedTypesStrings.createScript
import typings.trustedTypes.trustedTypesStrings.createScriptURL
import typings.trustedTypes.trustedTypesStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("trusted-types/lib", "TrustedHTML")
  @js.native
  /* private */ open class TrustedHTML () extends StObject {
    
    // To prevent instantiting with 'new'.
    /* private */ var brand: `true` = js.native
  }
  
  @JSImport("trusted-types/lib", "TrustedScript")
  @js.native
  /* private */ open class TrustedScript () extends StObject {
    
    // To prevent instantiting with 'new'.
    /* private */ var brand: `true` = js.native
  }
  
  @JSImport("trusted-types/lib", "TrustedScriptURL")
  @js.native
  /* private */ open class TrustedScriptURL () extends StObject {
    
    // To prevent instantiting with 'new'.
    /* private */ var brand: `true` = js.native
  }
  
  /* note: abstract class */ @JSImport("trusted-types/lib", "TrustedTypePolicy")
  @js.native
  open class TrustedTypePolicy[Options /* <: TrustedTypePolicyOptions */] () extends StObject {
    
    @JSName("createHTML")
    def createHTML_createHTML(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createHTML'> is not an array type */ args: Args[Options, createHTML]
    ): TrustedHTML = js.native
    
    @JSName("createScriptURL")
    def createScriptURL_createScriptURL(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createScriptURL'> is not an array type */ args: Args[Options, createScriptURL]
    ): TrustedScriptURL = js.native
    
    @JSName("createScript")
    def createScript_createScript(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createScript'> is not an array type */ args: Args[Options, createScript]
    ): TrustedScript = js.native
    
    val name: String = js.native
  }
  
  /* note: abstract class */ @JSImport("trusted-types/lib", "TrustedTypePolicyFactory")
  @js.native
  open class TrustedTypePolicyFactory () extends StObject {
    
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
    
    def isHTML(value: Any): /* is trusted-types.trusted-types/lib.TrustedHTML */ Boolean = js.native
    
    def isScript(value: Any): /* is trusted-types.trusted-types/lib.TrustedScript */ Boolean = js.native
    
    def isScriptURL(value: Any): /* is trusted-types.trusted-types/lib.TrustedScriptURL */ Boolean = js.native
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
  
  trait TrustedTypePolicyOptions extends StObject {
    
    var createHTML: js.UndefOr[js.Function2[/* input */ String, /* repeated */ Any, String]] = js.undefined
    
    var createScript: js.UndefOr[js.Function2[/* input */ String, /* repeated */ Any, String]] = js.undefined
    
    var createScriptURL: js.UndefOr[js.Function2[/* input */ String, /* repeated */ Any, String]] = js.undefined
  }
  object TrustedTypePolicyOptions {
    
    inline def apply(): TrustedTypePolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustedTypePolicyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrustedTypePolicyOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateHTML(value: (/* input */ String, /* repeated */ Any) => String): Self = StObject.set(x, "createHTML", js.Any.fromFunction2(value))
      
      inline def setCreateHTMLUndefined: Self = StObject.set(x, "createHTML", js.undefined)
      
      inline def setCreateScript(value: (/* input */ String, /* repeated */ Any) => String): Self = StObject.set(x, "createScript", js.Any.fromFunction2(value))
      
      inline def setCreateScriptURL(value: (/* input */ String, /* repeated */ Any) => String): Self = StObject.set(x, "createScriptURL", js.Any.fromFunction2(value))
      
      inline def setCreateScriptURLUndefined: Self = StObject.set(x, "createScriptURL", js.undefined)
      
      inline def setCreateScriptUndefined: Self = StObject.set(x, "createScript", js.undefined)
    }
  }
  
  trait TrustedTypesWindow extends StObject {
    
    var TrustedHTML: Instantiable0[typings.trustedTypes.libMod.TrustedHTML]
    
    var TrustedScript: Instantiable0[typings.trustedTypes.libMod.TrustedScript]
    
    var TrustedScriptURL: Instantiable0[typings.trustedTypes.libMod.TrustedScriptURL]
    
    var TrustedTypePolicy: Instantiable0[typings.trustedTypes.libMod.TrustedTypePolicy[TrustedTypePolicyOptions]]
    
    var TrustedTypePolicyFactory: Instantiable0[typings.trustedTypes.libMod.TrustedTypePolicyFactory]
    
    // `trustedTypes` is left intentionally optional to make sure that
    // people handle the case when their code is running in a browser not
    // supporting trustedTypes.
    var trustedTypes: js.UndefOr[TrustedTypePolicyFactory] = js.undefined
  }
  object TrustedTypesWindow {
    
    inline def apply(
      TrustedHTML: Instantiable0[TrustedHTML],
      TrustedScript: Instantiable0[TrustedScript],
      TrustedScriptURL: Instantiable0[TrustedScriptURL],
      TrustedTypePolicy: Instantiable0[TrustedTypePolicy[TrustedTypePolicyOptions]],
      TrustedTypePolicyFactory: Instantiable0[TrustedTypePolicyFactory]
    ): TrustedTypesWindow = {
      val __obj = js.Dynamic.literal(TrustedHTML = TrustedHTML.asInstanceOf[js.Any], TrustedScript = TrustedScript.asInstanceOf[js.Any], TrustedScriptURL = TrustedScriptURL.asInstanceOf[js.Any], TrustedTypePolicy = TrustedTypePolicy.asInstanceOf[js.Any], TrustedTypePolicyFactory = TrustedTypePolicyFactory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrustedTypesWindow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrustedTypesWindow] (val x: Self) extends AnyVal {
      
      inline def setTrustedHTML(value: Instantiable0[TrustedHTML]): Self = StObject.set(x, "TrustedHTML", value.asInstanceOf[js.Any])
      
      inline def setTrustedScript(value: Instantiable0[TrustedScript]): Self = StObject.set(x, "TrustedScript", value.asInstanceOf[js.Any])
      
      inline def setTrustedScriptURL(value: Instantiable0[TrustedScriptURL]): Self = StObject.set(x, "TrustedScriptURL", value.asInstanceOf[js.Any])
      
      inline def setTrustedTypePolicy(value: Instantiable0[TrustedTypePolicy[TrustedTypePolicyOptions]]): Self = StObject.set(x, "TrustedTypePolicy", value.asInstanceOf[js.Any])
      
      inline def setTrustedTypePolicyFactory(value: Instantiable0[TrustedTypePolicyFactory]): Self = StObject.set(x, "TrustedTypePolicyFactory", value.asInstanceOf[js.Any])
      
      inline def setTrustedTypes(value: TrustedTypePolicyFactory): Self = StObject.set(x, "trustedTypes", value.asInstanceOf[js.Any])
      
      inline def setTrustedTypesUndefined: Self = StObject.set(x, "trustedTypes", js.undefined)
    }
  }
}
