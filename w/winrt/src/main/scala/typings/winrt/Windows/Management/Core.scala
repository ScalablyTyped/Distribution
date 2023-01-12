package typings.winrt.Windows.Management

import typings.winrt.Windows.Storage.ApplicationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  type ApplicationDataManager = IApplicationDataManager
  
  trait IApplicationDataManager extends StObject
  
  trait IApplicationDataManagerStatics extends StObject {
    
    def createForPackageFamily(packageFamilyName: String): ApplicationData
  }
  object IApplicationDataManagerStatics {
    
    inline def apply(createForPackageFamily: String => ApplicationData): IApplicationDataManagerStatics = {
      val __obj = js.Dynamic.literal(createForPackageFamily = js.Any.fromFunction1(createForPackageFamily))
      __obj.asInstanceOf[IApplicationDataManagerStatics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IApplicationDataManagerStatics] (val x: Self) extends AnyVal {
      
      inline def setCreateForPackageFamily(value: String => ApplicationData): Self = StObject.set(x, "createForPackageFamily", js.Any.fromFunction1(value))
    }
  }
}
