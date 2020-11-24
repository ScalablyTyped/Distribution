package typings.typeFest

import typings.std.Extract
import typings.typeFest.exceptMod.Except
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("type-fest/source/merge", JSImport.Namespace)
@js.native
object mergeMod extends js.Object {
  
  type Merge[FirstType, SecondType] = (Except[FirstType, Extract[/* keyof FirstType */ String, /* keyof SecondType */ String]]) with SecondType
}
