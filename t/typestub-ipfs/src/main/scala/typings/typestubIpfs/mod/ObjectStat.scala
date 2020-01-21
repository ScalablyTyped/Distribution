package typings.typestubIpfs.mod

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
    val __obj = js.Dynamic.literal(BlockSize = BlockSize.asInstanceOf[js.Any], CumulativeSize = CumulativeSize.asInstanceOf[js.Any], DataSize = DataSize.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], LinksSize = LinksSize.asInstanceOf[js.Any], NumLinks = NumLinks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectStat]
  }
}

