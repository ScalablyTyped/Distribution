package typings.xhrDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typings.xhrDashMock.libMockRequestMod.default

  type Mock = MockObject | MockFunction
  type MockFunction = js.Function2[
    /* request */ default, 
    /* response */ typings.xhrDashMock.libMockResponseMod.default, 
    js.UndefOr[
      typings.xhrDashMock.libMockResponseMod.default | js.Promise[js.UndefOr[typings.xhrDashMock.libMockResponseMod.default]]
    ]
  ]
}
