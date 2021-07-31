package typings.voucherCodeGenerator

import typings.voucherCodeGenerator.voucherCodeGeneratorStrings.alphabetic
import typings.voucherCodeGenerator.voucherCodeGeneratorStrings.alphanumeric
import typings.voucherCodeGenerator.voucherCodeGeneratorStrings.numbers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("voucher-code-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def charset_alphabetic(name: alphabetic): String = ^.asInstanceOf[js.Dynamic].applyDynamic("charset")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def charset_alphanumeric(name: alphanumeric): String = ^.asInstanceOf[js.Dynamic].applyDynamic("charset")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def charset_numbers(name: numbers): String = ^.asInstanceOf[js.Dynamic].applyDynamic("charset")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def generate(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.Array[String]]
  @scala.inline
  def generate(config: generatorConfig): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait generatorConfig extends StObject {
    
    var charset: js.UndefOr[String] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var postfix: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object generatorConfig {
    
    @scala.inline
    def apply(): generatorConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[generatorConfig]
    }
    
    @scala.inline
    implicit class generatorConfigMutableBuilder[Self <: generatorConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
