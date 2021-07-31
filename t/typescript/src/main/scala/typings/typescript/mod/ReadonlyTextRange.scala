package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadonlyTextRange extends StObject {
  
  val end: Double
  
  val pos: Double
}
object ReadonlyTextRange {
  
  @scala.inline
  def apply(end: Double, pos: Double): ReadonlyTextRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyTextRange]
  }
  
  @scala.inline
  implicit class ReadonlyTextRangeMutableBuilder[Self <: ReadonlyTextRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
