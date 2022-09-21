package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageProgressCallback extends StObject {
  
  /**
    * Called when the request is completed.
    *
    * @param id The package ID.
    */
  def oncomplete(id: PackageId): Unit
  
  /**
    * Called while the request is in progress.
    *
    * @param id The package ID.
    * @param progress The progress in percentage.
    */
  def onprogress(id: PackageId, progress: Double): Unit
}
object PackageProgressCallback {
  
  inline def apply(oncomplete: PackageId => Unit, onprogress: (PackageId, Double) => Unit): PackageProgressCallback = {
    val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1(oncomplete), onprogress = js.Any.fromFunction2(onprogress))
    __obj.asInstanceOf[PackageProgressCallback]
  }
  
  extension [Self <: PackageProgressCallback](x: Self) {
    
    inline def setOncomplete(value: PackageId => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
    
    inline def setOnprogress(value: (PackageId, Double) => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction2(value))
  }
}
