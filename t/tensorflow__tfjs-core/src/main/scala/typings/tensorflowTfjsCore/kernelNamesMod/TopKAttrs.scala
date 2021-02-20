package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopKAttrs extends StObject {
  
  var k: Double = js.native
  
  var sorted: Boolean = js.native
}
object TopKAttrs {
  
  @scala.inline
  def apply(k: Double, sorted: Boolean): TopKAttrs = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopKAttrs]
  }
  
  @scala.inline
  implicit class TopKAttrsMutableBuilder[Self <: TopKAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
  }
}
