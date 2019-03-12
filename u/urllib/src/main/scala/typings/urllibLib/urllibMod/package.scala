package typings
package urllibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urllibMod {
  type Callback = js.Function3[
    /* err */ stdLib.Error, 
    /* data */ js.Any, 
    /* res */ nodeLib.httpMod.IncomingMessage, 
    scala.Unit
  ]
}
