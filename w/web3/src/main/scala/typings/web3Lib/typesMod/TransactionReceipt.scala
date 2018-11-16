package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransactionReceipt extends js.Object {
  var blockHash: java.lang.String
  var blockNumber: scala.Double
  var contractAddress: java.lang.String
  var cumulativeGasUsed: scala.Double
  var events: js.UndefOr[ScalablyTyped.runtime.StringDictionary[EventLog]] = js.undefined
  var from: java.lang.String
  var gasUsed: scala.Double
  var logs: js.UndefOr[js.Array[Log]] = js.undefined
  var status: scala.Boolean
  var to: java.lang.String
  var transactionHash: java.lang.String
  var transactionIndex: scala.Double
}

