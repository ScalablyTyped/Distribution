package typings.web3Core.mod

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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], logIndex = logIndex.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

