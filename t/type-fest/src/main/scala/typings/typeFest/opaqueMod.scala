package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("type-fest/source/opaque", JSImport.Namespace)
@js.native
object opaqueMod extends js.Object {
  
  type Opaque[Type] = Type with typings.typeFest.anon.Opaque
}
