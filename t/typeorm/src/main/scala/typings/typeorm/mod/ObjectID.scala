package typings.typeorm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("typeorm", "ObjectID")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an ObjectID from a hex string representation of an ObjectID.
    */
  inline def createFromHexString(hexString: String): typings.typeorm.mongodbTypingsMod.ObjectID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.mongodbTypingsMod.ObjectID]
  
  /**
    * Creates an ObjectID from a second based number, with the rest of the ObjectID zeroed out. Used for comparisons or sorting the ObjectID.
    */
  inline def createFromTime(time: scala.Double): typings.typeorm.mongodbTypingsMod.ObjectID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[typings.typeorm.mongodbTypingsMod.ObjectID]
  
  /**
    * Checks if a value is a valid bson ObjectId.
    */
  inline def isValid(id: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
