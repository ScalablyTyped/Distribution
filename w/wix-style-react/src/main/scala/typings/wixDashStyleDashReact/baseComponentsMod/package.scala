package typings.wixDashStyleDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object baseComponentsMod {
  import typings.react.reactMod.PureComponent

  type WixComponent[T /* <: WixComponentProps */] = PureComponent[T, js.Object, js.Any]
}
