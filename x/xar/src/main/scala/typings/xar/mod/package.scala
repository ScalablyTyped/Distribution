package typings.xar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExtractCallback = js.Function3[
    /* error */ typings.std.Error | scala.Null, 
    /* file */ typings.std.Record[java.lang.String, js.Any], 
    /* content */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type GetTOCCallback = js.Function4[
    /* error */ typings.std.Error | scala.Null, 
    /* xmlBuffer */ typings.node.Buffer, 
    /* json */ typings.std.Record[java.lang.String, js.Any], 
    /* header */ typings.xar.mod.TOCHeader, 
    scala.Unit
  ]
}
