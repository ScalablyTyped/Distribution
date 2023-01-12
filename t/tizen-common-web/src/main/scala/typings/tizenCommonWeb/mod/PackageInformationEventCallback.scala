package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageInformationEventCallback extends StObject {
  
  /**
    * Called when a package is installed.
    *
    * @param info The information of the installed package.
    */
  def oninstalled(info: PackageInformation): Unit
  
  /**
    * Called when a package is uninstalled.
    *
    * @param id The ID of the uninstalled package.
    */
  def onuninstalled(id: PackageId): Unit
  
  /**
    * Called when a package is updated.
    *
    * @param info The information of the updated package.
    */
  def onupdated(info: PackageInformation): Unit
}
object PackageInformationEventCallback {
  
  inline def apply(
    oninstalled: PackageInformation => Unit,
    onuninstalled: PackageId => Unit,
    onupdated: PackageInformation => Unit
  ): PackageInformationEventCallback = {
    val __obj = js.Dynamic.literal(oninstalled = js.Any.fromFunction1(oninstalled), onuninstalled = js.Any.fromFunction1(onuninstalled), onupdated = js.Any.fromFunction1(onupdated))
    __obj.asInstanceOf[PackageInformationEventCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageInformationEventCallback] (val x: Self) extends AnyVal {
    
    inline def setOninstalled(value: PackageInformation => Unit): Self = StObject.set(x, "oninstalled", js.Any.fromFunction1(value))
    
    inline def setOnuninstalled(value: PackageId => Unit): Self = StObject.set(x, "onuninstalled", js.Any.fromFunction1(value))
    
    inline def setOnupdated(value: PackageInformation => Unit): Self = StObject.set(x, "onupdated", js.Any.fromFunction1(value))
  }
}
