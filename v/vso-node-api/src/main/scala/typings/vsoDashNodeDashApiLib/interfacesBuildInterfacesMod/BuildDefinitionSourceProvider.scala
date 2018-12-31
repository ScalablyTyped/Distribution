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

