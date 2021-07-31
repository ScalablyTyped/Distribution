package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsortedSegmentSumAttrs extends StObject {
  
  var numSegments: Double
}
object UnsortedSegmentSumAttrs {
  
  @scala.inline
  def apply(numSegments: Double): UnsortedSegmentSumAttrs = {
    val __obj = js.Dynamic.literal(numSegments = numSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsortedSegmentSumAttrs]
  }
  
  @scala.inline
  implicit class UnsortedSegmentSumAttrsMutableBuilder[Self <: UnsortedSegmentSumAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumSegments(value: Double): Self = StObject.set(x, "numSegments", value.asInstanceOf[js.Any])
  }
}
