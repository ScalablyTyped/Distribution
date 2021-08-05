package typings.yaml

import typings.yaml.utilMod.LinePos
import typings.yaml.utilMod.YAMLSyntaxError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: LinePos
    
    var start: LinePos
  }
  object End {
    
    inline def apply(end: LinePos, start: LinePos): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: LinePos): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: LinePos): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Errors extends StObject {
    
    var errors: js.Array[YAMLSyntaxError]
    
    var str: String
  }
  object Errors {
    
    inline def apply(errors: js.Array[YAMLSyntaxError], str: String): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: js.Array[YAMLSyntaxError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: YAMLSyntaxError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    }
  }
  
  trait Handle extends StObject {
    
    var handle: String
    
    var suffix: String
  }
  object Handle {
    
    inline def apply(handle: String, suffix: String): Handle = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handle]
    }
    
    extension [Self <: Handle](x: Self) {
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonEncoding extends StObject {
    
    /**
      * Whether to restrict double-quoted strings to use JSON-compatible syntax.
      *
      * Default: `false`
      */
    var jsonEncoding: Boolean
    
    /**
      * Minimum length to use multiple lines to represent the value.
      *
      * Default: `40`
      */
    var minMultiLineLength: Double
  }
  object JsonEncoding {
    
    inline def apply(jsonEncoding: Boolean, minMultiLineLength: Double): JsonEncoding = {
      val __obj = js.Dynamic.literal(jsonEncoding = jsonEncoding.asInstanceOf[js.Any], minMultiLineLength = minMultiLineLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonEncoding]
    }
    
    extension [Self <: JsonEncoding](x: Self) {
      
      inline def setJsonEncoding(value: Boolean): Self = StObject.set(x, "jsonEncoding", value.asInstanceOf[js.Any])
      
      inline def setMinMultiLineLength(value: Double): Self = StObject.set(x, "minMultiLineLength", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineWidth extends StObject {
    
    /**
      * Maximum line width (set to `0` to disable folding).
      *
      * Default: `80`
      */
    var lineWidth: Double
    
    /**
      * Minimum width for highly-indented content.
      *
      * Default: `20`
      */
    var minContentWidth: Double
  }
  object LineWidth {
    
    inline def apply(lineWidth: Double, minContentWidth: Double): LineWidth = {
      val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], minContentWidth = minContentWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineWidth]
    }
    
    extension [Self <: LineWidth](x: Self) {
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setMinContentWidth(value: Double): Self = StObject.set(x, "minContentWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait MAP extends StObject {
    
    /** Default: `'tag:yaml.org,2002:map'` */
    var MAP: String
    
    /** Default: `'tag:yaml.org,2002:seq'` */
    var SEQ: String
    
    /** Default: `'tag:yaml.org,2002:str'` */
    var STR: String
  }
  object MAP {
    
    inline def apply(MAP: String, SEQ: String, STR: String): MAP = {
      val __obj = js.Dynamic.literal(MAP = MAP.asInstanceOf[js.Any], SEQ = SEQ.asInstanceOf[js.Any], STR = STR.asInstanceOf[js.Any])
      __obj.asInstanceOf[MAP]
    }
    
    extension [Self <: MAP](x: Self) {
      
      inline def setMAP(value: String): Self = StObject.set(x, "MAP", value.asInstanceOf[js.Any])
      
      inline def setSEQ(value: String): Self = StObject.set(x, "SEQ", value.asInstanceOf[js.Any])
      
      inline def setSTR(value: String): Self = StObject.set(x, "STR", value.asInstanceOf[js.Any])
    }
  }
  
  trait Verbatim extends StObject {
    
    var verbatim: String
  }
  object Verbatim {
    
    inline def apply(verbatim: String): Verbatim = {
      val __obj = js.Dynamic.literal(verbatim = verbatim.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verbatim]
    }
    
    extension [Self <: Verbatim](x: Self) {
      
      inline def setVerbatim(value: String): Self = StObject.set(x, "verbatim", value.asInstanceOf[js.Any])
    }
  }
}
