package typings.typescript.mod

import typings.std.ReadonlyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeArray[T /* <: Node */]
  extends ReadonlyArray[T]
     with TextRange {
  var hasTrailingComma: js.UndefOr[Boolean] = js.native
}

