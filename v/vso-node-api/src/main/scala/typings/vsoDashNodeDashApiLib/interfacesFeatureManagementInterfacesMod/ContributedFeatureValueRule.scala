package typings
package vsoDashNodeDashApiLib.interfacesFeatureManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributedFeatureValueRule extends js.Object {
  /**
    * Name of the IContributedFeatureValuePlugin to run
    */
  var name: java.lang.String
  /**
    * Properties to feed to the IContributedFeatureValuePlugin
    */
  var properties: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object ContributedFeatureValueRule {
  @scala.inline
  def apply(name: java.lang.String, properties: org.scalablytyped.runtime.StringDictionary[js.Any]): ContributedFeatureValueRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[ContributedFeatureValueRule]
  }
}

