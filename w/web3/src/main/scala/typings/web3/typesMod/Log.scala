package typings.web3.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  var address: String
  var blockHash: String
  var blockNumber: Double
  var data: String
  var logIndex: Double
  var topics: js.Array[String]
  var transactionHash: String
  var transactionIndex: Double
}

object Log {
  @scala.inline
  def apply(
    address: String,
    blockHash: String,
    blockNumber: Double,
    data: String,
    logIndex: Double,
    topics: js.Array[String],
    transactionHash: String,
    transactionIndex: Double
  ): Log = {
    val __obj = js.Dynamic.literal(address = address, blockHash = blockHash, blockNumber = blockNumber, data = data, logIndex = logIndex, topics = topics, transactionHash = transactionHash, transactionIndex = transactionIndex)
  
    __obj.asInstanceOf[Log]
  }
}

