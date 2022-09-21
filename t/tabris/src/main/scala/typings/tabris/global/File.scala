package typings.tabris.global

import typings.tabris.anon.LastModified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// File
/**
  * Represents raw data of a given type and name.
  */
@JSGlobal("File")
@js.native
open class File protected ()
  extends StObject
     with typings.tabris.File {
  /**
    * Represents raw data of a given type and name.
    */
  def this(blobParts: js.Array[Any], name: String) = this()
  def this(blobParts: js.Array[Any], name: String, options: LastModified) = this()
  
  /**
    * Reads the blob data into an ArrayBuffer and returns it in a promise. Each call creates a new
    * in-memory copy of the data.
    */
  /* CompleteClass */
  override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Unix timestamp of the last known modification of the file
    * @constant
    */
  /* CompleteClass */
  override val lastModified: Double = js.native
  
  /**
    * The name or path of the file
    * @constant
    */
  /* CompleteClass */
  override val name: String = js.native
  
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
