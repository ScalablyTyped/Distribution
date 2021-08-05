package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Glyph extends StObject {
  
  var glyph: typings.vexflow.Vex.Flow.Glyph
  
  var num: Double
}
object Glyph {
  
  inline def apply(glyph: typings.vexflow.Vex.Flow.Glyph, num: Double): Glyph = {
    val __obj = js.Dynamic.literal(glyph = glyph.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[Glyph]
  }
  
  extension [Self <: Glyph](x: Self) {
    
    inline def setGlyph(value: typings.vexflow.Vex.Flow.Glyph): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
  }
}
