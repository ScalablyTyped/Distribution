package typings.tr46

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tr46", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toASCII(domainName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASCII")(domainName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toASCII(domainName: String, options: ToASCIIOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toASCII")(domainName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toUnicode(domainName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(domainName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toUnicode(domainName: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(domainName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      * When set to `true`, any bi-directional text within the input will be checked for validation.
      * @default false
      */
    var checkBidi: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to `true`, the positions of any hyphen characters within the input will be checked for validation.
      * @default false
      */
    var checkHyphens: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to `true`, any word joiner characters within the input will be checked for validation.
      * @default false
      */
    var checkJoiners: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to `true`, input will be validated according to [STD3 Rules](http://unicode.org/reports/tr46/#STD3_Rules).
      * @default false
      */
    var useSTD3ASCIIRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to `true`, the length of each DNS label within the input will be checked for validation.
      * @default false
      */
    var verifyDNSLength: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCheckBidi(value: Boolean): Self = StObject.set(x, "checkBidi", value.asInstanceOf[js.Any])
      
      inline def setCheckBidiUndefined: Self = StObject.set(x, "checkBidi", js.undefined)
      
      inline def setCheckHyphens(value: Boolean): Self = StObject.set(x, "checkHyphens", value.asInstanceOf[js.Any])
      
      inline def setCheckHyphensUndefined: Self = StObject.set(x, "checkHyphens", js.undefined)
      
      inline def setCheckJoiners(value: Boolean): Self = StObject.set(x, "checkJoiners", value.asInstanceOf[js.Any])
      
      inline def setCheckJoinersUndefined: Self = StObject.set(x, "checkJoiners", js.undefined)
      
      inline def setUseSTD3ASCIIRules(value: Boolean): Self = StObject.set(x, "useSTD3ASCIIRules", value.asInstanceOf[js.Any])
      
      inline def setUseSTD3ASCIIRulesUndefined: Self = StObject.set(x, "useSTD3ASCIIRules", js.undefined)
      
      inline def setVerifyDNSLength(value: Boolean): Self = StObject.set(x, "verifyDNSLength", value.asInstanceOf[js.Any])
      
      inline def setVerifyDNSLengthUndefined: Self = StObject.set(x, "verifyDNSLength", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tr46.tr46Strings.nontransitional
    - typings.tr46.tr46Strings.transitional
  */
  trait ProcessingOption extends StObject
  object ProcessingOption {
    
    inline def nontransitional: typings.tr46.tr46Strings.nontransitional = "nontransitional".asInstanceOf[typings.tr46.tr46Strings.nontransitional]
    
    inline def transitional: typings.tr46.tr46Strings.transitional = "transitional".asInstanceOf[typings.tr46.tr46Strings.transitional]
  }
  
  trait ToASCIIOptions
    extends StObject
       with Options {
    
    /**
      * When set to `"transitional"`, symbols within the input will be validated according to the older
      * IDNA2003 protocol. When set to `"nontransitional"`, the current IDNA2008 protocol will be used.
      * @default 'nontransitional'
      */
    var processingOption: js.UndefOr[ProcessingOption] = js.undefined
  }
  object ToASCIIOptions {
    
    inline def apply(): ToASCIIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToASCIIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToASCIIOptions] (val x: Self) extends AnyVal {
      
      inline def setProcessingOption(value: ProcessingOption): Self = StObject.set(x, "processingOption", value.asInstanceOf[js.Any])
      
      inline def setProcessingOptionUndefined: Self = StObject.set(x, "processingOption", js.undefined)
    }
  }
}
