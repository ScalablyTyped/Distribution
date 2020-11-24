package typings.textToSvg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LoadCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* textToSVG */ typings.textToSvg.mod.TextToSVG | scala.Null, 
    scala.Unit
  ]
}
