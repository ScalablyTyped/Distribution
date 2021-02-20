package typings.word

import typings.word.wordStrings.c
import typings.word.wordStrings.r
import typings.word.wordStrings.s
import typings.word.wordStrings.t
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait WJSDoc extends StObject {
    
    var p: js.Array[WJSPara] = js.native
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
  
  @js.native
  trait WJSPara extends StObject {
    
    /** Children */
    var elts: js.Array[WJSParaElement] = js.native
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
    def WJSTable(r: js.Array[WJSTableRow], t: t): typings.word.typesMod.WJSTable = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.word.typesMod.WJSTable]
    }
    
    @scala.inline
    def WJSTextRun(t: s, v: String): typings.word.typesMod.WJSTextRun = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.word.typesMod.WJSTextRun]
    }
  }
  
  @js.native
  trait WJSTable extends WJSParaElement {
    
    /** Rows */
    var r: js.Array[WJSTableRow] = js.native
    
    var t: typings.word.wordStrings.t = js.native
  }
  object WJSTable {
    
    @scala.inline
    def apply(r: js.Array[WJSTableRow], t: t): WJSTable = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
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
  
  @js.native
  trait WJSTableCell extends StObject {
    
    /** Body */
    var p: js.Array[WJSPara] = js.native
    
    var t: c = js.native
  }
  object WJSTableCell {
    
    @scala.inline
    def apply(p: js.Array[WJSPara], t: c): WJSTableCell = {
      val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
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
  
  @js.native
  trait WJSTableRow extends StObject {
    
    /** Cells */
    var c: js.Array[WJSTableCell] = js.native
    
    var t: r = js.native
  }
  object WJSTableRow {
    
    @scala.inline
    def apply(c: js.Array[WJSTableCell], t: r): WJSTableRow = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
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
  
  @js.native
  trait WJSTextRun extends WJSParaElement {
    
    var t: s = js.native
    
    /** Text content */
    var v: String = js.native
  }
  object WJSTextRun {
    
    @scala.inline
    def apply(t: s, v: String): WJSTextRun = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
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
