package typings
package twitLib.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TwitNs {
  type Callback = js.Function3[
    /* err */ nodeLib.Error, 
    /* result */ Response, 
    /* response */ nodeLib.httpMod.IncomingMessage, 
    scala.Unit
  ]
  type Response = js.Object
  type StreamEndpoint = twitLib.twitLibStrings.`statuses/filter` | twitLib.twitLibStrings.`statuses/sample` | twitLib.twitLibStrings.`statuses/firehose` | twitLib.twitLibStrings.user | twitLib.twitLibStrings.site
}
