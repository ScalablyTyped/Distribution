package typings.styledComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistSheetGroupIDAllocatorMod {
  
  @JSImport("styled-components/primitives/dist/sheet/GroupIDAllocator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGroupForId(id: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupForId")(id.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getIdForGroup(group: Double): Unit | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdForGroup")(group.asInstanceOf[js.Any]).asInstanceOf[Unit | String]
  
  inline def resetGroupIds(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGroupIds")().asInstanceOf[Unit]
  
  inline def setGroupForId(id: String, group: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGroupForId")(id.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
