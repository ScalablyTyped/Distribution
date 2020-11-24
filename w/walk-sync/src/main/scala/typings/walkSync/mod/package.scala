package typings.walkSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Optionalize[T, K /* <: /* keyof T */ java.lang.String */] = (typings.std.Omit[T, K]) with (typings.std.Partial[typings.std.Pick[T, K]])
}
