package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stem extends StObject {
  
  var clef: String
  
  var stem: String
  
  var time: String
}
object Stem {
  
  @scala.inline
  def apply(clef: String, stem: String, time: String): Stem = {
    val __obj = js.Dynamic.literal(clef = clef.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stem]
  }
  
  @scala.inline
  implicit class StemMutableBuilder[Self <: Stem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClef(value: String): Self = StObject.set(x, "clef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
