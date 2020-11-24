package typings.websequencediagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type diagramCallback = js.Function3[
    /* error */ typings.std.Error | scala.Null, 
    /* buffer */ js.UndefOr[typings.node.Buffer], 
    /* mimeType */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type diagramUrlCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* url */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
