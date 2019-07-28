package typings.thrift

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object thriftMod {
  type HttpHeaders = StringDictionary[js.UndefOr[Double | String | js.Array[String]]]
  type SeqId2Service = NumberDictionary[String]
  type ServiceMap[TProcessor, THandler] = StringDictionary[ServerOptions[TProcessor, THandler]]
  type TTransportCallback = js.Function2[/* msg */ js.UndefOr[Buffer], /* seqid */ js.UndefOr[Double], Unit]
}
