package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DefinitionReference extends js.Object {
  /**
       * The date the definition was created.
       */
  var createdDate: stdLib.Date
  /**
       * The ID of the referenced definition.
       */
  var id: scala.Double
  /**
       * The name of the referenced definition.
       */
  var name: java.lang.String
  /**
       * The folder path of the definition.
       */
  var path: java.lang.String
  /**
       * A reference to the project.
       */
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  /**
       * A value that indicates whether builds can be queued against this definition.
       */
  var queueStatus: DefinitionQueueStatus
  /**
       * The definition revision number.
       */
  var revision: scala.Double
  /**
       * The type of the definition.
       */
  var `type`: DefinitionType
  /**
       * The definition's URI.
       */
  var uri: java.lang.String
  /**
       * The REST URL of the definition.
       */
  var url: java.lang.String
}

