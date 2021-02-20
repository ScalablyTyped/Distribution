package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilStringUtilsMod {
  
  @JSImport("typeorm/util/StringUtils", "abbreviate")
  @js.native
  def abbreviate(str: String): String = js.native
  @JSImport("typeorm/util/StringUtils", "abbreviate")
  @js.native
  def abbreviate(str: String, abbrLettersCount: Double): String = js.native
  
  @JSImport("typeorm/util/StringUtils", "camelCase")
  @js.native
  def camelCase(str: String): String = js.native
  @JSImport("typeorm/util/StringUtils", "camelCase")
  @js.native
  def camelCase(str: String, firstCapital: Boolean): String = js.native
  
  @JSImport("typeorm/util/StringUtils", "hash")
  @js.native
  def hash(input: String): String = js.native
  @JSImport("typeorm/util/StringUtils", "hash")
  @js.native
  def hash(input: String, options: IHashOptions): String = js.native
  
  @JSImport("typeorm/util/StringUtils", "shorten")
  @js.native
  def shorten(input: String): String = js.native
  @JSImport("typeorm/util/StringUtils", "shorten")
  @js.native
  def shorten(input: String, options: IShortenOptions): String = js.native
  
  @JSImport("typeorm/util/StringUtils", "snakeCase")
  @js.native
  def snakeCase(str: String): String = js.native
  
  @JSImport("typeorm/util/StringUtils", "titleCase")
  @js.native
  def titleCase(str: String): String = js.native
  
  @js.native
  trait IHashOptions extends StObject {
    
    var length: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait IShortenOptions extends StObject {
    
    /** Maximum length of any "segment" */
    var segmentLength: js.UndefOr[Double] = js.native
    
    /** String used to split "segments" of the alias/column name */
    var separator: js.UndefOr[String] = js.native
    
    /** Length of any "term" in a "segment"; "OrderItem" is a segment, "Order" and "Items" are terms */
    var termLength: js.UndefOr[Double] = js.native
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
