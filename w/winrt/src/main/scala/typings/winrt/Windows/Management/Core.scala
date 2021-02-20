package typings.winrt.Windows.Management

import typings.winrt.Windows.Storage.ApplicationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  type ApplicationDataManager = IApplicationDataManager
  
  @js.native
  trait IApplicationDataManager extends StObject
  
  @js.native
  trait IApplicationDataManagerStatics extends StObject {
    
    def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
  }
  object IApplicationDataManagerStatics {
    
    @scala.inline
    def apply(createForPackageFamily: String => ApplicationData): IApplicationDataManagerStatics = {
      val __obj = js.Dynamic.literal(createForPackageFamily = js.Any.fromFunction1(createForPackageFamily))
      __obj.asInstanceOf[IApplicationDataManagerStatics]
    }
    
    @scala.inline
    implicit class IApplicationDataManagerStaticsMutableBuilder[Self <: IApplicationDataManagerStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateForPackageFamily(value: String => ApplicationData): Self = StObject.set(x, "createForPackageFamily", js.Any.fromFunction1(value))
    }
  }
}
