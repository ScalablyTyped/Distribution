package typings.tslint.walkerWalkerMod

import typings.tslint.walkContextMod.WalkContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/language/walker/walker", "AbstractWalker")
@js.native
abstract class AbstractWalker[T] ()
  extends WalkContext[T]
     with IWalker
