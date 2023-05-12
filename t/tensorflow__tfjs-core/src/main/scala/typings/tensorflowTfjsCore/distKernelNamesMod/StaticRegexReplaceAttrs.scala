package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticRegexReplaceAttrs extends StObject {
  
  var pattern: String
  
  var replaceGlobal: Boolean
  
  var rewrite: String
}
object StaticRegexReplaceAttrs {
  
  inline def apply(pattern: String, replaceGlobal: Boolean, rewrite: String): StaticRegexReplaceAttrs = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], replaceGlobal = replaceGlobal.asInstanceOf[js.Any], rewrite = rewrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRegexReplaceAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticRegexReplaceAttrs] (val x: Self) extends AnyVal {
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setReplaceGlobal(value: Boolean): Self = StObject.set(x, "replaceGlobal", value.asInstanceOf[js.Any])
    
    inline def setRewrite(value: String): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
  }
}
