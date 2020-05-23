package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/opaque", JSImport.Namespace)
@js.native
object opaqueMod extends js.Object {
  type Opaque[Type] = Type with typings.typeFest.anon.Opaque
}

