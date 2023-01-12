package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstcSupported extends StObject {
  
  var astcSupported: Boolean
  
  var dxtSupported: Boolean
  
  var etcSupported: Boolean
  
  var format: Double
  
  var pvrtcSupported: Boolean
}
object AstcSupported {
  
  inline def apply(
    astcSupported: Boolean,
    dxtSupported: Boolean,
    etcSupported: Boolean,
    format: Double,
    pvrtcSupported: Boolean
  ): AstcSupported = {
    val __obj = js.Dynamic.literal(astcSupported = astcSupported.asInstanceOf[js.Any], dxtSupported = dxtSupported.asInstanceOf[js.Any], etcSupported = etcSupported.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], pvrtcSupported = pvrtcSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AstcSupported]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AstcSupported] (val x: Self) extends AnyVal {
    
    inline def setAstcSupported(value: Boolean): Self = StObject.set(x, "astcSupported", value.asInstanceOf[js.Any])
    
    inline def setDxtSupported(value: Boolean): Self = StObject.set(x, "dxtSupported", value.asInstanceOf[js.Any])
    
    inline def setEtcSupported(value: Boolean): Self = StObject.set(x, "etcSupported", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setPvrtcSupported(value: Boolean): Self = StObject.set(x, "pvrtcSupported", value.asInstanceOf[js.Any])
  }
}
