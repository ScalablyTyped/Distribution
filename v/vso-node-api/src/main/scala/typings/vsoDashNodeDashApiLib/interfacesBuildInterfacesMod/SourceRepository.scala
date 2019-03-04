package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRepository extends js.Object {
  /**
    * The name of the default branch.
    */
  var defaultBranch: java.lang.String
  /**
    * The full name of the repository.
    */
  var fullName: java.lang.String
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
    * The name of the source provider the repository is from.
    */
  var sourceProviderName: java.lang.String
  /**
    * The URL of the repository.
    */
  var url: java.lang.String
}

object SourceRepository {
  @scala.inline
  def apply(
    defaultBranch: java.lang.String,
    fullName: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    sourceProviderName: java.lang.String,
    url: java.lang.String
  ): SourceRepository = {
    val __obj = js.Dynamic.literal(defaultBranch = defaultBranch, fullName = fullName, id = id, name = name, properties = properties, sourceProviderName = sourceProviderName, url = url)
  
    __obj.asInstanceOf[SourceRepository]
  }
}

