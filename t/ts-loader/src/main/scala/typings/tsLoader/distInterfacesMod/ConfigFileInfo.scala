package typings.tsLoader.distInterfacesMod

import typings.std.Map
import typings.tsLoader.anon.InputFileName
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFileInfo extends StObject {
  
  var config: js.UndefOr[ParsedCommandLine] = js.undefined
  
  var dtsFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var outputFileNames: js.UndefOr[Map[FilePathKey, InputFileName]] = js.undefined
  
  var tsbuildInfoFile: js.UndefOr[String] = js.undefined
}
object ConfigFileInfo {
  
  inline def apply(): ConfigFileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigFileInfo] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: ParsedCommandLine): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDtsFiles(value: js.Array[String]): Self = StObject.set(x, "dtsFiles", value.asInstanceOf[js.Any])
    
    inline def setDtsFilesUndefined: Self = StObject.set(x, "dtsFiles", js.undefined)
    
    inline def setDtsFilesVarargs(value: String*): Self = StObject.set(x, "dtsFiles", js.Array(value*))
    
    inline def setOutputFileNames(value: Map[FilePathKey, InputFileName]): Self = StObject.set(x, "outputFileNames", value.asInstanceOf[js.Any])
    
    inline def setOutputFileNamesUndefined: Self = StObject.set(x, "outputFileNames", js.undefined)
    
    inline def setTsbuildInfoFile(value: String): Self = StObject.set(x, "tsbuildInfoFile", value.asInstanceOf[js.Any])
    
    inline def setTsbuildInfoFileUndefined: Self = StObject.set(x, "tsbuildInfoFile", js.undefined)
  }
}
