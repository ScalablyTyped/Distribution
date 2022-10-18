package typings.xhrMock

import typings.xhrMock.libTypesMod.MockFunction
import typings.xhrMock.libTypesMod.MockObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDelayMod {
  
  @JSImport("xhr-mock/lib/utils/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(mock: MockFunction): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  inline def delay(mock: MockFunction, ms: Double): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
  inline def delay(mock: MockObject): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  inline def delay(mock: MockObject, ms: Double): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
}
