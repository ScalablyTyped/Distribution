package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeepBothFiles extends StObject {
  
  var keepBothFiles: scala.Double = js.native
  
  var keepSourcePath: scala.Double = js.native
  
  var keepTargetPath: scala.Double = js.native
  
  var undecided: scala.Double = js.native
}
object KeepBothFiles {
  
  @scala.inline
  def apply(
    keepBothFiles: scala.Double,
    keepSourcePath: scala.Double,
    keepTargetPath: scala.Double,
    undecided: scala.Double
  ): KeepBothFiles = {
    val __obj = js.Dynamic.literal(keepBothFiles = keepBothFiles.asInstanceOf[js.Any], keepSourcePath = keepSourcePath.asInstanceOf[js.Any], keepTargetPath = keepTargetPath.asInstanceOf[js.Any], undecided = undecided.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepBothFiles]
  }
  
  @scala.inline
  implicit class KeepBothFilesMutableBuilder[Self <: KeepBothFiles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepBothFiles(value: scala.Double): Self = StObject.set(x, "keepBothFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepSourcePath(value: scala.Double): Self = StObject.set(x, "keepSourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepTargetPath(value: scala.Double): Self = StObject.set(x, "keepTargetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndecided(value: scala.Double): Self = StObject.set(x, "undecided", value.asInstanceOf[js.Any])
  }
}
