package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionSourceProvider extends js.Object {
  /**
    * Uri of the associated definition
    */
  var definitionUri: java.lang.String
  /**
    * fields associated with this build definition
    */
  var fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Id of this source provider
    */
  var id: scala.Double
  /**
    * The lst time this source provider was modified
    */
  var lastModified: stdLib.Date
  /**
    * Name of the source provider
    */
  var name: java.lang.String
  /**
    * Which trigger types are supported by this definition source provider
    */
  var supportedTriggerTypes: DefinitionTriggerType
}

object BuildDefinitionSourceProvider {
  @scala.inline
  def apply(
    definitionUri: java.lang.String,
    fields: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    id: scala.Double,
    lastModified: stdLib.Date,
    name: java.lang.String,
    supportedTriggerTypes: DefinitionTriggerType
  ): BuildDefinitionSourceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definitionUri")(definitionUri)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lastModified")(lastModified)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("supportedTriggerTypes")(supportedTriggerTypes)
    __obj.asInstanceOf[BuildDefinitionSourceProvider]
  }
}

