package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventLog extends js.Object {
  var address: java.lang.String
  var blockHash: java.lang.String
  var blockNumber: scala.Double
  var event: java.lang.String
  var logIndex: scala.Double
  var raw: js.UndefOr[web3Lib.Anon_Data] = js.undefined
  var returnValues: js.Any
  var transactionHash: java.lang.String
  var transactionIndex: scala.Double
}

