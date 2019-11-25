package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionSourceProvider extends js.Object {
  /**
    * Uri of the associated definition
    */
  var definitionUri: String
  /**
    * fields associated with this build definition
    */
  var fields: StringDictionary[String]
  /**
    * Id of this source provider
    */
  var id: Double
  /**
    * The lst time this source provider was modified
    */
  var lastModified: Date
  /**
    * Name of the source provider
    */
  var name: String
  /**
    * Which trigger types are supported by this definition source provider
    */
  var supportedTriggerTypes: DefinitionTriggerType
}

object BuildDefinitionSourceProvider {
  @scala.inline
  def apply(
    definitionUri: String,
    fields: StringDictionary[String],
    id: Double,
    lastModified: Date,
    name: String,
    supportedTriggerTypes: DefinitionTriggerType
  ): BuildDefinitionSourceProvider = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedTriggerTypes = supportedTriggerTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildDefinitionSourceProvider]
  }
}

