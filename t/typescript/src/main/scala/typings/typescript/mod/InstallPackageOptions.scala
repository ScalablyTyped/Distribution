package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallPackageOptions extends StObject {
  
  var fileName: Path
  
  var packageName: java.lang.String
}
object InstallPackageOptions {
  
  inline def apply(fileName: Path, packageName: java.lang.String): InstallPackageOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallPackageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallPackageOptions] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: Path): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: java.lang.String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
  }
}
