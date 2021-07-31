package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignUndefined extends StObject {
  
  var align: Unit
}
object AlignUndefined {
  
  @scala.inline
  def apply(align: Unit): AlignUndefined = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignUndefined]
  }
  
  @scala.inline
  implicit class AlignUndefinedMutableBuilder[Self <: AlignUndefined] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Unit): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
  }
}
