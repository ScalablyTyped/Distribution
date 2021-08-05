package typings.tslint

import typings.tslint.ruleMod.RuleFailure
import typings.tslint.walkContextMod.WalkContext
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkerWalkerMod {
  
  @JSImport("tslint/lib/language/walker/walker", "AbstractWalker")
  @js.native
  abstract class AbstractWalker[T] protected ()
    extends WalkContext[T]
       with IWalker {
    def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
    
    /* CompleteClass */
    override def getFailures(): js.Array[RuleFailure] = js.native
    
    /* CompleteClass */
    override def getSourceFile(): SourceFile = js.native
    
    /* CompleteClass */
    override def walk(sourceFile: SourceFile): Unit = js.native
  }
  
  trait IWalker extends StObject {
    
    def getFailures(): js.Array[RuleFailure]
    
    def getSourceFile(): SourceFile
    
    def walk(sourceFile: SourceFile): Unit
  }
  object IWalker {
    
    inline def apply(
      getFailures: () => js.Array[RuleFailure],
      getSourceFile: () => SourceFile,
      walk: SourceFile => Unit
    ): IWalker = {
      val __obj = js.Dynamic.literal(getFailures = js.Any.fromFunction0(getFailures), getSourceFile = js.Any.fromFunction0(getSourceFile), walk = js.Any.fromFunction1(walk))
      __obj.asInstanceOf[IWalker]
    }
    
    extension [Self <: IWalker](x: Self) {
      
      inline def setGetFailures(value: () => js.Array[RuleFailure]): Self = StObject.set(x, "getFailures", js.Any.fromFunction0(value))
      
      inline def setGetSourceFile(value: () => SourceFile): Self = StObject.set(x, "getSourceFile", js.Any.fromFunction0(value))
      
      inline def setWalk(value: SourceFile => Unit): Self = StObject.set(x, "walk", js.Any.fromFunction1(value))
    }
  }
}
