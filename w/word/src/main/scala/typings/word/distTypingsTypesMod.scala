package typings.word

import typings.word.wordStrings.c
import typings.word.wordStrings.r
import typings.word.wordStrings.s
import typings.word.wordStrings.t
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsTypesMod {
  
  trait WJSDoc extends StObject {
    
    var p: js.Array[WJSPara]
  }
  object WJSDoc {
    
    inline def apply(p: js.Array[WJSPara]): WJSDoc = {
      val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
      __obj.asInstanceOf[WJSDoc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WJSDoc] (val x: Self) extends AnyVal {
      
      inline def setP(value: js.Array[WJSPara]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: WJSPara*): Self = StObject.set(x, "p", js.Array(value*))
    }
  }
  
  trait WJSPara extends StObject {
    
    /** Children */
    var elts: js.Array[WJSParaElement]
  }
  object WJSPara {
    
    inline def apply(elts: js.Array[WJSParaElement]): WJSPara = {
      val __obj = js.Dynamic.literal(elts = elts.asInstanceOf[js.Any])
      __obj.asInstanceOf[WJSPara]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WJSPara] (val x: Self) extends AnyVal {
      
      inline def setElts(value: js.Array[WJSParaElement]): Self = StObject.set(x, "elts", value.asInstanceOf[js.Any])
      
      inline def setEltsVarargs(value: WJSParaElement*): Self = StObject.set(x, "elts", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.word.distTypingsTypesMod.WJSTextRun
    - typings.word.distTypingsTypesMod.WJSTable
  */
  trait WJSParaElement extends StObject
  object WJSParaElement {
    
    inline def WJSTable(r: js.Array[WJSTableRow]): typings.word.distTypingsTypesMod.WJSTable = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = "t")
      __obj.asInstanceOf[typings.word.distTypingsTypesMod.WJSTable]
    }
    
    inline def WJSTextRun(v: String): typings.word.distTypingsTypesMod.WJSTextRun = {
      val __obj = js.Dynamic.literal(t = "s", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.word.distTypingsTypesMod.WJSTextRun]
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
    
    inline def apply(r: js.Array[WJSTableRow]): WJSTable = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = "t")
      __obj.asInstanceOf[WJSTable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WJSTable] (val x: Self) extends AnyVal {
      
      inline def setR(value: js.Array[WJSTableRow]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRVarargs(value: WJSTableRow*): Self = StObject.set(x, "r", js.Array(value*))
      
      inline def setT(value: t): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait WJSTableCell extends StObject {
    
    /** Body */
    var p: js.Array[WJSPara]
    
    var t: c
  }
  object WJSTableCell {
    
    inline def apply(p: js.Array[WJSPara]): WJSTableCell = {
      val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], t = "c")
      __obj.asInstanceOf[WJSTableCell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WJSTableCell] (val x: Self) extends AnyVal {
      
      inline def setP(value: js.Array[WJSPara]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: WJSPara*): Self = StObject.set(x, "p", js.Array(value*))
      
      inline def setT(value: c): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait WJSTableRow extends StObject {
    
    /** Cells */
    var c: js.Array[WJSTableCell]
    
    var t: r
  }
  object WJSTableRow {
    
    inline def apply(c: js.Array[WJSTableCell]): WJSTableRow = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], t = "r")
      __obj.asInstanceOf[WJSTableRow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WJSTableRow] (val x: Self) extends AnyVal {
      
      inline def setC(value: js.Array[WJSTableCell]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCVarargs(value: WJSTableCell*): Self = StObject.set(x, "c", js.Array(value*))
      
      inline def setT(value: r): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
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
    
    inline def apply(v: String): WJSTextRun = {
      val __obj = js.Dynamic.literal(t = "s", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[WJSTextRun]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WJSTextRun] (val x: Self) extends AnyVal {
      
      inline def setT(value: s): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
