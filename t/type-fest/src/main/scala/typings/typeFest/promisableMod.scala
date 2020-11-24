package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("type-fest/source/promisable", JSImport.Namespace)
@js.native
object promisableMod extends js.Object {
  
  type Promisable[T] = T | js.Thenable[T]
}
