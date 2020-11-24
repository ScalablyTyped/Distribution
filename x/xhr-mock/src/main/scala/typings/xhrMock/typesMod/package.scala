package typings.xhrMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Mock = typings.xhrMock.typesMod.MockObject | typings.xhrMock.typesMod.MockFunction
  
  type MockFunction = js.Function2[
    /* request */ typings.xhrMock.mockRequestMod.default, 
    /* response */ typings.xhrMock.mockResponseMod.default, 
    js.UndefOr[
      typings.xhrMock.mockResponseMod.default | js.Promise[js.UndefOr[typings.xhrMock.mockResponseMod.default]]
    ]
  ]
}
