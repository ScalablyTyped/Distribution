package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BuildRepository extends js.Object {
  /**
       * Indicates whether to checkout submodules.
       */
  var checkoutSubmodules: scala.Boolean
  /**
       * Indicates whether to clean the target folder when getting code from the repository.
       */
  var clean: java.lang.String
  /**
       * The name of the default branch.
       */
  var defaultBranch: java.lang.String
  /**
       * The ID of the repository.
       */
  var id: java.lang.String
  /**
       * The friendly name of the repository.
       */
  var name: java.lang.String
  var properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
       * The root folder.
       */
  var rootFolder: java.lang.String
  /**
       * The type of the repository.
       */
  var `type`: java.lang.String
  /**
       * The URL of the repository.
       */
  var url: java.lang.String
}

