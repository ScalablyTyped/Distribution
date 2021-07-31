package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilStringUtilsMod {
  
  @JSImport("typeorm/util/StringUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def abbreviate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("abbreviate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def abbreviate(str: String, abbrLettersCount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("abbreviate")(str.asInstanceOf[js.Any], abbrLettersCount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def camelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def camelCase(str: String, firstCapital: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any], firstCapital.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hash(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hash(input: String, options: IHashOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def shorten(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shorten")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def shorten(input: String, options: IShortenOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("shorten")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def snakeCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("snakeCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def titleCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IHashOptions extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
  }
  object IHashOptions {
    
    @scala.inline
    def apply(): IHashOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHashOptions]
    }
    
    @scala.inline
    implicit class IHashOptionsMutableBuilder[Self <: IHashOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  trait IShortenOptions extends StObject {
    
    /** Maximum length of any "segment" */
    var segmentLength: js.UndefOr[Double] = js.undefined
    
    /** String used to split "segments" of the alias/column name */
    var separator: js.UndefOr[String] = js.undefined
    
    /** Length of any "term" in a "segment"; "OrderItem" is a segment, "Order" and "Items" are terms */
    var termLength: js.UndefOr[Double] = js.undefined
  }
  object IShortenOptions {
    
    @scala.inline
    def apply(): IShortenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShortenOptions]
    }
    
    @scala.inline
    implicit class IShortenOptionsMutableBuilder[Self <: IShortenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSegmentLength(value: Double): Self = StObject.set(x, "segmentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentLengthUndefined: Self = StObject.set(x, "segmentLength", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTermLength(value: Double): Self = StObject.set(x, "termLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermLengthUndefined: Self = StObject.set(x, "termLength", js.undefined)
    }
  }
}
