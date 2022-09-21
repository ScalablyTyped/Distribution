package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullProperties
  extends StObject
     with Properties {
  
  var AppVersion: js.UndefOr[String] = js.undefined
  
  var Application: js.UndefOr[String] = js.undefined
  
  var ContentStatus: js.UndefOr[String] = js.undefined
  
  var DocSecurity: js.UndefOr[String] = js.undefined
  
  var HyperlinksChanged: js.UndefOr[Boolean] = js.undefined
  
  var Identifier: js.UndefOr[String] = js.undefined
  
  var Language: js.UndefOr[String] = js.undefined
  
  var LastPrinted: js.UndefOr[String] = js.undefined
  
  var LinksUpToDate: js.UndefOr[Boolean] = js.undefined
  
  var ModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  var Revision: js.UndefOr[String | Double] = js.undefined
  
  var ScaleCrop: js.UndefOr[Boolean] = js.undefined
  
  var SharedDoc: js.UndefOr[Boolean] = js.undefined
  
  var SheetNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var Version: js.UndefOr[String] = js.undefined
  
  var Worksheets: js.UndefOr[Double] = js.undefined
}
object FullProperties {
  
  inline def apply(): FullProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullProperties]
  }
  
  extension [Self <: FullProperties](x: Self) {
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "AppVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "AppVersion", js.undefined)
    
    inline def setApplication(value: String): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
    
    inline def setContentStatus(value: String): Self = StObject.set(x, "ContentStatus", value.asInstanceOf[js.Any])
    
    inline def setContentStatusUndefined: Self = StObject.set(x, "ContentStatus", js.undefined)
    
    inline def setDocSecurity(value: String): Self = StObject.set(x, "DocSecurity", value.asInstanceOf[js.Any])
    
    inline def setDocSecurityUndefined: Self = StObject.set(x, "DocSecurity", js.undefined)
    
    inline def setHyperlinksChanged(value: Boolean): Self = StObject.set(x, "HyperlinksChanged", value.asInstanceOf[js.Any])
    
    inline def setHyperlinksChangedUndefined: Self = StObject.set(x, "HyperlinksChanged", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    inline def setLastPrinted(value: String): Self = StObject.set(x, "LastPrinted", value.asInstanceOf[js.Any])
    
    inline def setLastPrintedUndefined: Self = StObject.set(x, "LastPrinted", js.undefined)
    
    inline def setLinksUpToDate(value: Boolean): Self = StObject.set(x, "LinksUpToDate", value.asInstanceOf[js.Any])
    
    inline def setLinksUpToDateUndefined: Self = StObject.set(x, "LinksUpToDate", js.undefined)
    
    inline def setModifiedDate(value: js.Date): Self = StObject.set(x, "ModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "ModifiedDate", js.undefined)
    
    inline def setRevision(value: String | Double): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
    
    inline def setScaleCrop(value: Boolean): Self = StObject.set(x, "ScaleCrop", value.asInstanceOf[js.Any])
    
    inline def setScaleCropUndefined: Self = StObject.set(x, "ScaleCrop", js.undefined)
    
    inline def setSharedDoc(value: Boolean): Self = StObject.set(x, "SharedDoc", value.asInstanceOf[js.Any])
    
    inline def setSharedDocUndefined: Self = StObject.set(x, "SharedDoc", js.undefined)
    
    inline def setSheetNames(value: js.Array[String]): Self = StObject.set(x, "SheetNames", value.asInstanceOf[js.Any])
    
    inline def setSheetNamesUndefined: Self = StObject.set(x, "SheetNames", js.undefined)
    
    inline def setSheetNamesVarargs(value: String*): Self = StObject.set(x, "SheetNames", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    inline def setWorksheets(value: Double): Self = StObject.set(x, "Worksheets", value.asInstanceOf[js.Any])
    
    inline def setWorksheetsUndefined: Self = StObject.set(x, "Worksheets", js.undefined)
  }
}
