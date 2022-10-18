package typings.xhrMock

import typings.xhrMock.libTypesMod.MockFunction
import typings.xhrMock.libTypesMod.MockObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsOnceMod {
  
  @JSImport("xhr-mock/lib/utils/once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def once(mock: MockFunction): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  inline def once(mock: MockObject): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
}
