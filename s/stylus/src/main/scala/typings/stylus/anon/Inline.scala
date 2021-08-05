package typings.stylus.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inline extends StObject {
  
  var __type: String
  
  var column: Double
  
  var filename: String
  
  var `inline`: Boolean
  
  var lineno: Double
  
  var str: String
  
  var suppress: Boolean
}
object Inline {
  
  inline def apply(
    __type: String,
    column: Double,
    filename: String,
    `inline`: Boolean,
    lineno: Double,
    str: String,
    suppress: Boolean
  ): Inline = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], suppress = suppress.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
  
  extension [Self <: Inline](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    
    inline def setSuppress(value: Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
    
    inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
