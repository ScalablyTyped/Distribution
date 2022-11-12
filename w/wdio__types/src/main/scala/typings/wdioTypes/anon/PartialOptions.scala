package typings.wdioTypes.anon

import typings.node.fsMod.WriteStream
import typings.wdioTypes.buildReportersMod.OutputFileFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wdio/types.@wdio/types/build/Reporters.Options> */
trait PartialOptions extends StObject {
  
  var logFile: js.UndefOr[String] = js.undefined
  
  var outputDir: js.UndefOr[String] = js.undefined
  
  var outputFileFormat: js.UndefOr[js.Function1[/* options */ OutputFileFormatOptions, String]] = js.undefined
  
  var setLogFile: js.UndefOr[js.Function2[/* cid */ String, /* name */ String, String]] = js.undefined
  
  var stdout: js.UndefOr[Boolean] = js.undefined
  
  var writeStream: js.UndefOr[WriteStream | Write] = js.undefined
}
object PartialOptions {
  
  inline def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  extension [Self <: PartialOptions](x: Self) {
    
    inline def setLogFile(value: String): Self = StObject.set(x, "logFile", value.asInstanceOf[js.Any])
    
    inline def setLogFileUndefined: Self = StObject.set(x, "logFile", js.undefined)
    
    inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
    
    inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
    
    inline def setOutputFileFormat(value: /* options */ OutputFileFormatOptions => String): Self = StObject.set(x, "outputFileFormat", js.Any.fromFunction1(value))
    
    inline def setOutputFileFormatUndefined: Self = StObject.set(x, "outputFileFormat", js.undefined)
    
    inline def setSetLogFile(value: (/* cid */ String, /* name */ String) => String): Self = StObject.set(x, "setLogFile", js.Any.fromFunction2(value))
    
    inline def setSetLogFileUndefined: Self = StObject.set(x, "setLogFile", js.undefined)
    
    inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    inline def setWriteStream(value: WriteStream | Write): Self = StObject.set(x, "writeStream", value.asInstanceOf[js.Any])
    
    inline def setWriteStreamUndefined: Self = StObject.set(x, "writeStream", js.undefined)
  }
}
