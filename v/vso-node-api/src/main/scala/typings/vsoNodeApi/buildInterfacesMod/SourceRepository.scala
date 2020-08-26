package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceRepository extends js.Object {
  /**
    * The name of the default branch.
    */
  var defaultBranch: String = js.native
  /**
    * The full name of the repository.
    */
  var fullName: String = js.native
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
    * The name of the source provider the repository is from.
    */
  var sourceProviderName: String = js.native
  /**
    * The URL of the repository.
    */
  var url: String = js.native
}

object SourceRepository {
  @scala.inline
  def apply(
    defaultBranch: String,
    fullName: String,
    id: String,
    name: String,
    properties: StringDictionary[String],
    sourceProviderName: String,
    url: String
  ): SourceRepository = {
    val __obj = js.Dynamic.literal(defaultBranch = defaultBranch.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sourceProviderName = sourceProviderName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRepository]
  }
  @scala.inline
  implicit class SourceRepositoryOps[Self <: SourceRepository] (val x: Self) extends AnyVal {
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
    def setDefaultBranch(value: String): Self = this.set("defaultBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceProviderName(value: String): Self = this.set("sourceProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

