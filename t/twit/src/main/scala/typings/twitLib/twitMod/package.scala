package typings
package twitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitMod {
  type Callback = js.Function3[
    /* err */ stdLib.Error, 
    /* result */ Response, 
    /* response */ nodeLib.httpMod.IncomingMessage, 
    scala.Unit
  ]
  type Response = js.Object
}
