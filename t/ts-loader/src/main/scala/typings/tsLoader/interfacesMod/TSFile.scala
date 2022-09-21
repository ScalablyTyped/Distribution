package typings.tsLoader.interfacesMod

import typings.tsLoader.anon.OutputFileName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSFile extends StObject {
  
  var fileName: String
  
  var modifiedTime: js.UndefOr[js.Date] = js.undefined
  
  var projectReference: js.UndefOr[OutputFileName] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var version: Double
}
object TSFile {
  
  inline def apply(fileName: String, version: Double): TSFile = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSFile]
  }
  
  extension [Self <: TSFile](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setModifiedTime(value: js.Date): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    
    inline def setProjectReference(value: OutputFileName): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
    
    inline def setProjectReferenceUndefined: Self = StObject.set(x, "projectReference", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
