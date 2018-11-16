package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIRenderFunctionMod {
  type IRenderFunction[P] = js.Function2[
    /* props */ js.UndefOr[P], 
    /* defaultRender */ js.UndefOr[
      js.Function1[/* props */ js.UndefOr[P], reactLib.reactMod.Global.JSXNs.Element | scala.Null]
    ], 
    reactLib.reactMod.Global.JSXNs.Element | scala.Null
  ]
}
