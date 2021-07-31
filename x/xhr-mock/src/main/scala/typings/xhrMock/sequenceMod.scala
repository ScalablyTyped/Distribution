package typings.xhrMock

import typings.xhrMock.typesMod.MockFunction
import typings.xhrMock.typesMod.MockObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequenceMod {
  
  @JSImport("xhr-mock/lib/utils/sequence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(mocks.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
}
