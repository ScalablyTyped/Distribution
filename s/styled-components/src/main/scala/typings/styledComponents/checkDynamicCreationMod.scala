package typings.styledComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkDynamicCreationMod {
  
  @JSImport("styled-components/native/dist/dist/utils/checkDynamicCreation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkDynamicCreation(displayName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDynamicCreation")(displayName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkDynamicCreation(displayName: String, componentId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDynamicCreation")(displayName.asInstanceOf[js.Any], componentId.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
