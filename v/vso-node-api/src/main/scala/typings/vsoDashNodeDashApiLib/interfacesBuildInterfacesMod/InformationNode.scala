package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InformationNode extends js.Object {
  /**
       * Fields of the information node
       */
  var fields: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
       * Process or person that last modified this node
       */
  var lastModifiedBy: java.lang.String
  /**
       * Date this node was last modified
       */
  var lastModifiedDate: stdLib.Date
  /**
       * Node Id of this information node
       */
  var nodeId: scala.Double
  /**
       * Id of parent node (xml tree)
       */
  var parentId: scala.Double
  /**
       * The type of the information node
       */
  var `type`: java.lang.String
}

