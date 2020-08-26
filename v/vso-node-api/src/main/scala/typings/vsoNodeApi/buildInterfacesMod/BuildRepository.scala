package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildRepository extends js.Object {
  /**
    * Indicates whether to checkout submodules.
    */
  var checkoutSubmodules: Boolean = js.native
  /**
    * Indicates whether to clean the target folder when getting code from the repository.
    */
  var clean: String = js.native
  /**
    * The name of the default branch.
    */
  var defaultBranch: String = js.native
  /**
    * The ID of the repository.
    */
  var id: String = js.native
  /**
    * The friendly name of the repository.
    */
  var name: String = js.native
  var properties: StringDictionary[String] = js.native
  /**
    * The root folder.
    */
  var rootFolder: String = js.native
  /**
    * The type of the repository.
    */
  var `type`: String = js.native
  /**
    * The URL of the repository.
    */
  var url: String = js.native
}

object BuildRepository {
  @scala.inline
  def apply(
    checkoutSubmodules: Boolean,
    clean: String,
    defaultBranch: String,
    id: String,
    name: String,
    properties: StringDictionary[String],
    rootFolder: String,
    `type`: String,
    url: String
  ): BuildRepository = {
    val __obj = js.Dynamic.literal(checkoutSubmodules = checkoutSubmodules.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], defaultBranch = defaultBranch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRepository]
  }
  @scala.inline
  implicit class BuildRepositoryOps[Self <: BuildRepository] (val x: Self) extends AnyVal {
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
    def setCheckoutSubmodules(value: Boolean): Self = this.set("checkoutSubmodules", value.asInstanceOf[js.Any])
    @scala.inline
    def setClean(value: String): Self = this.set("clean", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultBranch(value: String): Self = this.set("defaultBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootFolder(value: String): Self = this.set("rootFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

