package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Lookup value.
  */
trait LookupValue extends js.Object {
  /**
    * Type of the entity.
    */
  var entityType: java.lang.String
  /**
    * The identifier.
    */
  var id: java.lang.String
  /**
    * The name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

