package typings.typescript.mod

import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeArray[T /* <: Node */]
  extends StObject
     with ReadonlyArray[T]
     with ReadonlyTextRange {
  
  var hasTrailingComma: js.UndefOr[Boolean] = js.native
}
