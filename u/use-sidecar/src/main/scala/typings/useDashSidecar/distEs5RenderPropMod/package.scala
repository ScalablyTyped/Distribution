package typings.useDashSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEs5RenderPropMod {
  import typings.react.reactMod.ComponentType
  import typings.useDashSidecar.Anon_Children

  type CombinedProps[T /* <: js.Array[_] */, K] = Anon_Children[T] with K
  type RenderPropComponent[T /* <: js.Array[_] */, K] = ComponentType[CombinedProps[T, K]]
}
