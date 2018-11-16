package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WebApiProject extends TeamProjectReference {
  /**
       * Set of capabilities this project has
       */
  var capabilities: ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[java.lang.String]]
  /**
       * Reference to collection which contains this project
       */
  var collection: WebApiProjectCollectionRef
  /**
       * Default team for this project
       */
  var defaultTeam: WebApiTeamRef
}

