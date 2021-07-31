package typings.yargs

import typings.yargs.commonTypesMod.NotEmptyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseCommandMod {
  
  @JSImport("yargs/build/lib/parse-command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseCommand(cmd: String): ParsedCommand = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCommand")(cmd.asInstanceOf[js.Any]).asInstanceOf[ParsedCommand]
  
  trait ParsedCommand extends StObject {
    
    var cmd: String
    
    var demanded: js.Array[Positional]
    
    var optional: js.Array[Positional]
  }
  object ParsedCommand {
    
    @scala.inline
    def apply(cmd: String, demanded: js.Array[Positional], optional: js.Array[Positional]): ParsedCommand = {
      val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], demanded = demanded.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedCommand]
    }
    
    @scala.inline
    implicit class ParsedCommandMutableBuilder[Self <: ParsedCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemanded(value: js.Array[Positional]): Self = StObject.set(x, "demanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDemandedVarargs(value: Positional*): Self = StObject.set(x, "demanded", js.Array(value :_*))
      
      @scala.inline
      def setOptional(value: js.Array[Positional]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalVarargs(value: Positional*): Self = StObject.set(x, "optional", js.Array(value :_*))
    }
  }
  
  trait Positional extends StObject {
    
    var cmd: NotEmptyArray[String]
    
    var variadic: Boolean
  }
  object Positional {
    
    @scala.inline
    def apply(cmd: NotEmptyArray[String], variadic: Boolean): Positional = {
      val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], variadic = variadic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Positional]
    }
    
    @scala.inline
    implicit class PositionalMutableBuilder[Self <: Positional] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmd(value: NotEmptyArray[String]): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariadic(value: Boolean): Self = StObject.set(x, "variadic", value.asInstanceOf[js.Any])
    }
  }
}
