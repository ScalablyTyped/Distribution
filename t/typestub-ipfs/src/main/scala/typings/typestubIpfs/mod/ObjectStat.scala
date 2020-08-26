package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectStat extends js.Object {
  var BlockSize: Double = js.native
  var CumulativeSize: Double = js.native
  var DataSize: Double = js.native
  var Hash: Multihash = js.native
  var LinksSize: Double = js.native
  var NumLinks: Double = js.native
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
  @scala.inline
  implicit class ObjectStatOps[Self <: ObjectStat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("BlockSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCumulativeSize(value: Double): Self = this.set("CumulativeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSize(value: Double): Self = this.set("DataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: Multihash): Self = this.set("Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinksSize(value: Double): Self = this.set("LinksSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumLinks(value: Double): Self = this.set("NumLinks", value.asInstanceOf[js.Any])
  }
  
}

