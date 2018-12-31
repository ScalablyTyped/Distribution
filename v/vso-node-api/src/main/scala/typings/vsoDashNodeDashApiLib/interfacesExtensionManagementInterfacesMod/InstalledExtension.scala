package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledExtension extends ExtensionManifest {
  /**
    * The friendly extension id for this extension - unique for a given publisher.
    */
  var extensionId: java.lang.String
  /**
    * The display name of the extension.
    */
  var extensionName: java.lang.String
  /**
    * This is the set of files available from the extension.
    */
  var files: js.Array[vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionFile]
  /**
    * Extension flags relevant to contribution consumers
    */
  var flags: ExtensionFlags
  /**
    * Information about this particular installation of the extension
    */
  var installState: InstalledExtensionState
  /**
    * This represents the date/time the extensions was last updated in the gallery. This doesnt mean this version was updated the value represents changes to any and all versions of the extension.
    */
  var lastPublished: stdLib.Date
  /**
    * Unique id of the publisher of this extension
    */
  var publisherId: java.lang.String
  /**
    * The display name of the publisher
    */
  var publisherName: java.lang.String
  /**
    * Unique id for this extension (the same id is used for all versions of a single extension)
    */
  var registrationId: java.lang.String
  /**
    * Version of this extension
    */
  var version: java.lang.String
}

