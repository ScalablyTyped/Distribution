package typings.webpackErrorNotification

import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-error-notification", JSImport.Namespace)
  @js.native
  /**
    * You can supply some strategy for the plugin to display notification.
    * If you don't supply anything, it will use process.platform as a strategy name.
    * `darwin` and `linux` are supported out of the box now.
    * You can also supply function(msg) {} as a strategy that will use your notification CLI tool of choice.
    */
  open class ^ ()
    extends StObject
       with WebpackErrorNotificationPlugin {
    def this(strategy: Strategy) = this()
    def this(strategy: Unit, options: Options) = this()
    def this(strategy: Strategy, options: Options) = this()
    
    /* CompleteClass */
    override def compilationDone(stats: Stats): Unit = js.native
    
    /* CompleteClass */
    override def compileMessage(stats: Stats): String = js.native
  }
  
  trait Options extends StObject {
    
    /** if you do not want to notify warnings, set this to `false` */
    var notifyWarnings: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNotifyWarnings(value: Boolean): Self = StObject.set(x, "notifyWarnings", value.asInstanceOf[js.Any])
      
      inline def setNotifyWarningsUndefined: Self = StObject.set(x, "notifyWarnings", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackErrorNotification.webpackErrorNotificationStrings.darwin
    - typings.webpackErrorNotification.webpackErrorNotificationStrings.linux
    - js.Function1[/ * msg * / java.lang.String, scala.Unit]
  */
  type Strategy = _Strategy | (js.Function1[/* msg */ String, Unit])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait WebpackErrorNotificationPlugin extends StObject {
    
    def compilationDone(stats: Stats): Unit
    
    def compileMessage(stats: Stats): String
  }
  object WebpackErrorNotificationPlugin {
    
    inline def apply(compilationDone: Stats => Unit, compileMessage: Stats => String): WebpackErrorNotificationPlugin = {
      val __obj = js.Dynamic.literal(compilationDone = js.Any.fromFunction1(compilationDone), compileMessage = js.Any.fromFunction1(compileMessage))
      __obj.asInstanceOf[WebpackErrorNotificationPlugin]
    }
    
    extension [Self <: WebpackErrorNotificationPlugin](x: Self) {
      
      inline def setCompilationDone(value: Stats => Unit): Self = StObject.set(x, "compilationDone", js.Any.fromFunction1(value))
      
      inline def setCompileMessage(value: Stats => String): Self = StObject.set(x, "compileMessage", js.Any.fromFunction1(value))
    }
  }
  
  trait _Strategy extends StObject
}
