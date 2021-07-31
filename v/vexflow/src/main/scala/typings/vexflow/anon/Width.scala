package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  var width: Double
}
object Width {
  
  @scala.inline
  def apply(width: Double): Width = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  
  @scala.inline
  implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
