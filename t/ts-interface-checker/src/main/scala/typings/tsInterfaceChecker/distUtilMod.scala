package typings.tsInterfaceChecker

import typings.std.Error
import typings.tsInterfaceChecker.tsInterfaceCheckerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilMod {
  
  @JSImport("ts-interface-checker/dist/util", "DetailContext")
  @js.native
  open class DetailContext ()
    extends StObject
       with IContext {
    
    /**
      * Contains the context returned by fork() which should be checked until
      * completeFork() is called.
      * Will be reused for the next fork() if there are no failures.
      */
    /* private */ var _currentFork: Any = js.native
    
    /* private */ var _failed: Any = js.native
    
    /** Contexts created by fork() which have completed and contain failures */
    /* private */ var _failedForks: Any = js.native
    
    /* private */ var _messages: Any = js.native
    
    /* private */ var _propNames: Any = js.native
    
    /* private */ var _score: Any = js.native
    
    def getError(path: String): VError = js.native
    
    def getErrorDetails(path: String): js.Array[IErrorDetail] = js.native
  }
  /* static members */
  object DetailContext {
    
    @JSImport("ts-interface-checker/dist/util", "DetailContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Maximum number of errors recorded at one level for an object,
      * i.e. the maximum length of Checker.validate() or IErrorDetail.nested.
      */
    @JSImport("ts-interface-checker/dist/util", "DetailContext.maxForks")
    @js.native
    def maxForks: Double = js.native
    inline def maxForks_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxForks")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ts-interface-checker/dist/util", "NoopContext")
  @js.native
  open class NoopContext ()
    extends StObject
       with IContext
       with IUnionResolver {
    
    /* private */ var _failed: Any = js.native
    
    /* CompleteClass */
    override def createContext(): IContext = js.native
  }
  
  @JSImport("ts-interface-checker/dist/util", "VError")
  @js.native
  open class VError protected ()
    extends StObject
       with Error {
    def this(path: String, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var path: String = js.native
  }
  
  @js.native
  trait IContext extends StObject {
    
    /**
      * Must always be called after a call to fork() on the same context.
      *
      * Indicates that the checker is done with the current fork and any subsequent
      * checks on the current object will be done on a new fork.
      *
      * Returns true if the checker should keep checking the current object,
      * or false if enough failures have been noted and the checker should return now.
      *
      * If this returns false then that implies that failed() would return true,
      * although the reverse it not necessarily true.
      */
    def completeFork(): Boolean = js.native
    
    def fail(relPath: String, message: String, score: Double): `false` = js.native
    def fail(relPath: String, message: Null, score: Double): `false` = js.native
    def fail(relPath: Double, message: String, score: Double): `false` = js.native
    def fail(relPath: Double, message: Null, score: Double): `false` = js.native
    def fail(relPath: Null, message: String, score: Double): `false` = js.native
    def fail(relPath: Null, message: Null, score: Double): `false` = js.native
    
    /**
      * Returns true if any failures were recorded in this context.
      */
    def failed(): Boolean = js.native
    
    /**
      * Used only in checkers of types that may record multiple
      * parallel failures for a single object. After calling fork(), a checker must:
      *
      *
      * - Use the returned forked context instead of the original context for (potential) failures,
      *    whether it's in a deeper checker or when calling fail().
      * - After using the fork to check one 'thing' (e.g. a property or a base class), write:
      *
      *       if (!origContext.completeFork()) {
      *         return false;
      *       }
      *
      *    Always call completeFork(), regardless of whether there was a failure.
      *    Do this instead of returning directly after a failure as is done with non-forked type checkers.
      * - At the end of your checker function, `return !ctx.failed()`
      *    to check whether any failures were gathered along the way in forks.
      */
    def fork(): IContext = js.native
    
    def resolveUnion(ur: IUnionResolver): Unit = js.native
    
    def unionResolver(): IUnionResolver = js.native
  }
  
  trait IErrorDetail extends StObject {
    
    var message: String
    
    var nested: js.UndefOr[js.Array[IErrorDetail]] = js.undefined
    
    var path: String
  }
  object IErrorDetail {
    
    inline def apply(message: String, path: String): IErrorDetail = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IErrorDetail]
    }
    
    extension [Self <: IErrorDetail](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNested(value: js.Array[IErrorDetail]): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setNestedVarargs(value: IErrorDetail*): Self = StObject.set(x, "nested", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait IUnionResolver extends StObject {
    
    def createContext(): IContext
  }
  object IUnionResolver {
    
    inline def apply(createContext: () => IContext): IUnionResolver = {
      val __obj = js.Dynamic.literal(createContext = js.Any.fromFunction0(createContext))
      __obj.asInstanceOf[IUnionResolver]
    }
    
    extension [Self <: IUnionResolver](x: Self) {
      
      inline def setCreateContext(value: () => IContext): Self = StObject.set(x, "createContext", js.Any.fromFunction0(value))
    }
  }
}
