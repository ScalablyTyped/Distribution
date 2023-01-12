package typings.winrt.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPackageStatics extends StObject {
  
  var current: Package
}
object IPackageStatics {
  
  inline def apply(current: Package): IPackageStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackageStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPackageStatics] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Package): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
