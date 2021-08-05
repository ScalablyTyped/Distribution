package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeepBothFiles extends StObject {
  
  var keepBothFiles: scala.Double
  
  var keepSourcePath: scala.Double
  
  var keepTargetPath: scala.Double
  
  var undecided: scala.Double
}
object KeepBothFiles {
  
  inline def apply(
    keepBothFiles: scala.Double,
    keepSourcePath: scala.Double,
    keepTargetPath: scala.Double,
    undecided: scala.Double
  ): KeepBothFiles = {
    val __obj = js.Dynamic.literal(keepBothFiles = keepBothFiles.asInstanceOf[js.Any], keepSourcePath = keepSourcePath.asInstanceOf[js.Any], keepTargetPath = keepTargetPath.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepBothFiles]
  }
  
  extension [Self <: KeepBothFiles](x: Self) {
    
    inline def setKeepBothFiles(value: scala.Double): Self = StObject.set(x, "keepBothFiles", value.asInstanceOf[js.Any])
    
    inline def setKeepSourcePath(value: scala.Double): Self = StObject.set(x, "keepSourcePath", value.asInstanceOf[js.Any])
    
    inline def setKeepTargetPath(value: scala.Double): Self = StObject.set(x, "keepTargetPath", value.asInstanceOf[js.Any])
    
    inline def setUndecided(value: scala.Double): Self = StObject.set(x, "undecided", value.asInstanceOf[js.Any])
  }
}
