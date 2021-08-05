package typings.styleToObject

import org.scalablytyped.runtime.StringDictionary
import typings.styleToObject.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(style: String): StringDictionary[String] | Null = ^.asInstanceOf[js.Dynamic].apply(style.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String] | Null]
  inline def apply(style: String, iterator: Iterator): StringDictionary[String] | Null = (^.asInstanceOf[js.Dynamic].apply(style.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String] | Null]
  
  @JSImport("style-to-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // declaration is an object from module `inline-style-parser`
  trait Declaration extends StObject {
    
    var position: End
    
    var property: String
    
    var `type`: String
    
    var value: String
  }
  object Declaration {
    
    inline def apply(position: End, property: String, `type`: String, value: String): Declaration = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Declaration]
    }
    
    extension [Self <: Declaration](x: Self) {
      
      inline def setPosition(value: End): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeclarationPos extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object DeclarationPos {
    
    inline def apply(column: Double, line: Double): DeclarationPos = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationPos]
    }
    
    extension [Self <: DeclarationPos](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  type Iterator = js.Function3[/* property */ String, /* value */ String, /* declaration */ Declaration, Unit]
}
