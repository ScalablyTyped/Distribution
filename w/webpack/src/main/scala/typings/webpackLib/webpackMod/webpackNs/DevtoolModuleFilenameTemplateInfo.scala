package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevtoolModuleFilenameTemplateInfo extends js.Object {
  var absoluteResourcePath: java.lang.String
  var allLoaders: js.Array[_]
  var hash: java.lang.String
  var identifier: java.lang.String
  var moduleId: java.lang.String
  var query: java.lang.String
  var resource: js.Any
  var resourcePath: java.lang.String
  var shortIdentifier: java.lang.String
}

object DevtoolModuleFilenameTemplateInfo {
  @scala.inline
  def apply(
    absoluteResourcePath: java.lang.String,
    allLoaders: js.Array[_],
    hash: java.lang.String,
    identifier: java.lang.String,
    moduleId: java.lang.String,
    query: java.lang.String,
    resource: js.Any,
    resourcePath: java.lang.String,
    shortIdentifier: java.lang.String
  ): DevtoolModuleFilenameTemplateInfo = {
    val __obj = js.Dynamic.literal(absoluteResourcePath = absoluteResourcePath, allLoaders = allLoaders, hash = hash, identifier = identifier, moduleId = moduleId, query = query, resource = resource, resourcePath = resourcePath, shortIdentifier = shortIdentifier)
  
    __obj.asInstanceOf[DevtoolModuleFilenameTemplateInfo]
  }
}

