package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressResponseBase extends StObject {
  
  var done: Double
  
  var lengthComputable: Boolean
  
  var loaded: Double
  
  var position: Double
  
  var total: Double
  
  var totalSize: Double
}
object ProgressResponseBase {
  
  @scala.inline
  def apply(
    done: Double,
    lengthComputable: Boolean,
    loaded: Double,
    position: Double,
    total: Double,
    totalSize: Double
  ): ProgressResponseBase = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], lengthComputable = lengthComputable.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressResponseBase]
  }
  
  @scala.inline
  implicit class ProgressResponseBaseMutableBuilder[Self <: ProgressResponseBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Double): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthComputable(value: Boolean): Self = StObject.set(x, "lengthComputable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
  }
}
