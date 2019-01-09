package typings
package thriftLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object thriftMod {
  type TClientConstructor[TClient] = thriftLib.Anon_Output[TClient] | thriftLib.Anon_Client[TClient]
  type TProcessorConstructor[TProcessor, THandler] = (thriftLib.Anon_Handler[THandler, TProcessor]) | (thriftLib.Anon_Processor[THandler, TProcessor])
  type TTransportCallback = js.Function2[
    /* msg */ js.UndefOr[nodeLib.Buffer], 
    /* seqid */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
