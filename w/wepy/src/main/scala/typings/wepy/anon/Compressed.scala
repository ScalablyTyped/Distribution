package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compressed extends StObject {
  
  var compressed: Boolean
  
  var maxDuration: Double
  
  var sourceType: js.Array[String]
}
object Compressed {
  
  @scala.inline
  def apply(compressed: Boolean, maxDuration: Double, sourceType: js.Array[String]): Compressed = {
    val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], maxDuration = maxDuration.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compressed]
  }
  
  @scala.inline
  implicit class CompressedMutableBuilder[Self <: Compressed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: js.Array[String]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeVarargs(value: String*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
  }
}
