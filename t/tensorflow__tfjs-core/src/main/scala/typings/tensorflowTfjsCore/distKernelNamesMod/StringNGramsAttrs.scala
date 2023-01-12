package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringNGramsAttrs extends StObject {
  
  var leftPad: String
  
  var nGramWidths: js.Array[Double]
  
  var padWidth: Double
  
  var preserveShortSequences: Boolean
  
  var rightPad: String
  
  var separator: String
}
object StringNGramsAttrs {
  
  inline def apply(
    leftPad: String,
    nGramWidths: js.Array[Double],
    padWidth: Double,
    preserveShortSequences: Boolean,
    rightPad: String,
    separator: String
  ): StringNGramsAttrs = {
    val __obj = js.Dynamic.literal(leftPad = leftPad.asInstanceOf[js.Any], nGramWidths = nGramWidths.asInstanceOf[js.Any], padWidth = padWidth.asInstanceOf[js.Any], preserveShortSequences = preserveShortSequences.asInstanceOf[js.Any], rightPad = rightPad.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringNGramsAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringNGramsAttrs] (val x: Self) extends AnyVal {
    
    inline def setLeftPad(value: String): Self = StObject.set(x, "leftPad", value.asInstanceOf[js.Any])
    
    inline def setNGramWidths(value: js.Array[Double]): Self = StObject.set(x, "nGramWidths", value.asInstanceOf[js.Any])
    
    inline def setNGramWidthsVarargs(value: Double*): Self = StObject.set(x, "nGramWidths", js.Array(value*))
    
    inline def setPadWidth(value: Double): Self = StObject.set(x, "padWidth", value.asInstanceOf[js.Any])
    
    inline def setPreserveShortSequences(value: Boolean): Self = StObject.set(x, "preserveShortSequences", value.asInstanceOf[js.Any])
    
    inline def setRightPad(value: String): Self = StObject.set(x, "rightPad", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
  }
}
