package typings.wordpressBlob

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/blob", "createBlobURL")
  @js.native
  def createBlobURL(file: File): String = js.native
  
  @JSImport("@wordpress/blob", "getBlobByURL")
  @js.native
  def getBlobByURL(url: String): js.UndefOr[File] = js.native
  
  @JSImport("@wordpress/blob", "getBlobTypeByURL")
  @js.native
  def getBlobTypeByURL(url: String): js.UndefOr[String] = js.native
  
  @JSImport("@wordpress/blob", "isBlobURL")
  @js.native
  def isBlobURL(url: String): Boolean = js.native
  
  @JSImport("@wordpress/blob", "revokeBlobURL")
  @js.native
  def revokeBlobURL(url: String): Unit = js.native
}
