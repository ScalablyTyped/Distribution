package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsedDataMod {
  
  trait ParsedData extends StObject {
    
    /**
      * The jQuery-objects containing the cells of the rows.
      */
    @JSName("$cells")
    var $cells: js.Array[JQuery[HTMLElement]]
    
    /**
      * The parsed values of the rows.
      */
    var parsed: js.Array[js.Any]
    
    /**
      * The raw values of the rows.
      */
    var raw: js.Array[String]
  }
  object ParsedData {
    
    @scala.inline
    def apply($cells: js.Array[JQuery[HTMLElement]], parsed: js.Array[js.Any], raw: js.Array[String]): ParsedData = {
      val __obj = js.Dynamic.literal($cells = $cells.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedData]
    }
    
    @scala.inline
    implicit class ParsedDataMutableBuilder[Self <: ParsedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$cells(value: js.Array[JQuery[HTMLElement]]): Self = StObject.set(x, "$cells", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$cellsVarargs(value: JQuery[HTMLElement]*): Self = StObject.set(x, "$cells", js.Array(value :_*))
      
      @scala.inline
      def setParsed(value: js.Array[js.Any]): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedVarargs(value: js.Any*): Self = StObject.set(x, "parsed", js.Array(value :_*))
      
      @scala.inline
      def setRaw(value: js.Array[String]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawVarargs(value: String*): Self = StObject.set(x, "raw", js.Array(value :_*))
    }
  }
}
