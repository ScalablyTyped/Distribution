package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CloneOptions extends js.Object {
  /**
       * If set to true requirements will be cloned
       */
  var cloneRequirements: scala.Boolean
  /**
       * copy all suites from a source plan
       */
  var copyAllSuites: scala.Boolean
  /**
       * copy ancestor hieracrchy
       */
  var copyAncestorHierarchy: scala.Boolean
  /**
       * Name of the workitem type of the clone
       */
  var destinationWorkItemType: java.lang.String
  /**
       * Key value pairs where the key value is overridden by the value.
       */
  var overrideParameters: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
       * Comment on the link that will link the new clone  test case to the original Set null for no comment
       */
  var relatedLinkComment: java.lang.String
}

