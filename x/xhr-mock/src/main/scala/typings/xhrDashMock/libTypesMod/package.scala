package typings.xhrDashMock

import org.scalablytyped.runtime.StringDictionary
import typings.xhrDashMock.libMockRequestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type Mock = MockObject | MockFunction
  type MockFunction = js.Function2[
    /* request */ default, 
    /* response */ typings.xhrDashMock.libMockResponseMod.default, 
    js.UndefOr[
      typings.xhrDashMock.libMockResponseMod.default | js.Promise[js.UndefOr[typings.xhrDashMock.libMockResponseMod.default]]
    ]
  ]
  type MockHeaders = StringDictionary[String]
}
