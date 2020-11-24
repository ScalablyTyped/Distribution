package typings.valerieBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Valerie {
  
  // callback interface (see mapModel above)
  type IncludePropertyCallback = js.Function3[/* value */ js.Any, /* sourceModel */ js.Any, /* index */ js.Any, scala.Boolean]
}
