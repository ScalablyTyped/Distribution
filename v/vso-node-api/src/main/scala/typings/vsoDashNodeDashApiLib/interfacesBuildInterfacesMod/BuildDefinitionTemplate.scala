package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BuildDefinitionTemplate extends js.Object {
  /**
       * Indicates whether the template can be deleted.
       */
  var canDelete: scala.Boolean
  /**
       * The template category.
       */
  var category: java.lang.String
  /**
       * A description of the template.
       */
  var description: java.lang.String
  /**
       * The ID of the task whose icon is used when showing this template in the UI.
       */
  var iconTaskId: java.lang.String
  var icons: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
       * The ID of the template.
       */
  var id: java.lang.String
  /**
       * The name of the template.
       */
  var name: java.lang.String
  /**
       * The actual template.
       */
  var template: BuildDefinition
}

