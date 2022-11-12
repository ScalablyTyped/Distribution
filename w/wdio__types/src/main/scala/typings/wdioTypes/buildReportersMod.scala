package typings.wdioTypes

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.fsMod.WriteStream
import typings.wdioTypes.anon.PartialOptions
import typings.wdioTypes.anon.Write
import typings.wdioTypes.buildCapabilitiesMod.RemoteCapability
import typings.wdioTypes.mod.global.WebdriverIO.ReporterOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildReportersMod {
  
  trait Options
    extends StObject
       with /**
    * allow random typings from 3rd party reporters
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Complete path of the reporter log file. If `setLogFile` is defined, it will
      * be used instead of this option.
      */
    var logFile: js.UndefOr[String] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    /**
      * Define the filename format for the reporter log files, using the `cid` and
      * `capabilities`. `setLogFile` and `logFile` take precedence over this
      * option, if defined (in that order).
      *
      * > Note: `options.capabilities` is your capabilities object for that runner, so specifying
      * `${options.capabilities}` in your string will return [Object object]. You must specify which
      * properties of capabilities you want in your filename.
      *
      * @default `wdio-${cid}-${name}-reporter.log`
      *
      * @example
      * outputFileFormat: function (options) {
      *     const { cid, capabilities } = options
      *     const { browserName } = capabilities
      *     return `wdio-${cid}-${browserName}-reporter.log`
      * }
      */
    var outputFileFormat: js.UndefOr[js.Function1[/* options */ OutputFileFormatOptions, String]] = js.undefined
    
    /**
      * Set the complete path for the reporter's log output, using `cid` and
      * the reporter's `name`.
      */
    var setLogFile: js.UndefOr[js.Function2[/* cid */ String, /* name */ String, String]] = js.undefined
    
    /**
      * No log file will be created if this option is set to `true`.
      */
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Write to `writeStream` instead of a file.
      *
      * Note: `logFile` must not be set, unless `stdout` is set to `true`.
      */
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
  
  trait OutputFileFormatOptions extends StObject {
    
    var capabilities: RemoteCapability
    
    var cid: String
  }
  object OutputFileFormatOptions {
    
    inline def apply(capabilities: RemoteCapability, cid: String): OutputFileFormatOptions = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFileFormatOptions]
    }
    
    extension [Self <: OutputFileFormatOptions](x: Self) {
      
      inline def setCapabilities(value: RemoteCapability): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
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
