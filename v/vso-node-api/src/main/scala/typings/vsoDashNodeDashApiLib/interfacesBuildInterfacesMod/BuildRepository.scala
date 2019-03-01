package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildRepository extends js.Object {
  /**
    * Indicates whether to checkout submodules.
    */
  var checkoutSubmodules: scala.Boolean
  /**
    * Indicates whether to clean the target folder when getting code from the repository.
    */
  var clean: java.lang.String
  /**
    * The name of the default branch.
    */
  var defaultBranch: java.lang.String
  /**
    * The ID of the repository.
    */
  var id: java.lang.String
  /**
    * The friendly name of the repository.
    */
  var name: java.lang.String
  var properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * The root folder.
    */
  var rootFolder: java.lang.String
  /**
    * The type of the repository.
    */
  var `type`: java.lang.String
  /**
    * The URL of the repository.
    */
  var url: java.lang.String
}

object BuildRepository {
  @scala.inline
  def apply(
    checkoutSubmodules: scala.Boolean,
    clean: java.lang.String,
    defaultBranch: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    rootFolder: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): BuildRepository = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("checkoutSubmodules")(checkoutSubmodules)
    __obj.updateDynamic("clean")(clean)
    __obj.updateDynamic("defaultBranch")(defaultBranch)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("rootFolder")(rootFolder)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BuildRepository]
  }
}

