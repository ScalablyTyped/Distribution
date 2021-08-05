package typings.wordpressBlob

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/blob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlobURL(file: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlobURL")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBlobByURL(url: String): js.UndefOr[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlobByURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[File]]
  
  inline def getBlobTypeByURL(url: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlobTypeByURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def isBlobURL(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlobURL")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def revokeBlobURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeBlobURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
