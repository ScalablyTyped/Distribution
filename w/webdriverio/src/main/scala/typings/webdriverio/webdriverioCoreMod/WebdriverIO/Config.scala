package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options * / any, 'capabilities'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options * / any[P]} */ trait Config
  extends StObject
     with Options
     with Hooks {
  
  var runnerEnv: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  /**
    * internal usage only. To run in watch mode see https://webdriver.io/docs/watcher.html
    */
  var watch: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunnerEnv(value: Record[String, js.Any]): Self = StObject.set(x, "runnerEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunnerEnvUndefined: Self = StObject.set(x, "runnerEnv", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
