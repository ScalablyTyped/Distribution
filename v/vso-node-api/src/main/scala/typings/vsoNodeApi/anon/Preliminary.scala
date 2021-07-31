package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preliminary extends StObject {
  
  var full: scala.Double
  
  var preliminary: scala.Double
}
object Preliminary {
  
  @scala.inline
  def apply(full: scala.Double, preliminary: scala.Double): Preliminary = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], preliminary = preliminary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preliminary]
  }
  
  @scala.inline
  implicit class PreliminaryMutableBuilder[Self <: Preliminary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: scala.Double): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreliminary(value: scala.Double): Self = StObject.set(x, "preliminary", value.asInstanceOf[js.Any])
  }
}
