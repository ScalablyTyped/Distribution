package typings
package wordcloudLib.wordcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WordCloudNs {
  type EventCallback = js.Function3[
    /* item */ ListEntry, 
    /* dimension */ Dimension, 
    /* event */ stdLib.MouseEvent, 
    scala.Unit
  ]
  type ListEntry = js.Tuple2[java.lang.String, scala.Double]
}
