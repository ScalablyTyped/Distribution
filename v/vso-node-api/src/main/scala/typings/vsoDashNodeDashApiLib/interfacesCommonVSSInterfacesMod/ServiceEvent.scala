package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEvent extends js.Object {
  /**
    * This is the id of the type. Constants that will be used by subscribers to identify/filter events being published on a topic.
    */
  var eventType: java.lang.String
  /**
    * This is the service that published this event.
    */
  var publisher: Publisher
  /**
    * The resource object that carries specific information about the event. The object must have the ServiceEventObject applied for serialization/deserialization to work.
    */
  var resource: js.Any
  /**
    * This dictionary carries the context descriptors along with their ids.
    */
  var resourceContainers: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * This is the version of the resource.
    */
  var resourceVersion: java.lang.String
}

