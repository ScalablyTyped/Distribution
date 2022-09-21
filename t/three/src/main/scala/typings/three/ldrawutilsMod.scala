package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Group
import typings.three.threeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ldrawutilsMod {
  
  object LDrawUtils {
    
    @JSImport("three/examples/jsm/utils/LDrawUtils", "LDrawUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mergeObject(`object`: Object3D[Event]): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Group]
  }
}
