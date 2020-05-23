package typings.useSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderPropMod {
  type CombinedProps[T /* <: js.Array[_] */, K] = typings.useSidecar.anon.Children[T] with K
  type RenderPropComponent[T /* <: js.Array[_] */, K] = typings.react.mod.ComponentType[typings.useSidecar.renderPropMod.CombinedProps[T, K]]
}
