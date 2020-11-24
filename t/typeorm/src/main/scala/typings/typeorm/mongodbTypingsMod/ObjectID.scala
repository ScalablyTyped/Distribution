package typings.typeorm.mongodbTypingsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "ObjectID")
@js.native
class ObjectID () extends js.Object {
  def this(s: String) = this()
  def this(s: scala.Double) = this()
  
  /**
    * Compares the equality of this ObjectID with otherID.
    */
  def equals(otherID: ObjectID): Boolean = js.native
  
  /**
    * Generate a 12 byte id buffer used in ObjectID's.
    */
  def generate(): String = js.native
  def generate(time: scala.Double): String = js.native
  
  /**
    * The generation time of this ObjectId instance.
    */
  var generationTime: scala.Double = js.native
  
  /**
    * Returns the generation date (accurate up to the second) that this ID was generated.
    *
    */
  def getTimestamp(): Date = js.native
  
  /**
    * Return the ObjectID id as a 24 byte hex string representation.
    */
  def toHexString(): String = js.native
}
/* static members */
@JSImport("typeorm/driver/mongodb/typings", "ObjectID")
@js.native
object ObjectID extends js.Object {
  
  /**
    * Creates an ObjectID from a hex string representation of an ObjectID.
    */
  def createFromHexString(hexString: String): ObjectID = js.native
  
  /**
    * Creates an ObjectID from a second based number, with the rest of the ObjectID zeroed out. Used for comparisons or sorting the ObjectID.
    */
  def createFromTime(time: scala.Double): ObjectID = js.native
  
  /**
    * Checks if a value is a valid bson ObjectId.
    */
  def isValid(id: js.Any): Boolean = js.native
}
