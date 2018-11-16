package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Attachment extends js.Object {
  /**
       * Links to other related objects.
       */
  var _links: js.Any
  /**
       * The person that uploaded this attachment.
       */
  var author: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
       * Content hash of on-disk representation of file content. Its calculated by the server by using SHA1 hash function.
       */
  var contentHash: java.lang.String
  /**
       * The time the attachment was uploaded.
       */
  var createdDate: stdLib.Date
  /**
       * The description of the attachment.
       */
  var description: java.lang.String
  /**
       * The display name of the attachment. Can't be null or empty.
       */
  var displayName: java.lang.String
  /**
       * Id of the attachment.
       */
  var id: scala.Double
  /**
       * Extended properties.
       */
  var properties: js.Any
  /**
       * The url to download the content of the attachment.
       */
  var url: java.lang.String
}

