package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvnMappingDetails extends js.Object {
  /**
    * The depth.
    */
  var depth: Double = js.native
  /**
    * Indicates whether to ignore externals.
    */
  var ignoreExternals: Boolean = js.native
  /**
    * The local path.
    */
  var localPath: String = js.native
  /**
    * The revision.
    */
  var revision: String = js.native
  /**
    * The server path.
    */
  var serverPath: String = js.native
}

object SvnMappingDetails {
  @scala.inline
  def apply(depth: Double, ignoreExternals: Boolean, localPath: String, revision: String, serverPath: String): SvnMappingDetails = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], ignoreExternals = ignoreExternals.asInstanceOf[js.Any], localPath = localPath.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvnMappingDetails]
  }
  @scala.inline
  implicit class SvnMappingDetailsOps[Self <: SvnMappingDetails] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreExternals(value: Boolean): Self = this.set("ignoreExternals", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalPath(value: String): Self = this.set("localPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerPath(value: String): Self = this.set("serverPath", value.asInstanceOf[js.Any])
  }
  
}

