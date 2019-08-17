package typings.atUifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIRenderFunctionMod {
  import typings.react.reactMod.Global.JSXNs.Element

  type IRenderFunction[P] = js.Function2[
    /* props */ js.UndefOr[P], 
    /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[P], Element | Null]], 
    Element | Null
  ]
}
