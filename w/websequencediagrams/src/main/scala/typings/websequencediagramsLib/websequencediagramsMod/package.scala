package typings
package websequencediagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websequencediagramsMod {
  type OutputType = websequencediagramsLib.websequencediagramsLibStrings.png | websequencediagramsLib.websequencediagramsLibStrings.svg | websequencediagramsLib.websequencediagramsLibStrings.pdf
  type Style = websequencediagramsLib.websequencediagramsLibStrings.default | websequencediagramsLib.websequencediagramsLibStrings.earth | websequencediagramsLib.websequencediagramsLibStrings.`modern-blue` | websequencediagramsLib.websequencediagramsLibStrings.mscgen | websequencediagramsLib.websequencediagramsLibStrings.omegapple | websequencediagramsLib.websequencediagramsLibStrings.qsd | websequencediagramsLib.websequencediagramsLibStrings.rose | websequencediagramsLib.websequencediagramsLibStrings.roundgreen | websequencediagramsLib.websequencediagramsLibStrings.napkin | websequencediagramsLib.websequencediagramsLibStrings.magazine | websequencediagramsLib.websequencediagramsLibStrings.vs2010 | websequencediagramsLib.websequencediagramsLibStrings.patent
  type diagramCallback = js.Function3[
    /* error */ nodeLib.Error | scala.Null, 
    /* buffer */ js.UndefOr[nodeLib.Buffer], 
    /* mimeType */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type diagramUrlCallback = js.Function2[
    /* error */ nodeLib.Error | scala.Null, 
    /* url */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
