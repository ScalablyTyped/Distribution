package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fret extends StObject {
  
  var fret: Double = js.native
  
  var str: Double = js.native
}
object Fret {
  
  @scala.inline
  def apply(fret: Double, str: Double): Fret = {
    val __obj = js.Dynamic.literal(fret = fret.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fret]
  }
  
  @scala.inline
  implicit class FretMutableBuilder[Self <: Fret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFret(value: Double): Self = StObject.set(x, "fret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStr(value: Double): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
