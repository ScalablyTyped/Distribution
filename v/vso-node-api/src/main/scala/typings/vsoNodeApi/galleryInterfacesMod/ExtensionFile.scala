package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionFile extends StObject {
  
  var assetType: String = js.native
  
  var language: String = js.native
  
  var source: String = js.native
}
object ExtensionFile {
  
  @scala.inline
  def apply(assetType: String, language: String, source: String): ExtensionFile = {
    val __obj = js.Dynamic.literal(assetType = assetType.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFile]
  }
  
  @scala.inline
  implicit class ExtensionFileMutableBuilder[Self <: ExtensionFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
