package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectStat extends js.Object {
  var BlockSize: scala.Double
  var CumulativeSize: scala.Double
  var DataSize: scala.Double
  var Hash: Multihash
  var LinksSize: scala.Double
  var NumLinks: scala.Double
}

object ObjectStat {
  @scala.inline
  def apply(
    BlockSize: scala.Double,
    CumulativeSize: scala.Double,
    DataSize: scala.Double,
    Hash: Multihash,
    LinksSize: scala.Double,
    NumLinks: scala.Double
  ): ObjectStat = {
    val __obj = js.Dynamic.literal(BlockSize = BlockSize, CumulativeSize = CumulativeSize, DataSize = DataSize, Hash = Hash.asInstanceOf[js.Any], LinksSize = LinksSize, NumLinks = NumLinks)
  
    __obj.asInstanceOf[ObjectStat]
  }
}

