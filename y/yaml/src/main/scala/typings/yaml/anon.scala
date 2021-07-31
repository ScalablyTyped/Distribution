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
    
    @scala.inline
    def apply(end: LinePos, start: LinePos): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: LinePos): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: LinePos): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Errors extends StObject {
    
    var errors: js.Array[YAMLSyntaxError]
    
    var str: String
  }
  object Errors {
    
    @scala.inline
    def apply(errors: js.Array[YAMLSyntaxError], str: String): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[YAMLSyntaxError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: YAMLSyntaxError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    }
  }
  
  trait Handle extends StObject {
    
    var handle: String
    
    var suffix: String
  }
  object Handle {
    
    @scala.inline
    def apply(handle: String, suffix: String): Handle = {
      val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Handle]
    }
    
    @scala.inline
    implicit class HandleMutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(jsonEncoding: Boolean, minMultiLineLength: Double): JsonEncoding = {
      val __obj = js.Dynamic.literal(jsonEncoding = jsonEncoding.asInstanceOf[js.Any], minMultiLineLength = minMultiLineLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonEncoding]
    }
    
    @scala.inline
    implicit class JsonEncodingMutableBuilder[Self <: JsonEncoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsonEncoding(value: Boolean): Self = StObject.set(x, "jsonEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinMultiLineLength(value: Double): Self = StObject.set(x, "minMultiLineLength", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(lineWidth: Double, minContentWidth: Double): LineWidth = {
      val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], minContentWidth = minContentWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineWidth]
    }
    
    @scala.inline
    implicit class LineWidthMutableBuilder[Self <: LineWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinContentWidth(value: Double): Self = StObject.set(x, "minContentWidth", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(MAP: String, SEQ: String, STR: String): MAP = {
      val __obj = js.Dynamic.literal(MAP = MAP.asInstanceOf[js.Any], SEQ = SEQ.asInstanceOf[js.Any], STR = STR.asInstanceOf[js.Any])
      __obj.asInstanceOf[MAP]
    }
    
    @scala.inline
    implicit class MAPMutableBuilder[Self <: MAP] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMAP(value: String): Self = StObject.set(x, "MAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSEQ(value: String): Self = StObject.set(x, "SEQ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTR(value: String): Self = StObject.set(x, "STR", value.asInstanceOf[js.Any])
    }
  }
  
  trait Verbatim extends StObject {
    
    var verbatim: String
  }
  object Verbatim {
    
    @scala.inline
    def apply(verbatim: String): Verbatim = {
      val __obj = js.Dynamic.literal(verbatim = verbatim.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verbatim]
    }
    
    @scala.inline
    implicit class VerbatimMutableBuilder[Self <: Verbatim] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerbatim(value: String): Self = StObject.set(x, "verbatim", value.asInstanceOf[js.Any])
    }
  }
}
