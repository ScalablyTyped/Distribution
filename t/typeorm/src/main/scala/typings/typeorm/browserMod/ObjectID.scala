package typings.typeorm.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "ObjectID")
@js.native
class ObjectID ()
  extends typings.typeorm.typingsMod.ObjectID {
  def this(s: String) = this()
  def this(s: scala.Double) = this()
}
/* static members */
@JSImport("typeorm/browser", "ObjectID")
@js.native
object ObjectID extends js.Object {
  
  /**
    * Creates an ObjectID from a hex string representation of an ObjectID.
    */
  def createFromHexString(hexString: String): typings.typeorm.typingsMod.ObjectID = js.native
  
  /**
    * Creates an ObjectID from a second based number, with the rest of the ObjectID zeroed out. Used for comparisons or sorting the ObjectID.
    */
  def createFromTime(time: scala.Double): typings.typeorm.typingsMod.ObjectID = js.native
  
  /**
    * Checks if a value is a valid bson ObjectId.
    */
  def isValid(id: js.Any): Boolean = js.native
}
