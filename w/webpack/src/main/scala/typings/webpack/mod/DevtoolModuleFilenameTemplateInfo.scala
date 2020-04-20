package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevtoolModuleFilenameTemplateInfo extends js.Object {
  var absoluteResourcePath: String
  var allLoaders: js.Array[_]
  var hash: String
  var identifier: String
  var moduleId: String
  var query: String
  var resource: js.Any
  var resourcePath: String
  var shortIdentifier: String
}

object DevtoolModuleFilenameTemplateInfo {
  @scala.inline
  def apply(
    absoluteResourcePath: String,
    allLoaders: js.Array[_],
    hash: String,
    identifier: String,
    moduleId: String,
    query: String,
    resource: js.Any,
    resourcePath: String,
    shortIdentifier: String
  ): DevtoolModuleFilenameTemplateInfo = {
    val __obj = js.Dynamic.literal(absoluteResourcePath = absoluteResourcePath.asInstanceOf[js.Any], allLoaders = allLoaders.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], shortIdentifier = shortIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevtoolModuleFilenameTemplateInfo]
  }
}

