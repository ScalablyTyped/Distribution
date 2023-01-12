package typings.webpackbar

import typings.webpack.mod.ProgressPlugin
import typings.webpackbar.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Elegant ProgressBar and Profiler for Webpack
    */
  @JSImport("webpackbar", JSImport.Namespace)
  @js.native
  open class ^ () extends WebpackBar {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Enable a simple log reporter (only start and end)
      * Defaults to 'true' when running in minimal environments
      * @default true
      */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Color output of the progress bar
      * @default 'green'
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Enable bars reporter
      * Defaults to 'true' when not in CI or testing mod
      * @default true
      */
    var fancy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Display name
      * @default 'webpack'
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Enable profiler
      * @default false
      */
    var profile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Register a custom reporter
      * @default null
      */
    var reporter: js.UndefOr[Reporter | Null] = js.undefined
    
    /**
      * Register an Array of your custom reporters.
      * @default ['basic'] | ['fancy']
      */
    var reporters: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFancy(value: Boolean): Self = StObject.set(x, "fancy", value.asInstanceOf[js.Any])
      
      inline def setFancyUndefined: Self = StObject.set(x, "fancy", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setReporter(value: Reporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterNull: Self = StObject.set(x, "reporter", null)
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setReporters(value: js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value*))
    }
  }
  
  /**
    * If you plan to provide your own reporter,
    * don't forget to setting fancy and basic options to false to prevent conflicts.
    * A reporter should be instance of a class or plain object and functions for special hooks.
    * It is not necessary to implement all functions, webpackbar only calls those that exists
    */
  trait Reporter extends StObject {
    
    var afterAllDone: js.UndefOr[ReporterContextFunc] = js.undefined
    
    /**
      * Called when _all_ compiles finished
      */
    var allDone: js.UndefOr[ReporterContextFunc] = js.undefined
    
    var beforeAllDone: js.UndefOr[ReporterContextFunc] = js.undefined
    
    /**
      * Called when a file changed on watch mode
      */
    var change: js.UndefOr[ReporterContextFunc] = js.undefined
    
    /**
      * Called when compile finished
      */
    var done: js.UndefOr[ReporterContextFunc] = js.undefined
    
    /**
      * Called when build progress updated
      */
    var progress: js.UndefOr[ReporterContextFunc] = js.undefined
    
    /**
      * Called when (re)compile is started
      */
    var start: js.UndefOr[ReporterContextFunc] = js.undefined
    
    /**
      * Called after each progress update
      */
    var update: js.UndefOr[ReporterContextFunc] = js.undefined
  }
  object Reporter {
    
    inline def apply(): Reporter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reporter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reporter] (val x: Self) extends AnyVal {
      
      inline def setAfterAllDone(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "afterAllDone", js.Any.fromFunction1(value))
      
      inline def setAfterAllDoneUndefined: Self = StObject.set(x, "afterAllDone", js.undefined)
      
      inline def setAllDone(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "allDone", js.Any.fromFunction1(value))
      
      inline def setAllDoneUndefined: Self = StObject.set(x, "allDone", js.undefined)
      
      inline def setBeforeAllDone(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "beforeAllDone", js.Any.fromFunction1(value))
      
      inline def setBeforeAllDoneUndefined: Self = StObject.set(x, "beforeAllDone", js.undefined)
      
      inline def setChange(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setDone(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setProgress(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setStart(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setUpdate(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /**
    * 'context' is the reference to the plugin
    * You can use 'context.state' to access status
    */
  type ReporterContextFunc = js.Function1[/* context */ WebpackBar, Unit]
  
  trait Status extends StObject {
    
    val color: String
    
    val details: js.Array[String]
    
    /** @default false */
    val done: Boolean
    
    /** @default false */
    val hasErrors: Boolean
    
    /** @default '' */
    val message: String
    
    val name: String
    
    /** @default -1 */
    val progress: Double
    
    val request: Null | File
    
    /** @default null */
    val start: (js.Tuple2[Double, Double]) | Null
  }
  object Status {
    
    inline def apply(
      color: String,
      details: js.Array[String],
      done: Boolean,
      hasErrors: Boolean,
      message: String,
      name: String,
      progress: Double
    ): Status = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], hasErrors = hasErrors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], request = null, start = null)
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setHasErrors(value: Boolean): Self = StObject.set(x, "hasErrors", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: File): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestNull: Self = StObject.set(x, "request", null)
      
      inline def setStart(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
    }
  }
  
  /**
    * Elegant ProgressBar and Profiler for Webpack
    */
  @js.native
  trait WebpackBar extends ProgressPlugin {
    
    val state: Status = js.native
  }
}
