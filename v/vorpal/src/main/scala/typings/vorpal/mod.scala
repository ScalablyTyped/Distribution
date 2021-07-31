package typings.vorpal

import org.scalablytyped.runtime.StringDictionary
import typings.vorpal.anon.Call
import typings.vorpal.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vorpal", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Vorpal
  
  @JSImport("vorpal", "Catch")
  @js.native
  class Catch () extends Command
  
  @JSImport("vorpal", "Command")
  @js.native
  class Command () extends StObject {
    
    var _cancel: js.UndefOr[Cancel] = js.native
    
    def _fn(args: Args): js.Promise[Unit] = js.native
    @JSName("_fn")
    var _fn_Original: Action = js.native
    
    var _name: String = js.native
    
    def action(action: Action): this.type = js.native
    
    def alias(command: String): this.type = js.native
    
    def allowUnknownOptions(): this.type = js.native
    
    def autocomplete(values: js.Array[String]): this.type = js.native
    def autocomplete(values: Data): this.type = js.native
    
    def cancel(cancel: Cancel): this.type = js.native
    
    def help(value: js.Function1[/* args */ Args, Unit]): this.type = js.native
    
    def hidden(): this.type = js.native
    
    def option(option: String, description: String): this.type = js.native
    def option(option: String, description: String, autocomplete: js.Array[String]): this.type = js.native
    
    def parse(value: js.Function2[/* command */ String, /* args */ Args, String]): this.type = js.native
    
    def remove(): this.type = js.native
    
    def types(types: typings.vorpal.anon.String): this.type = js.native
    
    def validate(value: js.Function1[/* args */ Args, Boolean | String]): this.type = js.native
  }
  
  @JSImport("vorpal", "CommandInstance")
  @js.native
  class CommandInstance () extends StObject {
    
    def delimiter(value: String): Unit = js.native
    
    def log(value: String, values: String*): Unit = js.native
    
    def prompt(prompt: js.Array[js.Object]): js.Promise[PromptObject] = js.native
    def prompt(prompt: js.Object): js.Promise[PromptObject] = js.native
  }
  
  @JSImport("vorpal", "Extension")
  @js.native
  class Extension () extends StObject
  
  @JSImport("vorpal", "UI")
  @js.native
  class UI () extends StObject {
    
    def cancel(): Unit = js.native
    
    def delimiter(): String = js.native
    def delimiter(text: String): String = js.native
    
    def imprint(): Unit = js.native
    
    def input(): String = js.native
    def input(text: String): String = js.native
    
    def redraw(text: String, texts: String*): Unit = js.native
    @JSName("redraw")
    var redraw_Original: Call = js.native
    
    def submit(command: String): String = js.native
  }
  
  type Action = js.Function1[/* args */ Args, js.Promise[Unit]]
  
  trait Args
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var options: StringDictionary[js.Any]
  }
  object Args {
    
    @scala.inline
    def apply(options: StringDictionary[js.Any]): Args = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type Cancel = js.Function0[Unit]
  
  type PromptObject = StringDictionary[js.Any]
  
  @js.native
  trait Vorpal extends StObject {
    
    var activeCommand: CommandInstance = js.native
    
    def `catch`(command: String): Catch = js.native
    def `catch`(command: String, description: String): Catch = js.native
    
    def command(command: String): Command = js.native
    def command(command: String, description: String): Command = js.native
    
    def delimiter(value: String): this.type = js.native
    
    def exec(command: String): js.Promise[js.Object] = js.native
    
    def execSync(command: String): js.Promise[js.Object] = js.native
    
    def find(command: String): Command = js.native
    
    def help(value: js.Function1[/* cmd */ String, String]): this.type = js.native
    
    def hide(): this.type = js.native
    
    def history(id: String): this.type = js.native
    
    def localStorage(id: String): js.Object = js.native
    
    def log(value: String, values: String*): this.type = js.native
    
    def parse(argv: js.Array[String]): this.type = js.native
    
    def pipe(value: js.Function1[/* stdout */ String, String]): this.type = js.native
    
    def show(): this.type = js.native
    
    def sigint(value: js.Function0[Unit]): this.type = js.native
    
    var ui: UI = js.native
    
    def use(`extension`: Extension): this.type = js.native
    
    def version(version: String): this.type = js.native
  }
}
