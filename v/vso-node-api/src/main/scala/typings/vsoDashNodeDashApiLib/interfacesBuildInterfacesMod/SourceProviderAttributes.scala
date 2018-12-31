package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceProviderAttributes extends js.Object {
  /**
    * The name of the source provider.
    */
  var name: java.lang.String
  /**
    * The capabilities supported by this source provider.
    */
  var supportedCapabilities: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  /**
    * The types of triggers supported by this source provider.
    */
  var supportedTriggers: js.Array[SupportedTrigger]
}

