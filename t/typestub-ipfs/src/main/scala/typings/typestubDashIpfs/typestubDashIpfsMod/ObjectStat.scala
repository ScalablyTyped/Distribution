package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectStat extends js.Object {
  var BlockSize: Double
  var CumulativeSize: Double
  var DataSize: Double
  var Hash: Multihash
  var LinksSize: Double
  var NumLinks: Double
}

object ObjectStat {
  @scala.inline
  def apply(
    BlockSize: Double,
    CumulativeSize: Double,
    DataSize: Double,
    Hash: Multihash,
    LinksSize: Double,
    NumLinks: Double
  ): ObjectStat = {
    val __obj = js.Dynamic.literal(BlockSize = BlockSize, CumulativeSize = CumulativeSize, DataSize = DataSize, Hash = Hash.asInstanceOf[js.Any], LinksSize = LinksSize, NumLinks = NumLinks)
  
    __obj.asInstanceOf[ObjectStat]
  }
}

