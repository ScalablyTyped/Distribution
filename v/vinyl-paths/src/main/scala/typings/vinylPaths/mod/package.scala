package typings.vinylPaths

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function1[/* path */ java.lang.String, js.Any]
  
  type PathsStatic = js.Function1[
    /* callback */ js.UndefOr[typings.vinylPaths.mod.Callback], 
    typings.vinylPaths.mod.Paths
  ]
}
