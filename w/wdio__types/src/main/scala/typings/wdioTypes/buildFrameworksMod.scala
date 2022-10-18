package typings.wdioTypes

import typings.wdioTypes.anon.Attempts
import typings.wdioTypes.anon.Duration
import typings.wdioTypes.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFrameworksMod {
  
  trait PickleResult extends StObject {
    
    /**
      * duration of scenario in milliseconds
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * error stack if scenario failed
      */
    var error: js.UndefOr[String] = js.undefined
    
    /**
      * true if scenario has passed
      */
    var passed: Boolean
  }
  object PickleResult {
    
    inline def apply(passed: Boolean): PickleResult = {
      val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickleResult]
    }
    
    extension [Self <: PickleResult](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    }
  }
  
  trait PickleStep extends StObject {
    
    /**
      * Array of line numbers
      */
    var astNodeIds: js.Array[String]
    
    /**
      * line number in the feature file
      */
    var id: String
    
    /**
      * 'Given|When|Then|And' followed by a space
      */
    var keyword: String
    
    /**
      * text of the step
      */
    var text: String
  }
  object PickleStep {
    
    inline def apply(astNodeIds: js.Array[String], id: String, keyword: String, text: String): PickleStep = {
      val __obj = js.Dynamic.literal(astNodeIds = astNodeIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickleStep]
    }
    
    extension [Self <: PickleStep](x: Self) {
      
      inline def setAstNodeIds(value: js.Array[String]): Self = StObject.set(x, "astNodeIds", value.asInstanceOf[js.Any])
      
      inline def setAstNodeIdsVarargs(value: String*): Self = StObject.set(x, "astNodeIds", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    var failed: Double
    
    var finished: Double
    
    var passed: Double
  }
  object Results {
    
    inline def apply(failed: Double, finished: Double, passed: Double): Results = {
      val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: Double): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Double): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Suite extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var file: String
    
    var fullTitle: String
    
    var parent: String
    
    var pending: Boolean
    
    var title: String
    
    var `type`: String
  }
  object Suite {
    
    inline def apply(file: String, fullTitle: String, parent: String, pending: Boolean, title: String, `type`: String): Suite = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fullTitle = fullTitle.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suite]
    }
    
    extension [Self <: Suite](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFullTitle(value: String): Self = StObject.set(x, "fullTitle", value.asInstanceOf[js.Any])
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Test
    extends StObject
       with Suite {
    
    var _currentRetry: js.UndefOr[Double] = js.undefined
    
    var _retriedTest: js.UndefOr[Any] = js.undefined
    
    var _retries: js.UndefOr[Double] = js.undefined
    
    var async: js.UndefOr[Double] = js.undefined
    
    var body: js.UndefOr[String] = js.undefined
    
    var ctx: Any
    
    /**
      * Mocha flags
      */
    var description: js.UndefOr[String] = js.undefined
    
    var fn: js.UndefOr[js.Function] = js.undefined
    
    var fullName: String
    
    var sync: js.UndefOr[Boolean] = js.undefined
    
    var timedOut: js.UndefOr[Boolean] = js.undefined
  }
  object Test {
    
    inline def apply(
      ctx: Any,
      file: String,
      fullName: String,
      fullTitle: String,
      parent: String,
      pending: Boolean,
      title: String,
      `type`: String
    ): Test = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], fullTitle = fullTitle.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    extension [Self <: Test](x: Self) {
      
      inline def setAsync(value: Double): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
      
      inline def setTimedOutUndefined: Self = StObject.set(x, "timedOut", js.undefined)
      
      inline def set_currentRetry(value: Double): Self = StObject.set(x, "_currentRetry", value.asInstanceOf[js.Any])
      
      inline def set_currentRetryUndefined: Self = StObject.set(x, "_currentRetry", js.undefined)
      
      inline def set_retriedTest(value: Any): Self = StObject.set(x, "_retriedTest", value.asInstanceOf[js.Any])
      
      inline def set_retriedTestUndefined: Self = StObject.set(x, "_retriedTest", js.undefined)
      
      inline def set_retries(value: Double): Self = StObject.set(x, "_retries", value.asInstanceOf[js.Any])
      
      inline def set_retriesUndefined: Self = StObject.set(x, "_retries", js.undefined)
    }
  }
  
  trait TestResult extends StObject {
    
    var duration: Double
    
    var error: js.UndefOr[Any] = js.undefined
    
    var exception: String
    
    var passed: Boolean
    
    var result: js.UndefOr[Any] = js.undefined
    
    var retries: Attempts
    
    var status: String
  }
  object TestResult {
    
    inline def apply(duration: Double, exception: String, passed: Boolean, retries: Attempts, status: String): TestResult = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestResult]
    }
    
    extension [Self <: TestResult](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setRetries(value: Attempts): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait World extends StObject {
    
    var pickle: Name
    
    var result: js.UndefOr[Duration] = js.undefined
  }
  object World {
    
    inline def apply(pickle: Name): World = {
      val __obj = js.Dynamic.literal(pickle = pickle.asInstanceOf[js.Any])
      __obj.asInstanceOf[World]
    }
    
    extension [Self <: World](x: Self) {
      
      inline def setPickle(value: Name): Self = StObject.set(x, "pickle", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Duration): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
