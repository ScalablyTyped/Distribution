package typings.wdioTypes

import typings.node.eventsMod.EventEmitter
import typings.std.Record
import typings.wdioTypes.anon.IsMultiremote
import typings.wdioTypes.capabilitiesMod.DesiredCapabilities
import typings.wdioTypes.capabilitiesMod.MultiRemoteCapabilities
import typings.wdioTypes.capabilitiesMod.RemoteCapability
import typings.wdioTypes.capabilitiesMod.W3CCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workersMod {
  
  trait Job extends StObject {
    
    var caps: DesiredCapabilities | W3CCapabilities | MultiRemoteCapabilities
    
    var hasTests: Boolean
    
    var specs: js.Array[String]
  }
  object Job {
    
    inline def apply(
      caps: DesiredCapabilities | W3CCapabilities | MultiRemoteCapabilities,
      hasTests: Boolean,
      specs: js.Array[String]
    ): Job = {
      val __obj = js.Dynamic.literal(caps = caps.asInstanceOf[js.Any], hasTests = hasTests.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    extension [Self <: Job](x: Self) {
      
      inline def setCaps(value: DesiredCapabilities | W3CCapabilities | MultiRemoteCapabilities): Self = StObject.set(x, "caps", value.asInstanceOf[js.Any])
      
      inline def setHasTests(value: Boolean): Self = StObject.set(x, "hasTests", value.asInstanceOf[js.Any])
      
      inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @wdio/types.@wdio/types/build/Options.Testrunner, 'capabilities' | 'specs'> ]: @wdio/types.@wdio/types/build/Options.Testrunner[P]} */ @js.native
  trait Worker extends EventEmitter {
    
    var capabilities: RemoteCapability = js.native
    
    var caps: RemoteCapability = js.native
    
    var cid: String = js.native
    
    var isBusy: js.UndefOr[Boolean] = js.native
    
    def postMessage(command: String, args: WorkerMessageArgs): Unit = js.native
    
    var sessionId: js.UndefOr[String] = js.native
    
    var specs: js.Array[String] = js.native
  }
  
  /* Inlined parent std.Omit<@wdio/types.@wdio/types/build/Workers.WorkerRunPayload, 'execArgv'> */
  trait WorkerCommand extends StObject {
    
    var args: Any
    
    var caps: RemoteCapability
    
    var cid: String
    
    var command: String
    
    var configFile: String
    
    var retries: Double
    
    var specs: js.Array[String]
  }
  object WorkerCommand {
    
    inline def apply(
      args: Any,
      caps: RemoteCapability,
      cid: String,
      command: String,
      configFile: String,
      retries: Double,
      specs: js.Array[String]
    ): WorkerCommand = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], caps = caps.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerCommand]
    }
    
    extension [Self <: WorkerCommand](x: Self) {
      
      inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setCaps(value: RemoteCapability): Self = StObject.set(x, "caps", value.asInstanceOf[js.Any])
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value*))
    }
  }
  
  trait WorkerMessage extends StObject {
    
    var content: IsMultiremote
    
    var name: String
    
    var origin: String
    
    var params: Record[String, String]
  }
  object WorkerMessage {
    
    inline def apply(content: IsMultiremote, name: String, origin: String, params: Record[String, String]): WorkerMessage = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerMessage]
    }
    
    extension [Self <: WorkerMessage](x: Self) {
      
      inline def setContent(value: IsMultiremote): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Record[String, String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@wdio/types.@wdio/types/build/Workers.Job, 'caps' | 'specs' | 'hasTests'> */
  trait WorkerMessageArgs extends StObject
  
  type WorkerPool = Record[String, Worker]
  
  trait WorkerRunPayload extends StObject {
    
    var caps: RemoteCapability
    
    var cid: String
    
    var configFile: String
    
    var execArgv: js.Array[String]
    
    var retries: Double
    
    var specs: js.Array[String]
  }
  object WorkerRunPayload {
    
    inline def apply(
      caps: RemoteCapability,
      cid: String,
      configFile: String,
      execArgv: js.Array[String],
      retries: Double,
      specs: js.Array[String]
    ): WorkerRunPayload = {
      val __obj = js.Dynamic.literal(caps = caps.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], execArgv = execArgv.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerRunPayload]
    }
    
    extension [Self <: WorkerRunPayload](x: Self) {
      
      inline def setCaps(value: RemoteCapability): Self = StObject.set(x, "caps", value.asInstanceOf[js.Any])
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setSpecs(value: js.Array[String]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsVarargs(value: String*): Self = StObject.set(x, "specs", js.Array(value*))
    }
  }
}
