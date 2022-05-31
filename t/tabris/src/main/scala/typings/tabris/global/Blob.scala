package typings.tabris.global

import typings.std.ArrayBuffer
import typings.tabris.anon.`31`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Blob
/**
  * Represents raw data of a given type.
  */
@JSGlobal("Blob")
@js.native
class Blob ()
  extends StObject
     with typings.tabris.Blob {
  def this(blobParts: js.Array[js.Any]) = this()
  def this(blobParts: js.Array[js.Any], options: `31`) = this()
  def this(blobParts: Unit, options: `31`) = this()
  
  /**
    * Reads the blob data into an ArrayBuffer and returns it in a promise. Each call creates a new
    * in-memory copy of the data.
    */
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  
  /**
    * Size of the blob data in bytes
    * @constant
    */
  /* CompleteClass */
  override val size: Double = js.native
  
  /**
    * Decodes the blob data as a string and returns it in a promise.
    */
  /* CompleteClass */
  override def text(): js.Promise[String] = js.native
  
  /**
    * The MIME type of the blob data
    * @constant
    */
  /* CompleteClass */
  override val `type`: String = js.native
}
