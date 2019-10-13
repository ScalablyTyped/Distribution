package typings.atUifabricUtilities

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/IRenderFunction", JSImport.Namespace)
@js.native
object libIRenderFunctionMod extends js.Object {
  type IRenderFunction[P] = js.Function2[
    /* props */ js.UndefOr[P], 
    /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[P], Element | Null]], 
    Element | Null
  ]
}

