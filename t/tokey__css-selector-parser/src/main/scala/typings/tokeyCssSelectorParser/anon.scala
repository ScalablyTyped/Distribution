package typings.tokeyCssSelectorParser

import typings.tokeyCssSelectorParser.distAstTypesMod.Comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait First extends StObject {
    
    var first: js.Array[Comment]
    
    var second: js.Array[Comment]
  }
  object First {
    
    inline def apply(first: js.Array[Comment], second: js.Array[Comment]): First = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[First]
    }
    
    extension [Self <: First](x: Self) {
      
      inline def setFirst(value: js.Array[Comment]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstVarargs(value: Comment*): Self = StObject.set(x, "first", js.Array(value*))
      
      inline def setSecond(value: js.Array[Comment]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondVarargs(value: Comment*): Self = StObject.set(x, "second", js.Array(value*))
    }
  }
  
  trait Offset extends StObject {
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object Offset {
    
    inline def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@tokey/css-selector-parser.@tokey/css-selector-parser/dist/selector-parser.ParseConfig> */
  trait PartialParseConfig extends StObject {
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object PartialParseConfig {
    
    inline def apply(): PartialParseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialParseConfig]
    }
    
    extension [Self <: PartialParseConfig](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
