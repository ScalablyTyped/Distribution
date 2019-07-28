package typings.atUifabricUtilities

import typings.atUifabricUtilities.Anon_DefaultRender
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIComponentAsMod {
  type IComponentAs[T] = ComponentType[IComponentAsProps[T]]
  type IComponentAsProps[T] = T with Anon_DefaultRender[T]
}
