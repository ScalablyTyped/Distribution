package typings.yargs

import typings.yargs.commandMod.CommandInstance
import typings.yargs.usageMod.UsageInstance
import typings.yargs.yargsMod.YargsInstance
import typings.yargsParser.mod.Arguments
import typings.yargsParser.mod.DetailedArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completionMod {
  
  @JSImport("yargs/build/lib/completion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def completion(yargs: YargsInstance, usage: UsageInstance, command: CommandInstance): CompletionInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("completion")(yargs.asInstanceOf[js.Any], usage.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[CompletionInstance]
  
  type AsyncCompletionFunction = js.Function3[
    /* current */ String, 
    /* argv */ Arguments, 
    /* done */ js.Function1[/* completions */ js.Array[String], js.Any], 
    js.Any
  ]
  
  type CompletionFunction = SyncCompletionFunction | AsyncCompletionFunction
  
  trait CompletionInstance extends StObject {
    
    var completionKey: String
    
    def generateCompletionScript($0: String, cmd: String): String
    
    def getCompletion(args: js.Array[String], done: js.Function1[/* completions */ js.Array[String], js.Any]): js.Any
    
    def registerFunction(fn: CompletionFunction): Unit
    
    def setParsed(parsed: DetailedArguments): Unit
  }
  object CompletionInstance {
    
    inline def apply(
      completionKey: String,
      generateCompletionScript: (String, String) => String,
      getCompletion: (js.Array[String], js.Function1[/* completions */ js.Array[String], js.Any]) => js.Any,
      registerFunction: CompletionFunction => Unit,
      setParsed: DetailedArguments => Unit
    ): CompletionInstance = {
      val __obj = js.Dynamic.literal(completionKey = completionKey.asInstanceOf[js.Any], generateCompletionScript = js.Any.fromFunction2(generateCompletionScript), getCompletion = js.Any.fromFunction2(getCompletion), registerFunction = js.Any.fromFunction1(registerFunction), setParsed = js.Any.fromFunction1(setParsed))
      __obj.asInstanceOf[CompletionInstance]
    }
    
    extension [Self <: CompletionInstance](x: Self) {
      
      inline def setCompletionKey(value: String): Self = StObject.set(x, "completionKey", value.asInstanceOf[js.Any])
      
      inline def setGenerateCompletionScript(value: (String, String) => String): Self = StObject.set(x, "generateCompletionScript", js.Any.fromFunction2(value))
      
      inline def setGetCompletion(value: (js.Array[String], js.Function1[/* completions */ js.Array[String], js.Any]) => js.Any): Self = StObject.set(x, "getCompletion", js.Any.fromFunction2(value))
      
      inline def setRegisterFunction(value: CompletionFunction => Unit): Self = StObject.set(x, "registerFunction", js.Any.fromFunction1(value))
      
      inline def setSetParsed(value: DetailedArguments => Unit): Self = StObject.set(x, "setParsed", js.Any.fromFunction1(value))
    }
  }
  
  type SyncCompletionFunction = js.Function2[
    /* current */ String, 
    /* argv */ Arguments, 
    js.Array[String] | js.Promise[js.Array[String]]
  ]
}
