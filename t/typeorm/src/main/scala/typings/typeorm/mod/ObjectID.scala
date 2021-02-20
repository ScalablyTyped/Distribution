package typings.typeorm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "ObjectID")
@js.native
class ObjectID ()
  extends typings.typeorm.mongodbTypingsMod.ObjectID {
  def this(s: String) = this()
  def this(s: scala.Double) = this()
}
/* static members */
object ObjectID {
  
  /**
    * Creates an ObjectID from a hex string representation of an ObjectID.
    */
  @JSImport("typeorm", "ObjectID.createFromHexString")
  @js.native
  def createFromHexString(hexString: String): typings.typeorm.mongodbTypingsMod.ObjectID = js.native
  
  /**
    * Creates an ObjectID from a second based number, with the rest of the ObjectID zeroed out. Used for comparisons or sorting the ObjectID.
    */
  @JSImport("typeorm", "ObjectID.createFromTime")
  @js.native
  def createFromTime(time: scala.Double): typings.typeorm.mongodbTypingsMod.ObjectID = js.native
  
  /**
    * Checks if a value is a valid bson ObjectId.
    */
  @JSImport("typeorm", "ObjectID.isValid")
  @js.native
  def isValid(id: js.Any): Boolean = js.native
}
