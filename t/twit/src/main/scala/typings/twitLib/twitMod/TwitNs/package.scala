package typings
package twitLib.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TwitNs {
  type Callback = js.Function3[
    /* err */ stdLib.Error, 
    /* result */ Response, 
    /* response */ nodeLib.httpMod.IncomingMessage, 
    scala.Unit
  ]
  type Response = js.Object
}
