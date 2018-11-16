package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Block extends BlockHeader {
  var difficulty: scala.Double
  var size: scala.Double
  var totalDifficulty: scala.Double
  var transactions: js.Array[Transaction]
  var uncles: js.Array[java.lang.String]
}

