package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallPackageOptions extends StObject {
  
  var fileName: Path = js.native
  
  var packageName: java.lang.String = js.native
}
object InstallPackageOptions {
  
  @scala.inline
  def apply(fileName: Path, packageName: java.lang.String): InstallPackageOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallPackageOptions]
  }
  
  @scala.inline
  implicit class InstallPackageOptionsMutableBuilder[Self <: InstallPackageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: Path): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageName(value: java.lang.String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
  }
}
