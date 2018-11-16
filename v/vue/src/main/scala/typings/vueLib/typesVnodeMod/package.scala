package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesVnodeMod {
  type ScopedSlot = js.Function1[/* props */ js.Any, VNodeChildrenArrayContents | java.lang.String]
  type VNodeChildren = VNodeChildrenArrayContents | js.Array[ScopedSlot] | java.lang.String
}
