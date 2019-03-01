package typings
package thriftLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object thriftMod {
  type TTransportCallback = js.Function2[
    /* msg */ js.UndefOr[nodeLib.Buffer], 
    /* seqid */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
}
