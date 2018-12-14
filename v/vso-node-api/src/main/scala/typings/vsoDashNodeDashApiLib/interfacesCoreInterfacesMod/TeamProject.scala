package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TeamProject extends TeamProjectReference {
  /**
       * The links to other objects related to this object.
       */
  var _links: js.Any
  /**
       * Set of capabilities this project has (such as process template & version control).
       */
  var capabilities: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  /**
       * The shallow ref to the default team.
       */
  var defaultTeam: WebApiTeamRef
}

