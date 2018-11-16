package typings
package tabtabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabtabMod {
  type CallBack = js.Function3[
    /* error */ js.UndefOr[stdLib.Error], 
    /* data */ js.UndefOr[Data], 
    /* text */ js.UndefOr[java.lang.String], 
    js.Any
  ]
}
