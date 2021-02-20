package typings.webpackbar

import typings.webpackbar.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Elegant ProgressBar and Profiler for Webpack
    */
  @JSImport("webpackbar", JSImport.Namespace)
  @js.native
  class ^ () extends WebpackBar {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Enable a simple log reporter (only start and end)
      * Defaults to 'true' when running in minimal environments
      * @default true
      */
    var basic: js.UndefOr[Boolean] = js.native
    
    /**
      * Color output of the progress bar
      * @default 'green'
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Enable bars reporter
      * Defaults to 'true' when not in CI or testing mod
      * @default true
      */
    var fancy: js.UndefOr[Boolean] = js.native
    
    /**
      * Display name
      * @default 'webpack'
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Enable profiler
      * @default false
      */
    var profile: js.UndefOr[Boolean] = js.native
    
    /**
      * Register a custom reporter
      * @default null
      */
    var reporter: js.UndefOr[Reporter | Null] = js.native
    
    /**
      * Register an Array of your custom reporters.
      * @default ['basic'] | ['fancy']
      */
    var reporters: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFancy(value: Boolean): Self = StObject.set(x, "fancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFancyUndefined: Self = StObject.set(x, "fancy", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setReporter(value: Reporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporterNull: Self = StObject.set(x, "reporter", null)
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setReporters(value: js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      @scala.inline
      def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value :_*))
    }
  }
  
  /**
    * If you plan to provide your own reporter,
    * don't forget to setting fancy and basic options to false to prevent conflicts.
    * A reporter should be instance of a class or plain object and functions for special hooks.
    * It is not necessary to implement all functions, webpackbar only calls those that exists
    */
  @js.native
  trait Reporter extends StObject {
    
    var afterAllDone: js.UndefOr[ReporterContextFunc] = js.native
    
    /**
      * Called when _all_ compiles finished
      */
    var allDone: js.UndefOr[ReporterContextFunc] = js.native
    
    var beforeAllDone: js.UndefOr[ReporterContextFunc] = js.native
    
    /**
      * Called when a file changed on watch mode
      */
    var change: js.UndefOr[ReporterContextFunc] = js.native
    
    /**
      * Called when compile finished
      */
    var done: js.UndefOr[ReporterContextFunc] = js.native
    
    /**
      * Called when build progress updated
      */
    var progress: js.UndefOr[ReporterContextFunc] = js.native
    
    /**
      * Called when (re)compile is started
      */
    var start: js.UndefOr[ReporterContextFunc] = js.native
    
    /**
      * Called after each progress update
      */
    var update: js.UndefOr[ReporterContextFunc] = js.native
  }
  object Reporter {
    
    @scala.inline
    def apply(): Reporter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reporter]
    }
    
    @scala.inline
    implicit class ReporterMutableBuilder[Self <: Reporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterAllDone(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "afterAllDone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterAllDoneUndefined: Self = StObject.set(x, "afterAllDone", js.undefined)
      
      @scala.inline
      def setAllDone(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "allDone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllDoneUndefined: Self = StObject.set(x, "allDone", js.undefined)
      
      @scala.inline
      def setBeforeAllDone(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "beforeAllDone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeAllDoneUndefined: Self = StObject.set(x, "beforeAllDone", js.undefined)
      
      @scala.inline
      def setChange(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setDone(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      @scala.inline
      def setProgress(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setStart(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setUpdate(value: /* context */ WebpackBar => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /**
    * 'context' is the reference to the plugin
    * You can use 'context.state' to access status
    */
  type ReporterContextFunc = js.Function1[/* context */ WebpackBar, Unit]
  
  @js.native
  trait Status extends StObject {
    
    val color: String = js.native
    
    val details: js.Array[String] = js.native
    
    /** @default false */
    val done: Boolean = js.native
    
    /** @default false */
    val hasErrors: Boolean = js.native
    
    /** @default '' */
    val message: String = js.native
    
    val name: String = js.native
    
    /** @default -1 */
    val progress: Double = js.native
    
    val request: Null | File = js.native
    
    /** @default null */
    val start: (js.Tuple2[Double, Double]) | Null = js.native
  }
  object Status {
    
    @scala.inline
    def apply(
      color: String,
      details: js.Array[String],
      done: Boolean,
      hasErrors: Boolean,
      message: String,
      name: String,
      progress: Double
    ): Status = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], hasErrors = hasErrors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasErrors(value: Boolean): Self = StObject.set(x, "hasErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: File): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestNull: Self = StObject.set(x, "request", null)
      
      @scala.inline
      def setStart(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartNull: Self = StObject.set(x, "start", null)
    }
  }
  
  /**
    * Elegant ProgressBar and Profiler for Webpack
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProgressPlugin * / any */ @js.native
  trait WebpackBar extends StObject {
    
    val state: Status = js.native
  }
  object WebpackBar {
    
    @scala.inline
    def apply(state: Status): WebpackBar = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackBar]
    }
    
    @scala.inline
    implicit class WebpackBarMutableBuilder[Self <: WebpackBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: Status): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
