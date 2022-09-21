package typings.winVersionInfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(file: String): VersionInfo = ^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any]).asInstanceOf[VersionInfo]
  
  @JSImport("win-version-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait VersionInfo extends StObject {
    
    var BuildID: js.UndefOr[String] = js.undefined
    
    var CompanyName: js.UndefOr[String] = js.undefined
    
    var FileDescription: js.UndefOr[String] = js.undefined
    
    var FileVersion: js.UndefOr[String] = js.undefined
    
    var InternalName: js.UndefOr[String] = js.undefined
    
    var LegalCopyright: js.UndefOr[String] = js.undefined
    
    var LegalTrademarks: js.UndefOr[String] = js.undefined
    
    var OriginalFilename: js.UndefOr[String] = js.undefined
    
    var ProductName: js.UndefOr[String] = js.undefined
    
    var ProductVersion: js.UndefOr[String] = js.undefined
  }
  object VersionInfo {
    
    inline def apply(): VersionInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VersionInfo]
    }
    
    extension [Self <: VersionInfo](x: Self) {
      
      inline def setBuildID(value: String): Self = StObject.set(x, "BuildID", value.asInstanceOf[js.Any])
      
      inline def setBuildIDUndefined: Self = StObject.set(x, "BuildID", js.undefined)
      
      inline def setCompanyName(value: String): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
      
      inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
      
      inline def setFileDescription(value: String): Self = StObject.set(x, "FileDescription", value.asInstanceOf[js.Any])
      
      inline def setFileDescriptionUndefined: Self = StObject.set(x, "FileDescription", js.undefined)
      
      inline def setFileVersion(value: String): Self = StObject.set(x, "FileVersion", value.asInstanceOf[js.Any])
      
      inline def setFileVersionUndefined: Self = StObject.set(x, "FileVersion", js.undefined)
      
      inline def setInternalName(value: String): Self = StObject.set(x, "InternalName", value.asInstanceOf[js.Any])
      
      inline def setInternalNameUndefined: Self = StObject.set(x, "InternalName", js.undefined)
      
      inline def setLegalCopyright(value: String): Self = StObject.set(x, "LegalCopyright", value.asInstanceOf[js.Any])
      
      inline def setLegalCopyrightUndefined: Self = StObject.set(x, "LegalCopyright", js.undefined)
      
      inline def setLegalTrademarks(value: String): Self = StObject.set(x, "LegalTrademarks", value.asInstanceOf[js.Any])
      
      inline def setLegalTrademarksUndefined: Self = StObject.set(x, "LegalTrademarks", js.undefined)
      
      inline def setOriginalFilename(value: String): Self = StObject.set(x, "OriginalFilename", value.asInstanceOf[js.Any])
      
      inline def setOriginalFilenameUndefined: Self = StObject.set(x, "OriginalFilename", js.undefined)
      
      inline def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
      
      inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
      
      inline def setProductVersion(value: String): Self = StObject.set(x, "ProductVersion", value.asInstanceOf[js.Any])
      
      inline def setProductVersionUndefined: Self = StObject.set(x, "ProductVersion", js.undefined)
    }
  }
}
