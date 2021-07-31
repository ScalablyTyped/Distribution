package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clicked2 extends StObject {
  
  var clicked2: Double
  
  var clicked3: Double
  
  var clicked4: Double
  
  var clicked5: Double
}
object Clicked2 {
  
  @scala.inline
  def apply(clicked2: Double, clicked3: Double, clicked4: Double, clicked5: Double): Clicked2 = {
    val __obj = js.Dynamic.literal(clicked2 = clicked2.asInstanceOf[js.Any], clicked3 = clicked3.asInstanceOf[js.Any], clicked4 = clicked4.asInstanceOf[js.Any], clicked5 = clicked5.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clicked2]
  }
  
  @scala.inline
  implicit class Clicked2MutableBuilder[Self <: Clicked2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClicked2(value: Double): Self = StObject.set(x, "clicked2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicked3(value: Double): Self = StObject.set(x, "clicked3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicked4(value: Double): Self = StObject.set(x, "clicked4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClicked5(value: Double): Self = StObject.set(x, "clicked5", value.asInstanceOf[js.Any])
  }
}
