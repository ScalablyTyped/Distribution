package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bounds extends StObject {
  
  val bounds: js.Any
}
object Bounds {
  
  @scala.inline
  def apply(bounds: js.Any): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: js.Any): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
  }
}
