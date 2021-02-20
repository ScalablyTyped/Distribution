package typings.styleToObject

import org.scalablytyped.runtime.StringDictionary
import typings.styleToObject.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("style-to-object", JSImport.Namespace)
  @js.native
  def apply(style: String): StringDictionary[String] | Null = js.native
  @JSImport("style-to-object", JSImport.Namespace)
  @js.native
  def apply(style: String, iterator: Iterator): StringDictionary[String] | Null = js.native
  
  // declaration is an object from module `inline-style-parser`
  @js.native
  trait Declaration extends StObject {
    
    var position: End = js.native
    
    var property: String = js.native
    
    var `type`: String = js.native
    
    var value: String = js.native
  }
  object Declaration {
    
    @scala.inline
    def apply(position: End, property: String, `type`: String, value: String): Declaration = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Declaration]
    }
    
    @scala.inline
    implicit class DeclarationMutableBuilder[Self <: Declaration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: End): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeclarationPos extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object DeclarationPos {
    
    @scala.inline
    def apply(column: Double, line: Double): DeclarationPos = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationPos]
    }
    
    @scala.inline
    implicit class DeclarationPosMutableBuilder[Self <: DeclarationPos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  type Iterator = js.Function3[/* property */ String, /* value */ String, /* declaration */ Declaration, Unit]
}
