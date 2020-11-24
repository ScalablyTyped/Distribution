package typings.wordcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventCallback = js.Function3[
    /* item */ typings.wordcloud.mod.ListEntry, 
    /* dimension */ typings.wordcloud.mod.Dimension, 
    /* event */ typings.std.MouseEvent, 
    scala.Unit
  ]
  
  type ListEntry = js.Tuple2[java.lang.String, scala.Double]
}
