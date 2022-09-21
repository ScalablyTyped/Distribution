package typings.workgridCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workgrid-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(
    callback: js.Function2[/* err */ js.Error, /* result */ String, Unit],
    spaceId: String,
    companyCode: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(callback.asInstanceOf[js.Any], spaceId.asInstanceOf[js.Any], companyCode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("workgrid-core", "workgrid")
  @js.native
  val workgrid: js.Object = js.native
}
