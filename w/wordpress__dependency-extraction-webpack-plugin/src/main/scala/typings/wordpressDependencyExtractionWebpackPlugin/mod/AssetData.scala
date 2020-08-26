package typings.wordpressDependencyExtractionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetData extends js.Object {
  /**
    * The script dependencies
    */
  var dependencies: js.Array[String] = js.native
  /**
    * String representing a particular build
    */
  var version: String = js.native
}

object AssetData {
  @scala.inline
  def apply(dependencies: js.Array[String], version: String): AssetData = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetData]
  }
  @scala.inline
  implicit class AssetDataOps[Self <: AssetData] (val x: Self) extends AnyVal {
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
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

