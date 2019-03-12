package typings
package websequencediagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websequencediagramsMod {
  type diagramCallback = js.Function3[
    /* error */ stdLib.Error | scala.Null, 
    /* buffer */ js.UndefOr[nodeLib.Buffer], 
    /* mimeType */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type diagramUrlCallback = js.Function2[
    /* error */ stdLib.Error | scala.Null, 
    /* url */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
