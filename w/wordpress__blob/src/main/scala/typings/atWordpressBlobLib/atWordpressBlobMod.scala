package typings
package atWordpressBlobLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blob", JSImport.Namespace)
@js.native
object atWordpressBlobMod extends js.Object {
  def createBlobURL(file: stdLib.File): java.lang.String = js.native
  def getBlobByURL(url: java.lang.String): js.UndefOr[stdLib.File] = js.native
  def isBlobURL(url: java.lang.String): scala.Boolean = js.native
  def revokeBlobURL(url: java.lang.String): scala.Unit = js.native
}

