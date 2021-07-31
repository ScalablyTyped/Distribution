package typings.xhrMock

import typings.xhrMock.typesMod.MockFunction
import typings.xhrMock.typesMod.MockObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  @JSImport("xhr-mock/lib/utils/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def delay(mock: MockFunction): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  @scala.inline
  def delay(mock: MockFunction, ms: Double): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
  @scala.inline
  def delay(mock: MockObject): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  @scala.inline
  def delay(mock: MockObject, ms: Double): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
}
