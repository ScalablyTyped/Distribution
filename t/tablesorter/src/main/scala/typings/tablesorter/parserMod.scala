package typings.tablesorter

import typings.tablesorter.parserTypeMod.ParserType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  trait Parser[TElement] extends StObject {
    
    /**
      * Formats the text of a cell.
      *
      * @param text
      * The text to format.
      *
      * @param table
      * The table which is being processed.
      *
      * @return
      * The formatted text.
      */
    def format(text: String, table: TElement): String
    
    /**
      * The id of the parser.
      */
    var id: String
    
    /**
      * Checks whether a text is applicable to the parser.
      *
      * @param text
      * The text to check.
      *
      * @returns
      * A value indicating whether the parser is applicable to the `text`.
      */
    def is(text: String): Boolean
    
    /**
      * A value indicating whether the tablesorter should use parsed text for searching.
      */
    var parsed: Boolean
    
    /**
      * The type of the parser.
      */
    var `type`: ParserType
  }
  object Parser {
    
    @scala.inline
    def apply[TElement](
      format: (String, TElement) => String,
      id: String,
      is: String => Boolean,
      parsed: Boolean,
      `type`: ParserType
    ): Parser[TElement] = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), id = id.asInstanceOf[js.Any], is = js.Any.fromFunction1(is), parsed = parsed.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parser[TElement]]
    }
    
    @scala.inline
    implicit class ParserMutableBuilder[Self <: Parser[?], TElement] (val x: Self & Parser[TElement]) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (String, TElement) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs(value: String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParsed(value: Boolean): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ParserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
