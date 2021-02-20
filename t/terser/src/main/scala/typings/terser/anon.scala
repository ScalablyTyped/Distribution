package typings.terser

import typings.terser.terserStrings.comment1
import typings.terser.terserStrings.comment2
import typings.terser.terserStrings.comment3
import typings.terser.terserStrings.comment4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Col extends StObject {
    
    var col: Double = js.native
    
    var line: Double = js.native
    
    var pos: Double = js.native
    
    var `type`: comment1 | comment2 | comment3 | comment4 = js.native
    
    var value: String = js.native
  }
  object Col {
    
    @scala.inline
    def apply(
      col: Double,
      line: Double,
      pos: Double,
      `type`: comment1 | comment2 | comment3 | comment4,
      value: String
    ): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    @scala.inline
    implicit class ColMutableBuilder[Self <: Col] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: comment1 | comment2 | comment3 | comment4): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
