package typings.atWordpressBlob

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blob", JSImport.Namespace)
@js.native
object atWordpressBlobMod extends js.Object {
  def createBlobURL(file: File): String = js.native
  def getBlobByURL(url: String): js.UndefOr[File] = js.native
  def isBlobURL(url: String): Boolean = js.native
  def revokeBlobURL(url: String): Unit = js.native
}

