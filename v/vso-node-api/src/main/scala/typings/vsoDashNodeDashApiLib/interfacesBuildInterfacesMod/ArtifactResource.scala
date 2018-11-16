package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ArtifactResource extends js.Object {
  var _links: js.Any
  /**
       * Type-specific data about the artifact.
       */
  var data: java.lang.String
  /**
       * A link to download the resource.
       */
  var downloadUrl: java.lang.String
  /**
       * Type-specific properties of the artifact.
       */
  var properties: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
       * The type of the resource: File container, version control folder, UNC path, etc.
       */
  var `type`: java.lang.String
  /**
       * The full http link to the resource.
       */
  var url: java.lang.String
}

