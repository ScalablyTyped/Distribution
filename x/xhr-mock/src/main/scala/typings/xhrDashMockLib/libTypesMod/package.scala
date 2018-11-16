package typings
package xhrDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type Mock = MockObject | MockFunction
  type MockFunction = js.Function2[
    /* request */ xhrDashMockLib.libMockRequestMod.default, 
    /* response */ xhrDashMockLib.libMockResponseMod.default, 
    js.UndefOr[
      xhrDashMockLib.libMockResponseMod.default | stdLib.Promise[js.UndefOr[xhrDashMockLib.libMockResponseMod.default]]
    ]
  ]
}
