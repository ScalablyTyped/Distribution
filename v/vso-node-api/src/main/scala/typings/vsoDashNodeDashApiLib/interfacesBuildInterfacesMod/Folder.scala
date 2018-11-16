package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Folder extends js.Object {
  /**
       * The process or person who created the folder.
       */
  var createdBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * The date the folder was created.
       */
  var createdOn: stdLib.Date
  /**
       * The description.
       */
  var description: java.lang.String
  /**
       * The process or person that last changed the folder.
       */
  var lastChangedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * The date the folder was last changed.
       */
  var lastChangedDate: stdLib.Date
  /**
       * The full path.
       */
  var path: java.lang.String
  /**
       * The project.
       */
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
}

