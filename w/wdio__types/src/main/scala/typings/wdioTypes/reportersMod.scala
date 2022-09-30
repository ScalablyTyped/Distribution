package typings.wdioTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.WriteStream
import typings.wdioTypes.anon.PartialOptions
import typings.wdioTypes.anon.Write
import typings.wdioTypes.mod.global.WebdriverIO.ReporterOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportersMod {
  
  trait Options
    extends StObject
       with /**
    * allow random typings from 3rd party reporters
    */
  /* key */ StringDictionary[Any] {
    
    var logFile: js.UndefOr[String] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var setLogFile: js.UndefOr[js.Function2[/* cid */ String, /* name */ String, String]] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    var writeStream: js.UndefOr[WriteStream | Write] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLogFile(value: String): Self = StObject.set(x, "logFile", value.asInstanceOf[js.Any])
      
      inline def setLogFileUndefined: Self = StObject.set(x, "logFile", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setSetLogFile(value: (/* cid */ String, /* name */ String) => String): Self = StObject.set(x, "setLogFile", js.Any.fromFunction2(value))
      
      inline def setSetLogFileUndefined: Self = StObject.set(x, "setLogFile", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setWriteStream(value: WriteStream | Write): Self = StObject.set(x, "writeStream", value.asInstanceOf[js.Any])
      
      inline def setWriteStreamUndefined: Self = StObject.set(x, "writeStream", js.undefined)
    }
  }
  
  @js.native
  trait ReporterClass
    extends StObject
       with Instantiable1[/* options */ PartialOptions, ReporterInstance]
  
  type ReporterEntry = (/**
    * e.g. `services: ['@wdio/allure-reporter']`
    */
  String) | (/**
    * e.g. `services: [CustomReporter]`
    */
  ReporterClass) | (js.Tuple2[ReporterClass | String, ReporterOption])
  
  @js.native
  trait ReporterInstance extends EventEmitter {
    
    var isSynchronised: Boolean = js.native
  }
}
