package typings.tabris

import typings.std.ArrayBuffer
import typings.tabris.mod._ImageValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Blob
/**
  * Represents raw data of a given type.
  */
trait Blob
  extends StObject
     with _ImageValue {
  
  /**
    * Reads the blob data into an ArrayBuffer and returns it in a promise. Each call creates a new
    * in-memory copy of the data.
    */
  def arrayBuffer(): js.Promise[ArrayBuffer]
  
  /**
    * Size of the blob data in bytes
    * @constant
    */
  val size: Double
  
  /**
    * Decodes the blob data as a string and returns it in a promise.
    */
  def text(): js.Promise[String]
  
  /**
    * The MIME type of the blob data
    * @constant
    */
  val `type`: String
}
object Blob {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    size: Double,
    text: () => js.Promise[String],
    `type`: String
  ): Blob = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), size = size.asInstanceOf[js.Any], text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
  
  @scala.inline
  implicit class BlobMutableBuilder[Self <: Blob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayBuffer(value: () => js.Promise[ArrayBuffer]): Self = StObject.set(x, "arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
