package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRepository extends js.Object {
  /**
    * The name of the default branch.
    */
  var defaultBranch: String
  /**
    * The full name of the repository.
    */
  var fullName: String
  /**
    * The ID of the repository.
    */
  var id: String
  /**
    * The friendly name of the repository.
    */
  var name: String
  var properties: StringDictionary[String]
  /**
    * The name of the source provider the repository is from.
    */
  var sourceProviderName: String
  /**
    * The URL of the repository.
    */
  var url: String
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
    val __obj = js.Dynamic.literal(defaultBranch = defaultBranch, fullName = fullName, id = id, name = name, properties = properties, sourceProviderName = sourceProviderName, url = url)
  
    __obj.asInstanceOf[SourceRepository]
  }
}

