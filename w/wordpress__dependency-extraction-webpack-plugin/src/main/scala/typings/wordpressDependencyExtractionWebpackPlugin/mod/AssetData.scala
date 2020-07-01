package typings.wordpressDependencyExtractionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetData extends js.Object {
  /**
    * The script dependencies
    */
  var dependencies: js.Array[String]
  /**
    * String representing a particular build
    */
  var version: String
}

object AssetData {
  @scala.inline
  def apply(dependencies: js.Array[String], version: String): AssetData = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetData]
  }
}

