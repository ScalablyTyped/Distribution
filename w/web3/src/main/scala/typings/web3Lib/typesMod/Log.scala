package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  var address: java.lang.String
  var blockHash: java.lang.String
  var blockNumber: scala.Double
  var data: java.lang.String
  var logIndex: scala.Double
  var topics: js.Array[java.lang.String]
  var transactionHash: java.lang.String
  var transactionIndex: scala.Double
}

object Log {
  @scala.inline
  def apply(
    address: java.lang.String,
    blockHash: java.lang.String,
    blockNumber: scala.Double,
    data: java.lang.String,
    logIndex: scala.Double,
    topics: js.Array[java.lang.String],
    transactionHash: java.lang.String,
    transactionIndex: scala.Double
  ): Log = {
    val __obj = js.Dynamic.literal(address = address, blockHash = blockHash, blockNumber = blockNumber, data = data, logIndex = logIndex, topics = topics, transactionHash = transactionHash, transactionIndex = transactionIndex)
  
    __obj.asInstanceOf[Log]
  }
}

