package typings.tabris

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// File
/**
  * Represents raw data of a given type and name.
  */
trait File
  extends StObject
     with Blob {
  
  /**
    * Unix timestamp of the last known modification of the file
    * @constant
    */
  val lastModified: Double
  
  /**
    * The name or path of the file
    * @constant
    */
  val name: String
}
object File {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    lastModified: Double,
    name: String,
    size: Double,
    text: () => js.Promise[String],
    `type`: String
  ): File = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
