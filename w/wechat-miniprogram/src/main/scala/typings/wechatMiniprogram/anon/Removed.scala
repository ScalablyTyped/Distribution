package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Removed extends StObject {
  
  var removed: Double
}
object Removed {
  
  @scala.inline
  def apply(removed: Double): Removed = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Removed]
  }
  
  @scala.inline
  implicit class RemovedMutableBuilder[Self <: Removed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoved(value: Double): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
