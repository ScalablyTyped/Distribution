package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIComponentAsMod {
  type IComponentAs[T] = reactLib.reactMod.ReactNs.ComponentType[IComponentAsProps[T]]
  type IComponentAsProps[T] = T with atUifabricUtilitiesLib.Anon_DefaultRender[T]
}
