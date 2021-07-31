package typings.word

import typings.word.wordStrings.c
import typings.word.wordStrings.r
import typings.word.wordStrings.s
import typings.word.wordStrings.t
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait WJSDoc extends StObject {
    
    var p: js.Array[WJSPara]
  }
  object WJSDoc {
    
    @scala.inline
    def apply(p: js.Array[WJSPara]): WJSDoc = {
      val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
      __obj.asInstanceOf[WJSDoc]
    }
    
    @scala.inline
    implicit class WJSDocMutableBuilder[Self <: WJSDoc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setP(value: js.Array[WJSPara]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPVarargs(value: WJSPara*): Self = StObject.set(x, "p", js.Array(value :_*))
    }
  }
  
  trait WJSPara extends StObject {
    
    /** Children */
    var elts: js.Array[WJSParaElement]
  }
  object WJSPara {
    
    @scala.inline
    def apply(elts: js.Array[WJSParaElement]): WJSPara = {
      val __obj = js.Dynamic.literal(elts = elts.asInstanceOf[js.Any])
      __obj.asInstanceOf[WJSPara]
    }
    
    @scala.inline
    implicit class WJSParaMutableBuilder[Self <: WJSPara] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElts(value: js.Array[WJSParaElement]): Self = StObject.set(x, "elts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEltsVarargs(value: WJSParaElement*): Self = StObject.set(x, "elts", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.word.typesMod.WJSTextRun
    - typings.word.typesMod.WJSTable
  */
  trait WJSParaElement extends StObject
  object WJSParaElement {
    
    @scala.inline
    def WJSTable(r: js.Array[WJSTableRow]): typings.word.typesMod.WJSTable = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = "t")
      __obj.asInstanceOf[typings.word.typesMod.WJSTable]
    }
    
    @scala.inline
    def WJSTextRun(v: String): typings.word.typesMod.WJSTextRun = {
      val __obj = js.Dynamic.literal(t = "s", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.word.typesMod.WJSTextRun]
    }
  }
  
  trait WJSTable
    extends StObject
       with WJSParaElement {
    
    /** Rows */
    var r: js.Array[WJSTableRow]
    
    var t: typings.word.wordStrings.t
  }
  object WJSTable {
    
    @scala.inline
    def apply(r: js.Array[WJSTableRow]): WJSTable = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = "t")
      __obj.asInstanceOf[WJSTable]
    }
    
    @scala.inline
    implicit class WJSTableMutableBuilder[Self <: WJSTable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: js.Array[WJSTableRow]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRVarargs(value: WJSTableRow*): Self = StObject.set(x, "r", js.Array(value :_*))
      
      @scala.inline
      def setT(value: t): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait WJSTableCell extends StObject {
    
    /** Body */
    var p: js.Array[WJSPara]
    
    var t: c
  }
  object WJSTableCell {
    
    @scala.inline
    def apply(p: js.Array[WJSPara]): WJSTableCell = {
      val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], t = "c")
      __obj.asInstanceOf[WJSTableCell]
    }
    
    @scala.inline
    implicit class WJSTableCellMutableBuilder[Self <: WJSTableCell] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setP(value: js.Array[WJSPara]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPVarargs(value: WJSPara*): Self = StObject.set(x, "p", js.Array(value :_*))
      
      @scala.inline
      def setT(value: c): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait WJSTableRow extends StObject {
    
    /** Cells */
    var c: js.Array[WJSTableCell]
    
    var t: r
  }
  object WJSTableRow {
    
    @scala.inline
    def apply(c: js.Array[WJSTableCell]): WJSTableRow = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], t = "r")
      __obj.asInstanceOf[WJSTableRow]
    }
    
    @scala.inline
    implicit class WJSTableRowMutableBuilder[Self <: WJSTableRow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: js.Array[WJSTableCell]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCVarargs(value: WJSTableCell*): Self = StObject.set(x, "c", js.Array(value :_*))
      
      @scala.inline
      def setT(value: r): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait WJSTextRun
    extends StObject
       with WJSParaElement {
    
    var t: s
    
    /** Text content */
    var v: String
  }
  object WJSTextRun {
    
    @scala.inline
    def apply(v: String): WJSTextRun = {
      val __obj = js.Dynamic.literal(t = "s", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[WJSTextRun]
    }
    
    @scala.inline
    implicit class WJSTextRunMutableBuilder[Self <: WJSTextRun] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setT(value: s): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
