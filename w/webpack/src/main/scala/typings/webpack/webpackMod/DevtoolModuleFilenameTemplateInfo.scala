package typings.webpack.webpackMod

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
    val __obj = js.Dynamic.literal(absoluteResourcePath = absoluteResourcePath, allLoaders = allLoaders, hash = hash, identifier = identifier, moduleId = moduleId, query = query, resource = resource, resourcePath = resourcePath, shortIdentifier = shortIdentifier)
  
    __obj.asInstanceOf[DevtoolModuleFilenameTemplateInfo]
  }
}

