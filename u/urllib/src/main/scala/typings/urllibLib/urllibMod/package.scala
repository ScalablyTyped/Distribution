package typings
package urllibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urllibMod {
  type Callback[T] = js.Function3[
    /* err */ stdLib.Error, 
    /* data */ T, 
    /* res */ nodeLib.httpMod.IncomingMessage, 
    scala.Unit
  ]
}
