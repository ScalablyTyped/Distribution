package typings.workboxBuild.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestPath extends StObject {
  
  var destPath: js.UndefOr[String] = js.undefined
  
  var srcPath: js.UndefOr[String] = js.undefined
  
  var warning: js.UndefOr[String] = js.undefined
}
object DestPath {
  
  inline def apply(): DestPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestPath] (val x: Self) extends AnyVal {
    
    inline def setDestPath(value: String): Self = StObject.set(x, "destPath", value.asInstanceOf[js.Any])
    
    inline def setDestPathUndefined: Self = StObject.set(x, "destPath", js.undefined)
    
    inline def setSrcPath(value: String): Self = StObject.set(x, "srcPath", value.asInstanceOf[js.Any])
    
    inline def setSrcPathUndefined: Self = StObject.set(x, "srcPath", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
